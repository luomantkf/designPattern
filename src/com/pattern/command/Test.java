package com.pattern.command;

/**
 * 使用命名模式：将一个请求封装成一个对象，从而使得请求对象参数化，同时可以更方便的对请求进行队列化以及更好的进行记录日志
 * 同时使得请求与具体的请求实现进行了分离
 */

public class Test {
    public static void main(String[] args) {

        //可以进行扩展,增加多个实现者，一个用户可以发送多个请求1
        Receiver receiver=new ReceiverImp();
        Command command=new CommandImp(receiver);
        Invoke invoke=new Invoke(command);
        invoke.invoke();
    }
}
