package com.p6.demo.current.review2;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/12/9
 */
public class Demo1 {

    private static int count = 0;

    public static void incr() {

        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        count ++;
    }

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 1000; i ++) {

            new Thread(Demo1::incr).start();
        }

        // 保证线程执行结束
        Thread.sleep(3000);

        System.out.println("运行结果: " + count);
    }
}
