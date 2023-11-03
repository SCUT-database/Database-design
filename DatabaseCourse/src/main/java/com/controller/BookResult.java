package com.controller;

public class BookResult {
    private Object data;
    public Integer code;
    public String message;

    public BookResult(Integer code,Object data ) {
        this.data = data;
        this.code = code;
    }

    public BookResult(Integer code, Object data,  String message) {
        this.data = data;
        this.code = code;
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
