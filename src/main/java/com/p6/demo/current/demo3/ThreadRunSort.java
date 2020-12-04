package com.p6.demo.current.demo3;

import java.util.LinkedList;
import java.util.List;

public class ThreadRunSort {

    /**
     * 对象锁 
     */
    private final Object object = new Object();
    private List<Integer> sleep = new LinkedList<>();
    private List<Integer> notify = new LinkedList<>();
    /**
     * 该线程作为一个唤醒线程 
     */
    public void startThread(int i) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (object) {
                    try {
                        System.out.println(Thread.currentThread().getName()+"进入休眠");
                        sleep.add(i);
                        object.wait();
                        System.out.println(Thread.currentThread().getName()+"线程已经唤醒");
                        notify.add(i);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
        });
        t.setName("Thread"+i);
        t.start();
    }

    public static void main(String[] args) {
        ThreadRunSort a = new ThreadRunSort();
        for(int i =1;i<20;i++){
            a.startThread(i);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println();
        for(int i =1;i<20;i++){
            synchronized (a.object) {
                // 修改这里，启用某个方法，能够观察到唤醒顺序
                a.object.notifyAll();
//                a.object.notify();
            }
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("休眠顺序"+a.sleep);
        System.out.println("唤醒顺序"+a.notify);
    }
}