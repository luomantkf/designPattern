package com.pattern.strategy;

/**
 * ����ģʽ(ʵ���㷨�ķ�װ),����������(��򵥹���ģʽ���)ʹ�ÿͻ��˹��ĸ��ٵ���
 */
public class GoodCash {
    public static void main(String[] args) {
        CashContext context=new CashContext(4,"��1");
        System.out.println(context.getResult());
    }
}
