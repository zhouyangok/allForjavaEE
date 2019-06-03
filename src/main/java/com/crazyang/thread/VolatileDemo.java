package com.crazyang.thread;

/**
 * @ClassName VolatileDemo
 * @Description: TODO
 * @Author zhouyang
 * @Date 2019/6/3 下午2:25.
 */

public class VolatileDemo extends Thread {

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    private volatile boolean isRunning = true;
    int m;


    @Override
    public void run() {
        System.out.println("进入run方法了");
        while (isRunning) {
            int a = 2;
            int b = 3;
            int c = a + b;
            m = c;
        }
        System.out.println("m = " + m);
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileDemo thread = new VolatileDemo();

        thread.start();
        Thread.sleep(1000);
        thread.setRunning(false);

        System.out.println("已经赋值为false");

    }


}
