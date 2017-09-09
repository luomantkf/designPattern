package com.pattern.AbstractFactory;

/**
 * 使用抽象工厂模式，多用于多个产品,当我们需要在添加一个其他数据库时，只需在添加一个对应类型的工厂，并实现对应的类
 */
public class Test {

    public static void main(String[] args) {
        User user=null;
        Department department=null;
        Factory factory1=new SqlServerFactory();
        user=factory1.createUser();
        department=factory1.createDepartment();
        user.show();
        department.show();
        Factory factory2=new MysqlFactory();
        user=factory2.createUser();
        department=factory2.createDepartment();
        user.show();
        department.show();
    }
}
