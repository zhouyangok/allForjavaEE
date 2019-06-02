package com.crazyang.designmodel.daili;

/**
 * @ClassName TestProxy
 * @Description: TODO
 * @Author zhouyang
 * @Date 2019/5/31 上午9:14.
 */

public class TestProxy {

    public static void main(String[] args) {
        Subject subject = new StarImpl();
        SubjecgProxy subjecgProxy = new SubjecgProxy(subject);
        subjecgProxy.say();
    }
}
