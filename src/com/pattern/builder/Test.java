package com.pattern.builder;

/**
 * 使用建造者模式,使得固有的建造过程与具体的产品的表现所分离，将产品的构建过程分离为统一的接口，具体细节有具体的产品来实现
 * 使用指挥者来进行真正的进行构建
 */
public class Test {
    public static void main(String[] args) {
        ProductBuilder product1=new Product1();
        ProductBuilder product2=new Product2();

        ProductDirector director=new ProductDirector();

        director.constract(product1);
        director.constract(product2);

        product1.getProduct().show();
        product2.getProduct().show();

    }
}
