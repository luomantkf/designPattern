package com.pattern.simpleFactory;

/**
 * Created by Administrator on 2017/5/15.
 */
public class SimpleOpertationFactory {


    public static Operation getOperation(String opt){
        Operation opt1=null;
        switch (opt){
            case "+":opt1=new OperationAdd();break;
            case "-":opt1=new OperationSub();break;
        }
        return opt1;
    }

}
