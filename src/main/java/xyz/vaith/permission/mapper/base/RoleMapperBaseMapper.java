package xyz.vaith.permission.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xyz.vaith.permission.model.Role;
/**
*  @author author
*/
public interface RoleMapperBaseMapper {

    int insertRole(Role object);

    int updateRole(Role object);

    int update(Role.UpdateBuilder object);

    List<Role> queryRole(Role object);

    Role queryRoleLimit1(Role object);

}