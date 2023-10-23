package com.controller;

public class AccountResult {
    private Object data;
    public Integer code;
    public String message;

    public AccountResult(Integer code, Object data,  String message) {
        this.data = data;
        this.code = code;
        this.message = message;
    }

    public AccountResult(Integer code, Object data ) {
        this.data = data;
        this.code = code;
    }

    public AccountResult() {
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }



    public Object getData() {
        return data;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
