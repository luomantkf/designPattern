package com.pattern.mediator;

/**
 * Created by Administrator on 2017/7/15.
 */
public interface Mediator {

    void sendMsg(String str, Colleague colleague);
}
