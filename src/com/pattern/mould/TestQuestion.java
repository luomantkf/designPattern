package com.pattern.mould;

/**
 *ʹ��ģ�����ģʽ����������㷨���õ�ģ�壬�γ�һ���㷨�ĹǼܣ�����ϸ������������ʵ��
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
