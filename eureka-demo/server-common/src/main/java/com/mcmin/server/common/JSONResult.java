package com.mcmin.server.common;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class JSONResult<T> {
    private String code;
    private String message;
    private T data;
}
