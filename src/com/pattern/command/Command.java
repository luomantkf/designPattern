package com.pattern.command;

/**
 * Created by Administrator on 2017/7/14.
 */
public abstract class Command {
    protected Receiver receiver;
    public Command(Receiver receiver){
        this.receiver=receiver;
    }
    abstract void executor();
}
