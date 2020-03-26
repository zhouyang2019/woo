package com.woo.user.demo;

import com.woo.user.demo.feignClient.OrderClientFeign;
import com.woo.user.demo.feignClient.ProductClientFeign;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private Environment env;

    @Autowired
    private ProductClientFeign productClientFeign;
    @Autowired
    private OrderClientFeign orderClientFeign;

    @GetMapping("/products")
    public List<Product> listProduct() {
        return productClientFeign.listProduct();
    }

    @GetMapping("/orders")
    public List<Order> listOrder() {
        return orderClientFeign.listOrder();
    }

    @GetMapping("/prop-key/{propKey}")
    public String getPropVal(@PathVariable("propKey") String propKey) {
        log.info("proKey is: {}", propKey);
        return env.getProperty(propKey);
    }

}
