package com.qiao.weixin.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.AbstractJackson2HttpMessageConverter;

import java.util.List;

/**
 * @author qiao
 * email tyrantqiao@icloud.com
 * 2017/9/5 13:44
 */
@Configuration
public class ConverterConfig {
//    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
//        for (HttpMessageConverter<?> converter : converters) {
//            if (converter instanceof AbstractJackson2HttpMessageConverter) {
//                AbstractJackson2HttpMessageConverter c = (AbstractJackson2HttpMessageConverter) converter;
//                ObjectMapper objectMapper = c.getObjectMapper();
//                objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
//            }
//        }
//
//        super.extendMessageConverters(converters);
//    }
}
