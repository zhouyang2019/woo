package com.woo.user.demo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Order {

    private int id;

    private String productName;

    private int amount;

}
