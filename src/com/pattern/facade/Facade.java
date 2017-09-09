package com.pattern.facade;

/**
 * Created by Administrator on 2017/6/2.
 */
public class   Facade {
    SubSystemA systemA=new SubSystemA();
    SubSystemB systemB=new SubSystemB();
    void methodA(){
        systemA.methodA();
        systemB.methodB();
    }
    void methodB(){
        systemB.methodB();
        systemA.methodA();
    }
}
