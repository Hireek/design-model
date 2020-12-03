package com.p6.demo.current.example;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/12/2
 */
public class SynchronizedDemo {

    synchronized void demo() {

    }

    synchronized static void demo2() {

    }

    Object object = new Object();

    void demo3() {

        synchronized (object) {

        }
    }
}
