package com.pattern.mould;

/**
 *使用模板设计模式，提出整个算法公用的模板，形成一个算法的骨架，具体细节在子类中来实现
 */
public class TestQuestion {

    public static void main(String[] args) {
        Question stuA=new TestA();
        Question stuB=new TestB();
        stuA.questionA();
        stuB.questionA();
        stuA.questionB();
        stuB.questionB();
    }

}
