package com.pattern.adapter;

/**
 * Created by Administrator on 2017/6/12.
 */
public class Player2 {
    private String name;

    public Player2(String name) {
        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void cattack(){
        System.out.println("需要翻译的攻击");
    }
    public void cDefense(){
        System.out.println("需要翻译的防守");
    }
}
