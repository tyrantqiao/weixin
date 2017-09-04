package com.qiao.weixin.data;

/**
 * @author qiao
 * email tyrantqiao@icloud.com
 * 2017/9/4 23:38
 */
public class Result<T> {
     private String msg;
     private int code;
     private T data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
