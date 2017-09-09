package com.pattern.adapter;

/**
 * Created by Administrator on 2017/6/12.
 */
public abstract class Play {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public Play(String name) {

        this.name = name;
    }

    public abstract void attack();
    public abstract void defense();
}
