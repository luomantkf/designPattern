package com.pattern.Flyweight;

/**
 * 享员模式：当应用使用大量对象造成存储消耗大量开销时使用，可以提出外部状态封装成对象，将对象的相同状态封装成对象用于共享
 */
public class Test {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory=new FlyweightFactory();
        Flyweight flyweight=flyweightFactory.getFlyweight("中国", new User("zz"));
        Flyweight flyweight1=flyweightFactory.getFlyweight("中国", new User("zz1"));
        Flyweight flyweight2=flyweightFactory.getFlyweight("中国1", new User("zz11"));
        flyweight.show();
        flyweight1.show();
        flyweight2.show();
    }
}
