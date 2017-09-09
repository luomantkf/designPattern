package com.pattern.AbstractFactory;

/**
 * ʹ�ó��󹤳�ģʽ�������ڶ����Ʒ,��������Ҫ�����һ���������ݿ�ʱ��ֻ�������һ����Ӧ���͵Ĺ�������ʵ�ֶ�Ӧ����
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
