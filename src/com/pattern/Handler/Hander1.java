package com.pattern.Handler;

/**
 * Created by Administrator on 2017/5/19.
 */
public class Hander1 extends Handler {
    @Override
    String  handlerRequest(int num) {
        if(num<0){
            return "manager1处理的request:"+num;
        }else {
             return handler.handlerRequest(num);
        }
    }
}
