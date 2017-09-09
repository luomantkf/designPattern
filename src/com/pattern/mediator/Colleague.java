package com.pattern.mediator;

/**
 * Created by Administrator on 2017/7/15.
 */
public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }


    abstract void sendMsg(String str);

    abstract void notify(String str);


}
