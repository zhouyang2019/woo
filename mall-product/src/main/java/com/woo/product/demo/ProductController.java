package com.woo.product.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    @RequestMapping("/products")
    public List<Product> products() {
        List<Product> ps = new ArrayList<>();
        ps.add(new Product(1, "product a", 50));
        ps.add(new Product(2, "product b", 150));
        ps.add(new Product(3, "product c", 250));
        return ps;
    }

}
