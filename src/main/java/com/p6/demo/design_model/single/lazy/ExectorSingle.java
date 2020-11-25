package com.p6.demo.design_model.single.lazy;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/11/24
 */
public class ExectorSingle implements Runnable{

    @Override
    public void run() {

        LazySimpleSingleton instance = LazySimpleSingleton.getInstance();

        System.out.println(Thread.currentThread().getName() + instance);
    }
}
