package com.dhp.cloud.consumer.controller;

import java.util.List;

import com.dhp.cloud.consumer.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName ConsumerController
 * @Description 消费者控制器
 * @Author DongHP
 * @Date 2019-12-22
 */
@RestController
@RequestMapping("consumer")
public class ConsumerController {

    //private static final String GET_PRODUCT_ID_URL = "http://localhost:7001/product/get/";
    //private static final String GET_PRODUCT_LIST_URL = "http://localhost:7001/product/list";
    private static final String GET_PRODUCT_ID_URL = "http://DHP-MICRO-SERVICE-PRODUCER/product/get/";
    private static final String GET_PRODUCT_LIST_URL = "http://DHP-MICRO-SERVICE-PRODUCER/product/list";

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private HttpHeaders httpHeaders;

    //@GetMapping("get/product/{id}")
    //public Product getById(@PathVariable("id") Long id) {
    //    return restTemplate.getForObject(GET_PRODUCT_ID_URL + id,Product.class);
    //}
    //
    //@GetMapping("list/product")
    //public List<Product> getProductList() {
    //    return restTemplate.getForObject(GET_PRODUCT_LIST_URL,List.class);
    //}

    @GetMapping("get/product/{id}")
    public Product getById(@PathVariable("id") Long id) {
        return restTemplate.exchange(GET_PRODUCT_ID_URL + id, HttpMethod.GET,new HttpEntity<>(httpHeaders),
            Product.class).getBody();
    }

    @GetMapping("list/product")
    public List<Product> getProductList() {
        return restTemplate.exchange(GET_PRODUCT_LIST_URL,HttpMethod.GET,
            new HttpEntity<>(httpHeaders), List.class).getBody();
    }
}
