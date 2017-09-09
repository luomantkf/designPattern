package com.pattern.Handler;

/**
 * Created by Administrator on 2017/5/19.
 */
public class Hander2 extends Handler {
    @Override
    String  handlerRequest(int num) {
        if(num<10){
            return "manager2处理的request:"+num;
        }else {
            return handler.handlerRequest(num);
        }
    }
}
