package xyz.vaith.pmbssm.service;

import java.util.List;

import xyz.vaith.pmbssm.model.SysDept;
import xyz.vaith.pmbssm.param.DeptParam;

public interface SysDeptService {
    SysDept add(DeptParam param);

    SysDept update(DeptParam param);

    boolean isExistDept(Integer parentID, String name, Integer currentId);

    String getDeptLevel(Integer deptId);

    List<SysDept> getDeptList();

    void updateDeptWithChild(SysDept before, SysDept after);
}
