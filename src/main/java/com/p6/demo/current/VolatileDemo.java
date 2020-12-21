package com.p6.demo.current;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/12/9
 */
public class VolatileDemo {

    public static boolean stop = false;

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() ->{

            int i = 0;
            while (!stop) {
                i++;
            }

            System.out.println("re :" + i);
        });

        thread.start();
        Thread.sleep(1000);
        stop = true;

    }
}
