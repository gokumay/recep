package com.ra.recep.exception;

import lombok.Data;

@Data
public class ErrorMessage {
    private String code;
    private String desc;
    private Messages messages;
    private Object data;
}
