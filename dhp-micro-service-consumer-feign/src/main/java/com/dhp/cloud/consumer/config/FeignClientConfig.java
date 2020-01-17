package com.dhp.cloud.consumer.config;

import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName BeanConfig
 * @Description bean配置类
 * @Author DongHP
 * @Date 2019-12-22
 */
@Configuration
public class FeignClientConfig {

    @Bean
    public BasicAuthRequestInterceptor getBasicAuthRequestInterceptor() {
        return new BasicAuthRequestInterceptor("admin", "admin@12345");
    }
}
