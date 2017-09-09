package com.pattern.strategy;

/**
 * Created by Administrator on 2017/5/16.
 */
public class CashContext {
    int num=0;
    private CashSupper cs;

    public CashContext(int num,String str) {
        this.num = num;
        switch (str){
            case "¼Ó1":cs=new CashAdd(num);break;
            case "1¼õ1":cs=new CashSub(num);break;
        }
    }
    public int getResult(){
        return cs.getResult();
    }
}
