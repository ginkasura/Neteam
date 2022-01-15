package org.irvine.neteam.common.utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpStatus;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author g_ban
 * @date 1/14/22
 */
public class ResultType extends HashMap<String, Object> {
    private static final long serialVersionUID = 1L;

    public ResultType() {
        put("code", 0);
        put("message", "no msg");
    }

    public ResultType setData(Object data) {
        put("data", data);
        return this;
    }

    public <T> T getData(String key, TypeReference<T> typeReference) throws IOException {
        Object data = get(key);
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(data);
        return objectMapper.readValue(json, typeReference);
    }

    public <T> T getData(TypeReference<T> typeReference) throws IOException {
        Object data = get("data");
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(data);
        return objectMapper.readValue(json, typeReference);
    }

    public static ResultType error(int code, String message) {
        return error(code, message, null);
    }

    public static ResultType error(int code, String message, Object data) {
        ResultType resultType = new ResultType();
        resultType.put("code", code);
        resultType.put("message", message);
        if (data != null) {
            resultType.put("data", data);
        }
        return resultType;
    }

    public static ResultType error(Object data) {
        return error(HttpStatus.SC_INTERNAL_SERVER_ERROR, "error", data);
    }

    public static ResultType error() {
        return error(HttpStatus.SC_INTERNAL_SERVER_ERROR, "error", null);
    }

    public static ResultType ok(int code, String message) {
        return error(code, message, null);
    }

    public static ResultType ok(int code, String message, Object data) {
        ResultType resultType = new ResultType();
        resultType.put("code", code);
        resultType.put("message", message);
        if (data != null) {
            resultType.put("data", data);
        }
        return resultType;
    }

    public static ResultType ok(Object data) {
        return error(HttpStatus.SC_OK, "success", data);
    }

    public static ResultType ok() {
        return error(HttpStatus.SC_OK, "success", null);
    }

    public ResultType addMap(Map<String, Object> map) {
        putAll(map);
        return this;
    }

    public ResultType addObject(String key, String value) {
        put(key, value);
        return this;
    }

//    public ResultType addObject(Keywords keywords, String value) {
//        put(keywords.key(), value);
//        return this;
//    }

    public Integer getCode() {
        return (Integer)this.get("code");
    }

}

