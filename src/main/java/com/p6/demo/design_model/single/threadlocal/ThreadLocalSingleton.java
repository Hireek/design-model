package com.p6.demo.design_model.single.threadlocal;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/11/25
 */
public class ThreadLocalSingleton {


    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance = new ThreadLocal<ThreadLocalSingleton> (){

        @Override
        protected ThreadLocalSingleton initialValue() {

            return new ThreadLocalSingleton();
        }
    };

    private ThreadLocalSingleton() {}

    public static ThreadLocalSingleton getInstance() {

        return threadLocalInstance.get();
    }
}
