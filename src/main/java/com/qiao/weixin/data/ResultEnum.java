package com.qiao.weixin.data;

public enum ResultEnum {
    SUCCESS(200,"success"),
    ERROR(500,"ERROR"),
    UNKNOWN_ERROR(404,"unknownERROR"),
    LOGIN_ERROR(500,"login error, not sure password or account"),
    REGISTER_ERROR(500,"register error, please follow the rule")
    ;

    private int code;
    private String msg;

    ResultEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
