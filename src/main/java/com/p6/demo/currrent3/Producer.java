package com.p6.demo.currrent3;

import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2021/1/3
 */
public class Producer implements Runnable {


    private Queue<String> msg;

    private int maxSize;

    Lock lock;

    Condition condition;


    public Producer(Queue<String> msg, int maxSize, Lock lock, Condition condition) {
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
            while (msg.size() == maxSize) {

                System.out.println("生产者队列满了！");

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
            System.out.println("生产消息: " + i);
            msg.add("生产者的消费内容" + i);
            // 唤醒阻塞状态下的线程
            condition.signal();
            lock.unlock();
        }
    }
}
