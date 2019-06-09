package com.crazyang.java8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName ThreadpoolExcutorDemo
 * @Description: TODO
 * @Author zhouyang
 * @Date 2019/6/6 下午3:28.
 */

public class ThreadpoolExcutorDemo {

    ExecutorService executor= Executors.newCachedThreadPool();


    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

//        executorService.execute();
    }
}
