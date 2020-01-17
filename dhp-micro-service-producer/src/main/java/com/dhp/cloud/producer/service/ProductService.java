package com.dhp.cloud.producer.service;

import java.util.List;

import com.dhp.cloud.producer.model.Product;

/**
 * @className ProductService
 * @Description 商品服务
 * @Author DongHP
 * @Date 2019-12-22
 */
public interface ProductService {

    /**
     * 根据商品ID获取商品信息
     * @param id 商品id
     * @return  对应的商品实体对象
     */
    Product getById(Long id);

    /**
     * 新增商品信息
     * @param product  商品对象
     * @return  新增结果
     */
    boolean add(Product product);

    /**
     * 获取商品信息列表
     * @return  所有商品信息列表
     */
    List<Product> getProductList();
}