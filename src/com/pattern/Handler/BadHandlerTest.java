package com.pattern.Handler;

/**
 * û��ʹ��������ģʽģʽʱ:Υ���ĵ�һְ��ԭ��Ϳ���-ԭ��
 */
public class BadHandlerTest {

    public static void main(String[] args) {
        BadHandler badHandler=new BadHandler();
        badHandler.setRequest(1);
        System.out.println(badHandler.getResult());
    }

}
