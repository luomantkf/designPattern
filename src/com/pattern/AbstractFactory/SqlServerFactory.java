package com.pattern.AbstractFactory;

/**
 * Created by Administrator on 2017/6/7.
 */
public class SqlServerFactory implements Factory {


    @Override
    public User createUser() {
        return new SqlServerUser();
    }

    @Override
    public Department createDepartment() {
        return new SqlServerDepartment();

    }
}
