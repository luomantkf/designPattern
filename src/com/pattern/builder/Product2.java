package com.pattern.builder;

/**
 * Created by Administrator on 2017/6/7.
 */
public class Product2 implements ProductBuilder {

    private Product product=new Product();

    @Override
    public void addPart1() {
            product.add("2part1");
    }

    @Override
    public Product getProduct() {
        return product;
    }

    @Override
    public void addPart2() {
            product.add("2part2");
    }
}
