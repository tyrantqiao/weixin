package com.qiao.weixin.utils;

import com.qiao.weixin.data.Result;
import com.qiao.weixin.data.ResultEnum;
import com.qiao.weixin.data.User;
import com.qiao.weixin.repository.UserRepository;

/**
 * @author qiao
 * email tyrantqiao@icloud.com
 * 2017/9/5 9:55
 */
public class ResultUtil {
    public static Result SUCCESS(Result result){
        result.setResultEnum(ResultEnum.SUCCESS);
        return result;
    }

    public static Result ERROR(Result result){
        result.setResultEnum(ResultEnum.ERROR);
        return result;
    }

    public static Result UNKNOWN_ERROR(Result result){
        result.setResultEnum(ResultEnum.UNKNOWN_ERROR);
        return result;
    }

    public static boolean confirm_login(String inputPassword,String dbPassword){
        return inputPassword.equals(dbPassword);
    }
}
