package com.dhp.cloud.producer.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @className Product
 * @Description 产品实体对象
 * @Author DongHP
 * @Date 2019-12-22
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product implements Serializable {

    private static final long serialVersionUID = -3101443287296819619L;
    /**
     * 商品id
     */
    private long id;

    /**
     * 商品名
     */
    private String name;

    /**
     * 商品描述
     */
    private String description;

    /**
     * 商品价格
     */
    private int price;

}
