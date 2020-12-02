package com.p6.demo.current.demo3;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/12/2
 */
public class CountThread extends Thread{
    private int i = 1;

    public CountThread(){
        super("计数线程");
    }
    public void run(){
        while(i<100){
            System.out.println(this.getName()+"计数"+i);
            i++;
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {

//                System.out.println("系统捕获了中断异常");
                e.printStackTrace();
            }
        }
    }
}