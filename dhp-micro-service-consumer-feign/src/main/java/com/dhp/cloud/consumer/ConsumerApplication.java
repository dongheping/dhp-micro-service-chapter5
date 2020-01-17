package com.dhp.cloud.consumer;

import com.dhp.cloud.ribbon.config.ProducerRibbonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName ConsumerApplication
 * @Description 产品实体对象
 * @Author DongHP
 * @Date 2019-12-22
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "DHP-MICRO-SERVICE-PRODUCER", configuration = ProducerRibbonConfig.class)
@EnableFeignClients
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

}
