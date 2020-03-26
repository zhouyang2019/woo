package com.woo.order.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OrderController {

    @RequestMapping("/orders")
    public List<Order> products() {
        List<Order> ps = new ArrayList<>();
        ps.add(new Order(1, "order a", 50));
        ps.add(new Order(2, "order b", 150));
        ps.add(new Order(3, "order c", 250));
        return ps;
    }

}
