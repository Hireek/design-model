package com.p6.demo.current;

/**
 * @author xxx xshlxx@126.com
 * @since 2020/12/25
 */
public class ThreadLocalDemo {

    static ThreadLocal<Integer> local = new ThreadLocal<Integer>() {

        @Override
        protected Integer initialValue() {
            return 0;
        }
    };

    public static void main(String[] args) {

        Thread[] threads = new Thread[5];

        for (int i = 0; i < 5; i ++) {

            threads[i] = new Thread(() ->{

                // 获得的值都是0
                int num = local.get();
                // 设置到local中
                local.set(num+=5);

                System.out.println(Thread.currentThread().getName() + "-" + num);
            });
        }

        // 1、local是啥
        // 2、local.ger()是啥迷之操作？
        // 3、local.set()做了啥

        for (int i = 0; i < 5; i ++) {

            threads[i].start();
        }


    }
}
