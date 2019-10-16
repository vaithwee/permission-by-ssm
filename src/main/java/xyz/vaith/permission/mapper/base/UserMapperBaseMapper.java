package xyz.vaith.permission.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xyz.vaith.permission.model.User;
/**
*  @author author
*/
public interface UserMapperBaseMapper {

    int insertUser(User object);

    int updateUser(User object);

    int update(User.UpdateBuilder object);

    List<User> queryUser(User object);

    User queryUserLimit1(User object);

}