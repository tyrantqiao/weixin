package com.qiao.weixin.handle;

import com.qiao.weixin.Exception.UserException;
import com.qiao.weixin.data.Result;
import com.qiao.weixin.data.ResultEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author qiao
 * email tyrantqiao@icloud.com
 * 2017/9/5 10:04
 */
@ControllerAdvice
public class ExceptionHandler {
    @org.springframework.web.bind.annotation.ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e){
        Logger logger= LoggerFactory.getLogger(ExceptionHandler.class);
        if(e instanceof UserException){
            logger.error(((UserException) e).getMessage());
            return new Result(((UserException) e).getCode(),((UserException) e).getMessage());
        }

        Result result=new Result();
        result.setCode(500);
        result.setMsg("exception:"+e.getMessage());
        logger.error("exception:"+e.getMessage());
        return result;
    }
}
