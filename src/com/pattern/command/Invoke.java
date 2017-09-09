package com.pattern.command;

/**
 * 调用执行类（服务员）
 */
public class Invoke {

    private Command command;

    public Invoke(Command command) {
        this.command = command;
    }
    public  void invoke(){
        command.executor();
    }

}
