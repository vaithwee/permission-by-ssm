package xyz.vaith.permission.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xyz.vaith.permission.model.Log;
/**
*  @author author
*/
public interface LogMapperBaseMapper {

    int insertLog(Log object);

    int updateLog(Log object);

    int update(Log.UpdateBuilder object);

    List<Log> queryLog(Log object);

    Log queryLogLimit1(Log object);

}