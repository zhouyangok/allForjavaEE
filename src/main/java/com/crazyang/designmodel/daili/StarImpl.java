package com.crazyang.designmodel.daili;

/**
 * @ClassName StarImpl
 * @Description: TODO
 * @Author zhouyang
 * @Date 2019/5/31 上午9:12.
 */

public class StarImpl implements Subject{
    @Override
    public void say() {
        System.out.println("我是接口实现类，我想说点什么："+ getClass().getSimpleName());
    }
}
