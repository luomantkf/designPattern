package com.pattern.Handler;

/**
 * ʹ��������ģʽʹ��ÿ�������л���ȥ��������,ͨ�����ü̳��ߵķ�ʽ,ʹ��������������������ȥ��ֱ������
 * ͬʱ�����ϵĽ������ȥ�����������Ľṹ��ͬʱʵ���˵���ϣ�ͬʱ�ͻ���Ҳ��֪�����Ǹ�һ��handler����������
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
