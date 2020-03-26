package com.woo.order.demo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Order {

    private int id;

    private String productName;

    private int amount;

}
