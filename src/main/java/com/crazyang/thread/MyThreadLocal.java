package com.crazyang.thread;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName MyThreadLocal
 * @Description: 自定义一个简易ThreadLocal
 * @Author zhouyang
 * @Date 2019/5/22 下午9:55.
 */

public class MyThreadLocal<T> {

    //基于map实现
    private Map<Thread,T> values = new HashMap<>();

    //存值
    public synchronized void set(T value){
        values.put(Thread.currentThread(),value);
    }

    //取值
    public synchronized T get(){
        return values.get(Thread.currentThread());
    }

    public static void main(String[] args) {

    }


}
