package com.pattern.decorator;

/**
 * Created by Administrator on 2017/5/30.
 */
public class DecoratorImp2 extends Decorator {
    //����װ�����ض��Ķ���
    private String status1;


    @Override
    public void show() {
        super.show();
        System.out.println(this.getClass().getCanonicalName());
    }
}