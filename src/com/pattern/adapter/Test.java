package com.pattern.adapter;

/**
 * 适配器模式:适用于当两个类所做的事情相似或相同，但是接口不同，为了使得客户端调用时统一接口
 * 如：适配器持有一个需被适配的类的实例并继承目标类，在调用统一接口的时候去调用需被适配的对象
 */
public class Test {
    public static void main(String[] args) {
        Play play1=new Player1("外国人");
        Play play2=new PlayerAdapter("姚明",new Player2("姚明"));
        play1.attack();
        play2.attack();
    }
}
