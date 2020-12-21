package com.p6.demo.current.example;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/12/2
 */
public class App {

     public static int count = 0;

    /**
     * 变量自增 + 1
     */
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

            new Thread(App::incr).start();
        }

        Thread.sleep(2000); // 保证线程执行结束

        System.out.println("运行结果: " + count);
    }
}
