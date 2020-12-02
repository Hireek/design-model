package com.p6.demo.current.demo3;

/**
 * @author xxx xshlxx@126.com
 * @since 2020/12/2
 */
public class TestSleep {

    public static void main(String args[]) throws InterruptedException{
        Thread t1 = new CountThread();
        t1.start();
//        Thread.sleep(6000);
        System.out.println("即将中断阻塞");
        t1.interrupt();
    }
}
