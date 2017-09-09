package com.pattern.command;

/**
 * Created by Administrator on 2017/7/14.
 */
public class CommandImp extends Command{
    public CommandImp(Receiver receiver) {
        super(receiver);
    }

    @Override
    void executor() {
        System.out.println("烤肉的命令");
        receiver.action();
    }
}
