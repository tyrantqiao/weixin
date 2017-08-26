package com.qiao.weixin.controller;

import com.qiao.weixin.algorithms.encrypt.Hash;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

/**
 * @author qiao
 * email tyrantqiao@icloud.com
 * 2017/8/24 11:26
 */
@Controller
public class WeiXinController {

    @RequestMapping(value = "/weixin", method = RequestMethod.GET)
    public String confirmWeiXin(@RequestParam String signature,
                                @RequestParam String echostr,
                                @RequestParam String timestamp,
                                @RequestParam String nonce) {
        final String token = "QiaoLion";
        String[] confirmList = new String[]{token, timestamp, nonce};
        Arrays.sort(confirmList);

        StringBuffer confirmBuffer = new StringBuffer();
        for (int i = 0; i < confirmList.length; i++) {
            confirmBuffer.append(confirmList[i]);
        }

        if (signature.equals(Hash.getSha1(confirmBuffer.toString()))) {
            System.out.println(echostr);
            return echostr;
        }
        return "";
    }

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String home(){
        return "home";
    }

}
