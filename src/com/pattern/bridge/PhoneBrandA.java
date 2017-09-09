package com.pattern.bridge;

/**
 * Created by Administrator on 2017/7/14.
 */
public class PhoneBrandA extends PhoneBrand {
    public PhoneBrandA() {
        run();
    }

    @Override

    void run() {
        System.out.println("A品牌");
        addSoft(new PhoneSoftA());
    }
}
