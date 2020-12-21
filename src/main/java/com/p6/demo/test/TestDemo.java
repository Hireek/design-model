package com.p6.demo.test;

import org.openjdk.jol.info.ClassLayout;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/12/14
 */
public class TestDemo {

    public static void main(String[] args) {

        TestDemo testDemo = new TestDemo();

        Thread t1 = new Thread(() -> {

            synchronized (testDemo) {

                System.out.println("t1 locking");
            }
        });

        System.out.println(ClassLayout.parseInstance(testDemo).toPrintable());
        t1.start();

        synchronized (testDemo) {

            System.out.println("main locking");
            System.out.println(ClassLayout.parseInstance(testDemo).toPrintable());
        }

    }
}
