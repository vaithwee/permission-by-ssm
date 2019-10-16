package xyz.vaith.permission.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xyz.vaith.permission.model.Acl;
/**
*  @author author
*/
public interface AclMapperBaseMapper {

    int insertAcl(Acl object);

    int updateAcl(Acl object);

    int update(Acl.UpdateBuilder object);

    List<Acl> queryAcl(Acl object);

    Acl queryAclLimit1(Acl object);

}