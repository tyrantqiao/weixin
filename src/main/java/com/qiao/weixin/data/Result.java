package com.qiao.weixin.data;

/**
 * @author qiao
 * email tyrantqiao@icloud.com
 * 2017/9/4 23:38
 */
public class Result<T> {
    private String msg;
    private int code;
    private ResultEnum resultEnum;
    private T data;

    public Result() {
    }

    public Result(ResultEnum resultEnum) {
        this.resultEnum = resultEnum;
    }

    public Result(int code, String msg) {
        this.code=code;
        this.msg=msg;
    }

    public ResultEnum getResultEnum() {
        return resultEnum;
    }

    public void setResultEnum(ResultEnum resultEnum) {
        this.resultEnum = resultEnum;
    }

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
