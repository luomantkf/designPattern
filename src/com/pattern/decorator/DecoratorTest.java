package com.pattern.decorator;

/**
 * 装饰者模式,将一个的功能进行提取，在需要的时候再通过添加具体的功能类来进行扩展
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Person person=new Person("zhang");
        Decorator decorator1=new DecoratorImp1();
        Decorator decorator2=new DecoratorImp2();
        decorator1.setPerson(person);
        decorator2.setPerson(decorator1);
        decorator2.show();
    }
}
