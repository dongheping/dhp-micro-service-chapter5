package com.dhp.cloud.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 *
 * @ClassName ProducerApplication
 * @Description 生产者启动类
 * @Author DongHP
 * @Date 2019-12-22
 */
@SpringBootApplication
@EnableEurekaClient
public class ProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProducerApplication.class, args);
    }

}
