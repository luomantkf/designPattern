package com.pattern.AbstractFactory;

/**
 * Created by Administrator on 2017/6/7.
 */
public class MysqlUser implements User  {
    @Override
    public void show() {
        System.out.println("mysql user表");
    }
}
