package com.pattern.simpleFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 使用了多态和继承来实现一个简单工厂类，使得添加一个操作时不用去改变原有的代码，同时也使得显示和计算分离
 */
public class GoodOperation {
    public static void main(String[] args) {
        System.out.println("请输入加减乘除表达式:如1+2");
        InputStream in=System.in;
        BufferedReader reader=new BufferedReader(new InputStreamReader(in));
        String operation=null;
        int num1=0;
        int num2=0;
        try {
            String str=reader.readLine();
            Pattern p=Pattern.compile("[[\\+\\-/\\*]\\s]+");
            Matcher matcher=p.matcher(str);
            while (matcher.find()){
                operation=matcher.group(0);
            }
            String[] result=p.split(str);
            for(int i=0;i<result.length;i++){
                num1=Integer.parseInt(result[0]);
                num2=Integer.parseInt(result[1]);
            }

            Operation operation1=SimpleOpertationFactory.getOperation(operation);
            operation1.setNum1(num1);
            operation1.setNum2(num2);
            System.out.println(operation1.getResult());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
