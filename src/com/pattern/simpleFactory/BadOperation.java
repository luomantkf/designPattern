package com.pattern.simpleFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 未使用简单工厂模式的代码,这会使得程序难以维护，过于紧密耦合，如果添加一个一个
 */
public class BadOperation {
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

            switch (operation){
                case "+":
                    System.out.println(num1+num2);break;
                case "-":
                    System.out.println(num1-num2);break;

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
