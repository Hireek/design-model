package com.p6.demo.currrent3;

import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2021/1/3
 */
public class Consumer implements Runnable{



    private Queue<String> msg;

    private int maxSize;

    Lock lock;

    Condition condition;


    public Consumer(Queue<String> msg, int maxSize, Lock lock, Condition condition) {
        this.msg = msg;
        this.maxSize = maxSize;
        this.lock = lock;
        this.condition = condition;
    }

    @Override
    public void run() {

        int i = 0;

        while (true) {

            i++;
            lock.lock();
            while (msg.isEmpty()) {

                System.out.println("消费者队列空了！");

                try {
                    // 阻塞线程并释放锁
                    condition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("消费者消费消息: " + msg.remove());
            // 唤醒阻塞状态下的线程
            condition.signal();
            lock.unlock();
        }
    }
}
