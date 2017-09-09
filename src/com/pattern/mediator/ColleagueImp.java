package com.pattern.mediator;

/**
 * Created by Administrator on 2017/7/15.
 */
public class ColleagueImp extends Colleague {
    @Override
    void sendMsg(String str) {
        mediator.sendMsg(str,ColleagueImp.this);
    }

    public ColleagueImp(Mediator mediator) {
        super(mediator);
    }

    @Override
    void notify(String str) {
        System.out.println("A收到消息："+str);
    }
}
