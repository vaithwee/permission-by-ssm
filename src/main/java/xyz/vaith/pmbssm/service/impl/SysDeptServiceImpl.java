package xyz.vaith.pmbssm.service.impl;

import com.google.common.base.Preconditions;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Service;
import xyz.vaith.pmbssm.enums.ResultCode;
import xyz.vaith.pmbssm.exception.PermissionException;
import xyz.vaith.pmbssm.mapper.SysDeptMapper;
import xyz.vaith.pmbssm.model.SysDept;
import xyz.vaith.pmbssm.param.DeptParam;
import xyz.vaith.pmbssm.service.SysDeptService;
import xyz.vaith.pmbssm.util.BeanValidator;
import xyz.vaith.pmbssm.util.LevelUtil;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class SysDeptServiceImpl implements SysDeptService {

    @Resource
    SysDeptMapper sysDeptMapper;

    @Override
    public SysDept add(DeptParam param) {
        BeanValidator.check(param);
        if (isExistDept(param.getParentId(), param.getName(), param.getId())) {
            ResultCode code = ResultCode.PARAM_ERROR;
            code.setMessage("exist dept name in same level");
            throw new PermissionException(code);
        }
        SysDept dept = SysDept.builder().name(param.getName()).parentId(param.getParentId()).seq(param.getSeq())
                .remark(param.getRemark())
                .level(LevelUtil.calculateLevel(getDeptLevel(param.getParentId()), param.getParentId()))
                .operator("system").operateTimer(new Date()).build();
        int result = sysDeptMapper.insertSelective(dept);
        if (result > 0) {
            return dept;
        }
        throw new PermissionException(ResultCode.SYSTEM_ERROR);
    }

    @Override
    public boolean isExistDept(Integer parentID, String name, Integer currentId) {
        return sysDeptMapper.deptCount(parentID, name, currentId) > 0;
    }

    @Override
    public String getDeptLevel(Integer deptId) {
        SysDept dept = sysDeptMapper.selectByPrimaryKey(deptId);
        if (dept == null) {
            return null;
        }
        return dept.getLevel();
    }

    @Override
    public List<SysDept> getDeptList() {

        return null;
    }

    @Override
    public SysDept update(DeptParam param) {
        BeanValidator.check(param);
        if (isExistDept(param.getParentId(), param.getName(), param.getId())) {
            ResultCode code = ResultCode.PARAM_ERROR;
            code.setMessage("exist dept name in same level");
            throw new PermissionException(code);
        }
        SysDept before = sysDeptMapper.selectByPrimaryKey(param.getId());
        Preconditions.checkNotNull(before, "dept is not exist");
        SysDept after = SysDept.builder().id(param.getId()).name(param.getName()).parentId(param.getParentId()).seq(param.getSeq()).remark(param.getRemark()).build();
        after.setLevel(LevelUtil.calculateLevel(getDeptLevel(param.getParentId()), param.getParentId()));
        after.setOperator("system");
        after.setOperateTimer(new Date());
        updateDeptWithChild(before, after);
        return after;
    }

    @Override
    public void updateDeptWithChild(SysDept before, SysDept after) {
        String newLevel = after.getLevel();
        String oldLevel = before.getLevel();
        if (!newLevel.equals(oldLevel)) {
            List<SysDept> list = sysDeptMapper.getChildDeptListByLevel(oldLevel);
            if (CollectionUtils.isNotEmpty(list)) {
                for (SysDept dept : list) {
                    String level = dept.getLevel();
                    if (level.indexOf(oldLevel) == 0) {
                        level = newLevel + level.substring(oldLevel.length());
                        dept.setLevel(level);
                    }
                }
                sysDeptMapper.batchUpdateDeptLevel(list);
            }
        }
        sysDeptMapper.updateByPrimaryKey(after);
    }
}
