package com.pattern.strategy;

/**
 * 策略模式(实现算法的封装),运用上下文(与简单工厂模式相比)使得客户端关心更少的类
 */
public class GoodCash {
    public static void main(String[] args) {
        CashContext context=new CashContext(4,"加1");
        System.out.println(context.getResult());
    }
}
