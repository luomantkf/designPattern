package com.pattern.memento;

/**
 *使用备忘录模式：捕获当前的对象的一部分状态进行对象外部的存储,方便需要恢复的时候进行恢复
 */
public class Test {

    public static void main(String[] args) {
        Originator originator=new Originator("start");
        MementoManager mm=new MementoManager();
        System.out.println(originator.getState());
        //外部储存到当前状态
        mm.setMemento(originator.createMemeto());
        originator.setState("off");
        System.out.println(originator.getState());
        //恢复状态
        originator.setMemento(mm.getMemento());
        System.out.println(originator.getState());

    }

}
