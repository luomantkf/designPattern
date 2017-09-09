package com.pattern.memento;

/**
 * Created by Administrator on 2017/6/14.
 */
public class Memento {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento(String state) {

        this.state = state;
    }
}
