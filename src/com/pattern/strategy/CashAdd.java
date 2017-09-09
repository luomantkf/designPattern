package com.pattern.strategy;

/**
 * Created by Administrator on 2017/5/16.
 */
public class CashAdd extends CashSupper {
    public CashAdd(int num) {
        this.num=num;
    }

    @Override
    public int getResult() {
        return num+1;
    }
}
