package com.hanifiamdev.springcreational.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void testBuilder() {
        Product iphone = Product.builder()
                .id("P0001")
                .name("iPhone")
                .sku("XXX")
                .price(20_000_000L)
                .build();

        System.out.println(iphone);
    }
}
