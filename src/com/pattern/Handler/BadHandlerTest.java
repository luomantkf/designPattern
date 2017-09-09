package com.pattern.Handler;

/**
 * 没用使用责任链模式模式时:违背的单一职责原则和开闭-原则
 */
public class BadHandlerTest {

    public static void main(String[] args) {
        BadHandler badHandler=new BadHandler();
        badHandler.setRequest(1);
        System.out.println(badHandler.getResult());
    }

}
