package com.pattern.visitor;

/**
 * Created by Administrator on 2017/7/15.
 */
public class Man implements Person {
    @Override
    public void accept(Visitor visitor) {
        visitor.manDo(this);
    }
}
