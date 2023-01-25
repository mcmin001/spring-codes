package com.mcmin.server.common;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
public class JSONResult<T> {
    public static final String SUCCESS_CODE = "200";
    private String code;
    private String message;
    private T data;

    public JSONResult(){}

    public JSONResult(String code, String message, T data){
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
