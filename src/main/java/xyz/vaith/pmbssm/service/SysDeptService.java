package xyz.vaith.pmbssm.service;

import xyz.vaith.pmbssm.model.SysDept;
import xyz.vaith.pmbssm.param.DeptParam;

public interface SysDeptService {
    SysDept add(DeptParam param);
    boolean isExistDept(Integer parentID, String name, Integer currentId);
    String getDeptLevel(Integer deptId);
}
