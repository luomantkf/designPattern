package com.pattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/6/7.
 */
public class Product1 implements ProductBuilder {

    private Product product=new Product();

    @Override
    public void addPart1() {
            product.add("1part1");
    }

    @Override
    public Product getProduct() {
        return product;
    }

    @Override
    public void addPart2() {
            product.add("1part2");
    }
}
