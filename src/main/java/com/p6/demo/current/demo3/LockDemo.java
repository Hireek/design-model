package com.p6.demo.current.demo3;

import org.openjdk.jol.info.ClassLayout;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/12/3
 */
public class LockDemo {

    public static void main(String[] args) throws InterruptedException {


        LockDemo lockDemo = new LockDemo();

        Thread t1 = new Thread(() -> {

            synchronized (lockDemo) {

                System.out.println("t1抢占到锁");
                System.out.println(ClassLayout.parseInstance(lockDemo).toPrintable());
            }
        });

        t1.start();

//        Thread.sleep(10000);

        synchronized (lockDemo) {

            System.out.println("Main 抢占锁");
            System.out.println(ClassLayout.parseInstance(lockDemo).toPrintable());
        }
    }
}
