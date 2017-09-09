package com.pattern.simpleFactory;

/**
 * Created by Administrator on 2017/5/15.
 */
public abstract class Operation {
    int num1;
    int num2;
    abstract int getResult();
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}
