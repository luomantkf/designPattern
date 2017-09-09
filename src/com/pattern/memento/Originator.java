package com.pattern.memento;

/**
 * Created by Administrator on 2017/6/14.
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Originator(String state) {

        this.state = state;
    }

    /**
     * 将当前状态保存到备忘录类中，可以保存多个状态
     * @return
     */
    public Memento createMemeto(){
        return new Memento(state);
    }


    public void setMemento(Memento memento){
        this.state=memento.getState();
    }
}
