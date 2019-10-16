package xyz.vaith.permission.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xyz.vaith.permission.model.AclModule;
/**
*  @author author
*/
public interface AclModuleMapperBaseMapper {

    int insertAclModule(AclModule object);

    int updateAclModule(AclModule object);

    int update(AclModule.UpdateBuilder object);

    List<AclModule> queryAclModule(AclModule object);

    AclModule queryAclModuleLimit1(AclModule object);

}