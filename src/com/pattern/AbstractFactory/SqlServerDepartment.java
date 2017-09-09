package com.pattern.AbstractFactory;

/**
 * Created by Administrator on 2017/6/7.
 */
public class SqlServerDepartment implements Department{
    @Override
    public void show() {
        System.out.printf("sqlServer department±í");
    }
}
