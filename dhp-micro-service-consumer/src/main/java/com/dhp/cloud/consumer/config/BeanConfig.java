package com.dhp.cloud.consumer.config;

import java.nio.charset.Charset;
import java.util.Base64;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName BeanConfig
 * @Description bean配置类
 * @Author DongHP
 * @Date 2019-12-22
 */
@Component
public class BeanConfig {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(ClientHttpRequestFactory factory) {
        return new RestTemplate(factory);
    }

    @Bean
    public ClientHttpRequestFactory simpleClientHttpRequestFactory() {
        SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
        factory.setReadTimeout(5000);
        factory.setConnectTimeout(5000);
        return factory;
    }

    @Bean
    public HttpHeaders getHeaders() {
        HttpHeaders headers = new HttpHeaders();
        byte[] encodedAuth = Base64.getEncoder()
            .encode("admin:admin@12345".getBytes(Charset.forName("US-ASCII")));
        headers.set("Authorization", "Basic " + new String(encodedAuth));
        return headers;
    }

    //@Bean
    //public IRule ribbonRule() { // 其中IRule就是所有规则的标准
    //    // 随机的访问策略
    //    return new com.netflix.loadbalancer.RandomRule();
    //}
}
