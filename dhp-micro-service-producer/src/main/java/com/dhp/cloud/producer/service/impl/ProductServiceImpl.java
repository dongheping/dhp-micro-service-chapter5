package com.dhp.cloud.producer.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.dhp.cloud.producer.model.Product;
import com.dhp.cloud.producer.service.ProductService;
import org.springframework.stereotype.Service;

/**
 * @ClassName ProductServiceImpl
 * @Description 商品服务实现类,使用map模拟数据库操作
 * @Author DongHP
 * @Date 2019-12-22
 */
@Service
public class ProductServiceImpl implements ProductService {

    private static Map<Long,Product> productMap;

    static {
        productMap = new HashMap<>(20);
        addProducts();
    }
    private static void addProducts() {
        String[] names = {"iPhone 11","华为 P30","华为P30 pro","华为mate30 pro","小米9","producer3"};
        for (int i = 0; i < names.length; i++) {
            Product product = Product.builder().id(i+1).name(names[i]).description("this is " + names[i]).price(5288).build();
            productMap.put(product.getId(),product);
        }
    }
    @Override
    public Product getById(Long id) {
        return productMap.get(id);
    }
    @Override
    public boolean add(Product product) {
        productMap.put(product.getId(),product);
        return true;
    }
    @Override
    public List<Product> getProductList() {
        List<Product> list = new ArrayList<>();
        productMap.forEach((key, value) -> list.add(value));
        return list;
    }
}
