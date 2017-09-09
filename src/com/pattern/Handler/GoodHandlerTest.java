package com.pattern.Handler;

/**
 * 使用责任链模式使得每个对象都有机会去处理请求,通过设置继承者的方式,使这个请求按照这个链请求下去，直到处理
 * 同时该链上的结点无需去关心整个链的结构，同时实现了低耦合，同时客户端也不知道是那个一个handler处理了请求
 */
public class GoodHandlerTest {
    public static void main(String[] args) {
        Handler handler1=new Hander1();
        Handler handler2=new Hander2();
        Handler handler3=new Hander3();
        handler1.setSupHandler(handler2);
        handler2.setSupHandler(handler3);
        int[] request1=new int[]{1,2,12,-1};
        for (int i:request1){
            System.out.println(handler1.handlerRequest(i));
        }

    }
}
