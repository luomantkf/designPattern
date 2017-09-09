package com.pattern.bridge;

/**
 * Created by Administrator on 2017/7/14.
 */
public class PhoneSoftB implements PhoneSoft {
    @Override
    public void run() {
        System.out.println("softB");
    }
}
