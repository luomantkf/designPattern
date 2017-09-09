package com.pattern.visitor;

/**
 * Created by Administrator on 2017/7/15.
 */
public class Women implements Person {
    @Override
    public void accept(Visitor visitor) {
        visitor.womenDo(this);
    }
}
