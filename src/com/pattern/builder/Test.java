package com.pattern.builder;

/**
 * ʹ�ý�����ģʽ,ʹ�ù��еĽ�����������Ĳ�Ʒ�ı��������룬����Ʒ�Ĺ������̷���Ϊͳһ�Ľӿڣ�����ϸ���о���Ĳ�Ʒ��ʵ��
 * ʹ��ָ���������������Ľ��й���
 */
public class Test {
    public static void main(String[] args) {
        ProductBuilder product1=new Product1();
        ProductBuilder product2=new Product2();

        ProductDirector director=new ProductDirector();

        director.constract(product1);
        director.constract(product2);

        product1.getProduct().show();
        product2.getProduct().show();

    }
}
