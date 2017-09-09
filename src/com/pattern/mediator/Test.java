package com.pattern.mediator;

/**
 *使用中介者模式：减少了具体对象之间的耦合，使得对象之间无需关注之间的行为，用中介类来进行对象之间的交互，缺点是你中介类需要了解所有的对象，使得中介类更加复杂
 */
public class Test {
    public static void main(String[] args) {
        Mediator mediator=new MediatorImp();
        Colleague colleague=new ColleagueImp(mediator);
        Colleague colleague1=new ColleagueImp1(mediator);
        colleague.sendMsg("zz");
    }
}
