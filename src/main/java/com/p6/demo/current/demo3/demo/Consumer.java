package com.p6.demo.current.demo3.demo;

import lombok.SneakyThrows;

import java.util.Queue;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/12/3
 */
public class Consumer implements Runnable{

    private Queue<String> msg;

    private int maxSize;

    public Consumer(Queue<String> msg, int maxSize) {

        this.msg = msg;
        this.maxSize = maxSize;
    }

    @SneakyThrows
    @Override
    public void run() {

        while (true) {

            synchronized (msg) {

                while (msg.isEmpty()) {

                    msg.wait();
                }
                System.out.println("消费者消费消息: " + msg.remove());
                msg.notify(); // 唤醒处于阻塞状态下的生产者
            }
        }

    }
}
