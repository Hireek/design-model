package com.p6.demo.current.demo3.demo;

import lombok.SneakyThrows;

import java.util.Queue;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/12/3
 */
public class Product implements Runnable{

    private Queue<String> msg;

    private int maxSize;

    public Product(Queue<String> msg, int maxSize) {

        this.msg = msg;
        this.maxSize = maxSize;
    }

    @SneakyThrows
    @Override
    public void run() {

        int i = 0;

        while (true) {

            i ++;

            synchronized (msg) {

                while (msg.size() == maxSize) { // 仓库满了

                    msg.wait();
                }
                Thread.sleep(1000);
                System.out.println("我是小生产者，生产了一条消息~");
                msg.add("生产消息: " + i);
                msg.notify(); // 唤醒处于阻塞状态下的线程
                System.out.println("唤醒消费者!");
            }
        }
    }
}
