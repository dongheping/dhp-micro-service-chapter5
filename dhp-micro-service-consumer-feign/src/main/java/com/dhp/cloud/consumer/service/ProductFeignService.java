package com.dhp.cloud.consumer.service;

import java.util.List;

import com.dhp.cloud.consumer.config.FeignClientConfig;
import com.dhp.cloud.consumer.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName ProductFeignService
 * @Description 调用producer服务的feign接口
 * @Author DongHP
 * @Date 2020-01-18
 */
@FeignClient(name = "DHP-MICRO-SERVICE-PRODUCER",configuration = FeignClientConfig.class)
public interface ProductFeignService {

    /**
     * 使用feign调用producer获取单个商品
     * @param id 商品id
     * @return  对应商品
     */
    @RequestMapping("/product/get/{id}")
    Product getById(@PathVariable("id") long id);

    /**
     * 使用feign调用producer获取所有商品
     * @return  商品列表
     */
    @RequestMapping("/product/list")
    List<Product> getProductList();
}
