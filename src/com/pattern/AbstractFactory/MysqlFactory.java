package com.pattern.AbstractFactory;

/**
 * Created by Administrator on 2017/6/7.
 */
public class MysqlFactory implements Factory {


    @Override
    public User createUser() {
        return new MysqlUser();
    }

    @Override
    public Department createDepartment() {
        return new MysqlDepartment();

    }
}
