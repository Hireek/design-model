package com.p6.demo.design_model.single.threadlocal;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/11/25
 */
public class ThreadLocalSingletonTest {

    public static void main(String[] args) {

        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
    }
}
