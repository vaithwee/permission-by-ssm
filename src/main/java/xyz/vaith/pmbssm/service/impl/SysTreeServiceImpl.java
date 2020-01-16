package xyz.vaith.pmbssm.service.impl;

import com.google.common.collect.ArrayListMultimap;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.ComparatorUtils;
import org.apache.commons.collections4.MultiMap;
import org.springframework.stereotype.Service;
import xyz.vaith.pmbssm.dto.DeptLevelDto;
import xyz.vaith.pmbssm.mapper.SysDeptMapper;
import xyz.vaith.pmbssm.model.SysDept;
import xyz.vaith.pmbssm.service.SysTreeService;
import xyz.vaith.pmbssm.util.LevelUtil;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class SysTreeServiceImpl implements SysTreeService {

    @Resource
    SysDeptMapper sysDeptMapper;

    @Override
    public List<DeptLevelDto> getDeptTree() {
        List<SysDept> deptList = sysDeptMapper.getAllDept();
        List<DeptLevelDto> dtoList = new ArrayList<>();
        for (SysDept dept : deptList) {
            DeptLevelDto dto = DeptLevelDto.adapt(dept);
            dtoList.add(dto);
        }
        return deptListToTree(dtoList);
    }

    public List<DeptLevelDto> deptListToTree(List<DeptLevelDto> deptLevelDtoList) {
        if (CollectionUtils.isEmpty(deptLevelDtoList)) {
            return new ArrayList<>();
        }
        ArrayListMultimap<String, DeptLevelDto> multimap = ArrayListMultimap.create();
        ArrayList<DeptLevelDto> rootList = new ArrayList<>();
        for (DeptLevelDto dto : deptLevelDtoList) {
            multimap.put(dto.getLevel(), dto);
            if (LevelUtil.ROOT.equals(dto.getLevel())) {
                rootList.add(dto);
            }
        }
        Collections.sort(rootList, Comparator.comparingInt(SysDept::getSeq));
        transformDeptTree(rootList, LevelUtil.ROOT, multimap);
        return rootList;
    }

    public void transformDeptTree(List<DeptLevelDto> root, String level, ArrayListMultimap<String, DeptLevelDto> levelMap) {
        for (int i = 0; i < root.size(); ++i) {
            DeptLevelDto dto = root.get(i);
            String nextLevel = LevelUtil.calculateLevel(level, dto.getId());
            List<DeptLevelDto> temp = levelMap.get(nextLevel);
            if (CollectionUtils.isNotEmpty(temp)) {
                Collections.sort(temp, Comparator.comparingInt(SysDept::getSeq));
                dto.setDeptList(temp);
                transformDeptTree(temp, nextLevel, levelMap);
            }
        }
    }

}
