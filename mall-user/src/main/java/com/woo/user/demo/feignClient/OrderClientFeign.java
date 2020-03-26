package com.woo.user.demo.feignClient;

import com.woo.user.demo.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "MALL-ORDER")
public interface OrderClientFeign {

    @GetMapping("/orders")
    List<Order> listOrder();

}
