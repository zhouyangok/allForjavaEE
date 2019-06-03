package com.crazyang.thread;

/**
 * @ClassName VolatileDemo2
 * @Description: TODO
 * @Author zhouyang
 * @Date 2019/6/3 下午2:48.
 */

public class VolatileDemo2 extends Thread {

    private volatile int count = 0;

    @Override
    public void run() {
        addCount();
    }

    public synchronized void addCount() {
        for (int i = 0; i < 1000; i++) {
            count = i;
            if (i == 50) {
                try {
                    Thread.sleep(1000);
                    System.out.println("休息一下");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("count=" + count + ",");
    }

    public static void main(String[] args) {
        VolatileDemo2[] threads = new VolatileDemo2[100];

        for (int i = 0; i < 100; i++) {
            threads[i] = new VolatileDemo2();
        }

        for (int i = 0; i < 100; i++) {
            threads[i].start();
        }

    }
}
