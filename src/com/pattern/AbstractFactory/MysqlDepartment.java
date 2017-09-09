package com.pattern.AbstractFactory;

/**
 * Created by Administrator on 2017/6/7.
 */
public class MysqlDepartment implements Department{
    @Override
    public void show() {
        System.out.printf("mysql department±í");
    }
}
