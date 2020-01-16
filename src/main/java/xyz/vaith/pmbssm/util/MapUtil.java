package xyz.vaith.pmbssm.util;

import org.apache.commons.collections4.MapUtils;

import java.util.Map;

public class MapUtil {
    public static String toJsonString(Map map) {
        if (MapUtils.isEmpty(map)) {
            return null;
        }
        String json = "";
        for (Object o : map.entrySet()) {
            json += o.toString();
        }
        return json;
    }
}
