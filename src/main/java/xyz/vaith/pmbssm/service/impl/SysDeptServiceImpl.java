package xyz.vaith.pmbssm.service.impl;

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
        return false;
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
    public List<SysDept> getDetpList() {
      
        return null;
    }

    
}
