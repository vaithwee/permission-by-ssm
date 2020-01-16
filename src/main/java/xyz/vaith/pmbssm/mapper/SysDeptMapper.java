package xyz.vaith.pmbssm.mapper;

import org.apache.ibatis.annotations.Param;
import xyz.vaith.pmbssm.model.SysDept;

import java.util.List;

public interface SysDeptMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysDept record);

    int insertSelective(SysDept record);

    SysDept selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysDept record);

    int updateByPrimaryKey(SysDept record);

    List<SysDept> getAllDept();

    List<SysDept> getChildDeptListByLevel(String level);

    void batchUpdateDeptLevel(@Param("deptList") List<SysDept> deptList);

    int deptCount(@Param("parentId") Integer parentId, @Param("name") String name, @Param("id") Integer id);
}