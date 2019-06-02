package com.crazyang.thread;

/**
 * @ClassName ThreadDead
 * @Description: 死锁的实现，a，b都在等待对方释放锁
 * @Author zhouyang
 * @Date 2019/5/31 下午4:37.
 */

public class ThreadDead {

    public static void main(String[] args) {
        final Object a = new Object();
        final Object b = new Object();
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (a){
                    try {
                        System.out.println("now a is running");
                        Thread.sleep(1000);
                        synchronized (b){
                            System.out.println("b want to running");
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        });

        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (b){
                    try {
                        System.out.println("now b is running");
                        Thread.sleep(1000);
                        synchronized (a){
                            System.out.println("a want to running");
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        threadA.start();
        threadB.start();
    }
}
