package com.pattern.decorator;

/**
 * װ����ģʽ,��һ���Ĺ��ܽ�����ȡ������Ҫ��ʱ����ͨ����Ӿ���Ĺ�������������չ
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
