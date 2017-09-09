package com.pattern.command;

/**
 * Created by Administrator on 2017/7/14.
 */
public class ReceiverImp implements Receiver {
    @Override
    public void action() {
        System.out.printf("烤肉");
    }
}
