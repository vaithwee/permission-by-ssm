package xyz.vaith.pmbssm.model.common;

import lombok.Data;
import xyz.vaith.pmbssm.enums.ResultCode;

import java.util.HashMap;
import java.util.Map;

@Data
public class JsonData {
    private Boolean result;
    private String msg;
    private Integer code = ResultCode.SUCCESS.getCode();
    private Object data;

    public JsonData(Boolean result) {
        this.result = result;
    }

    public static JsonData success(Object object) {
        JsonData jsonData = new JsonData(true);
        jsonData.code = ResultCode.SUCCESS.getCode();
        jsonData.msg = ResultCode.SUCCESS.msg();
        jsonData.data = object;
        return jsonData;
    }

    public static JsonData fail(ResultCode code) {
        JsonData jsonData = new JsonData(false);
        jsonData.msg = code.msg();
        jsonData.code = code.getCode();
        return jsonData;
    }

    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("result", this.result);
        map.put("code", this.code);
        map.put("msg", this.msg);
        map.put("data", this.data);
        return map;
    }
}
