package com.pattern.visitor;

import javax.lang.model.util.ElementScanner6;

/**
 * 使用访问者模式：适用于数据结构相对稳定，当个结点进行变化的系统
 */
public class Test {
    public static void main(String[] args) {
        ObjectStruction os=new ObjectStruction();
        os.addPerson(new Women());
        os.addPerson(new Man());
        os.dispatch(new Success());

        new ElementScanner6<Void,Void>();

    }



}
