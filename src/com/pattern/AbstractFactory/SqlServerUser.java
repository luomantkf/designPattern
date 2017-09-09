package com.pattern.AbstractFactory;

/**
 * Created by Administrator on 2017/6/7.
 */
public class SqlServerUser implements User  {
    @Override
    public void show() {
        System.out.println("sqlServer user表");
    }
}
