package com.p6.demo.current;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/11/23
 */
public class Foo {

    private volatile HashMap<Integer,Integer> exist = new HashMap<>();

    public Foo() {

    }

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
    }

    public void second(Runnable printSecond) throws InterruptedException {

        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
    }

    public void third(Runnable printThird) throws InterruptedException {

        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}
