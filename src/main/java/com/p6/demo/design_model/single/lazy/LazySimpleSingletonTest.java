package com.p6.demo.design_model.single.lazy;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/11/24
 */
public class LazySimpleSingletonTest {

    public static void main(String[] args) {

        Thread t1 = new Thread(new ExectorSingle());

        Thread t2 = new Thread(new ExectorSingle());

        t1.start();
        t2.start();
    }
}
