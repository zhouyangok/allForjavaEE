package com.crazyang.designmodel.daili;

/**
 * @ClassName SubjecgProxy
 * @Description: TODO
 * @Author zhouyang
 * @Date 2019/5/31 上午9:13.
 */

public class SubjecgProxy implements Subject {

    private Subject subject;

    public SubjecgProxy(Subject subject1) {
        this.subject = subject1;
    }


    @Override
    public void say() {
        subject.say();
    }
}
