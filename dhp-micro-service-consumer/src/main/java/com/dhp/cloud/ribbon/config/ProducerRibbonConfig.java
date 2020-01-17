package com.dhp.cloud.ribbon.config;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;

/**
 * @ClassName ProducerRibbonConfig
 * @Description 个性化定制producer服务的负载均衡策略
 * @Author DongHP
 * @Date 2020-01-17
 */
public class ProducerRibbonConfig {
    @Bean
    public IRule ribbonRule() { // 其中IRule就是所有规则的标准
        // 随机的访问策略
        return new com.netflix.loadbalancer.RandomRule();
    }
}
