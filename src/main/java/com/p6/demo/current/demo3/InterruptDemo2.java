package com.p6.demo.current.demo3;

import java.util.concurrent.TimeUnit;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/12/1
 */
public class InterruptDemo2 implements Runnable {

    private volatile int i = 0;

    @Override
    public void run() {

        System.out.println("进入到此方法 1");
        while (!Thread.currentThread().isInterrupted()) {
            System.out.println("进入到此方法 2");
            System.out.println("计数" + i);
            i++;
            try {
                TimeUnit.SECONDS.sleep(10);
            } catch (InterruptedException e) { // JVM层面触发了线程的复位 ---> false

                e.printStackTrace();
                // 可以不做处理
                // 继续中断
//                Thread.currentThread().interrupt();
                // 抛出异常
            }
        }

        System.out.println("processor End");
    }

    public static void main(String[] args) throws Exception {


        Thread thread = new Thread(new InterruptDemo2(), "这是我的小t线程");

        thread.start();
//        Thread.sleep(1000);
        thread.interrupt();// 有作用

    }

}
