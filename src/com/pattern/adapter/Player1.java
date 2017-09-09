package com.pattern.adapter;

/**
 * Created by Administrator on 2017/6/12.
 */
public class Player1 extends Play{
    public Player1(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("外国球员攻击");
    }

    @Override
    public void defense() {
        System.out.println("外国球员防守");
    }
}
