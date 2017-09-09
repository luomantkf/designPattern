package com.pattern.strategy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *策略模式(未进行封装之前)：对一个int类型进行不同的处理
 */
public class BadCash {
    public static void main(String[] args)throws Exception{
        int num=4;
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String type=reader.readLine();
        switch (type){
            case "加1":
                System.out.println(num+1);break;
            case "1减1":
                System.out.println(num-1);break;
        }
    }
}
