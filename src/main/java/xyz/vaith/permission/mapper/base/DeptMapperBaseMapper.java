package xyz.vaith.permission.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xyz.vaith.permission.model.Dept;
/**
*  @author author
*/
public interface DeptMapperBaseMapper {

    int insertDept(Dept object);

    int updateDept(Dept object);

    int update(Dept.UpdateBuilder object);

    List<Dept> queryDept(Dept object);

    Dept queryDeptLimit1(Dept object);

}