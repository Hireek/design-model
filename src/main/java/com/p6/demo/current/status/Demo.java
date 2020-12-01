package com.p6.demo.current.status;

import java.util.concurrent.TimeUnit;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/11/30
 */
public class Demo {

    public static void main(String[] args) {


        new Thread(() -> {

            while (true) {

                try {
                    // 阻塞操作
                    TimeUnit.SECONDS.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"status_01_block").start(); // 阻塞

        new Thread(() -> {

            while (true) {

                synchronized (Demo.class) {

                    try {

                        // 阻塞操作
                        Demo.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        },"status_02_block").start(); // 阻塞

        new Thread(new BlockedDemo(), "block-demo-01").start();
        new Thread(new BlockedDemo(), "block-demo-02").start();

    }


    static class BlockedDemo extends Thread {

        @Override
        public void run() {

            synchronized (BlockedDemo.class) {

                while (true) {
                    try {
                        TimeUnit.SECONDS.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
