package com.pattern.mediator;

/**
 * Created by Administrator on 2017/7/15.
 */
public class ColleagueImp1 extends Colleague {
    public ColleagueImp1(Mediator mediator) {
        super(mediator);
    }

    @Override
    void sendMsg(String str) {
        mediator.sendMsg(str,ColleagueImp1.this);
    }

    @Override
    void notify(String str) {
        System.out.println("B收到消息："+str);
    }
}
