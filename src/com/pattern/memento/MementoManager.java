package com.pattern.memento;

/**
 * Created by Administrator on 2017/6/14.
 */
public class MementoManager {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
