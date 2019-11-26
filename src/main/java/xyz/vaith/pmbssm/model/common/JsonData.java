package xyz.vaith.pmbssm.model.common;

import lombok.Data;

@Data
public class JsonData {
    private Boolean result;
    private String msg;
    private Integer code = 0;
    private Object data;

    public JsonData(Boolean result) {
        this.result = result;
    }

    public static JsonData success(Object object) {
        JsonData jsonData = new JsonData(true);
        jsonData.code = 0;
        jsonData.msg = "请求成功";
        jsonData.data = object;
        return jsonData;
    }

    public static JsonData fail(Integer code, String msg) {
        JsonData jsonData = new JsonData(false);
        jsonData.msg = msg;
        jsonData.code = code;
        return jsonData;
    }
}
