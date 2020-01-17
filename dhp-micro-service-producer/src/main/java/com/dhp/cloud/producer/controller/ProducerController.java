package com.dhp.cloud.producer.controller;

import java.util.List;

import com.dhp.cloud.producer.model.Product;
import com.dhp.cloud.producer.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ProducerController
 * @Description 生产者控制器
 * @Author DongHP
 * @Date 2019-12-22
 */
@RestController
@RequestMapping("product")
public class ProducerController {

    @Autowired
    private ProductService productService;

    @GetMapping("get/{id}")
    public Product getById(@PathVariable("id") Long id){
        return productService.getById(id);
    }

    @GetMapping("list")
    public List<Product> getProductList(){
        return productService.getProductList();
    }

    @RequestMapping(value="/add")
    public Object add(@RequestBody Product product) {
        return productService.add(product) ;
    }

}
