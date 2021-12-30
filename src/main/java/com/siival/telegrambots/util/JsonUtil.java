package com.siival.telegrambots.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public class JsonUtil {

    public static String createJsonParams(Object params) {
        if (params!=null) {
            ObjectMapper objectMapper = new ObjectMapper();
            try {
                return objectMapper.writeValueAsString(params);
            } catch (JsonProcessingException e) {
            }
        }
        return "{}";
    }


    public static <T> T convertJsonToObject(String json,Class<T> clazz) {
        if (json==null) {
            return null;
        }
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            JsonNode respNode = objectMapper.readTree(json);
            return objectMapper.convertValue(respNode, clazz);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
