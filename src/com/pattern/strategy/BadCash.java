package com.pattern.strategy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *����ģʽ(δ���з�װ֮ǰ)����һ��int���ͽ��в�ͬ�Ĵ���
 */
public class BadCash {
    public static void main(String[] args)throws Exception{
        int num=4;
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String type=reader.readLine();
        switch (type){
            case "��1":
                System.out.println(num+1);break;
            case "1��1":
                System.out.println(num-1);break;
        }
    }
}
