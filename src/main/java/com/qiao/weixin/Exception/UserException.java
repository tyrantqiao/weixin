package com.qiao.weixin.Exception;

import com.qiao.weixin.data.ResultEnum;

/**
 * @author qiao
 * email tyrantqiao@icloud.com
 * 2017/9/5 10:22
 */
public class UserException extends RuntimeException{
    private int code;

    public UserException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public UserException(int code, String msg) {
        super(msg);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

}
