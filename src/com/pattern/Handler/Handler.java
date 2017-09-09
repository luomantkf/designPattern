package com.pattern.Handler;

/**
 * Created by Administrator on 2017/5/19.
 */
public abstract class Handler {
    Handler handler;
    public void setSupHandler(Handler handler){
        this.handler=handler;
    }
    abstract String handlerRequest(int num);
}
