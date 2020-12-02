package com.p6.demo.current.status;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/12/1
 */
public class InterruptDemo implements Runnable{

    private int i = 1;
    @Override
    public void run() {

        // Thread.currentThread().isInterrupted()
        // 表示一个中断标志，默认为false
        while (!Thread.currentThread().isInterrupted()) {

            System.out.println("Test:" + i ++);
        }
    }

    public static void main(String[] args) {


        Thread thread = new Thread(new InterruptDemo());

        thread.start();

        thread.interrupt(); // 设置interrupted = true
    }
}
