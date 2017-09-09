package com.pattern.visitor;

/**
 * Created by Administrator on 2017/7/15.
 */
public class Success implements Visitor {
    @Override
    public void manDo(Man man) {
        System.out.println("man  do success");
    }

    @Override
    public void womenDo(Women women) {
        System.out.println("women do success");
    }
}
