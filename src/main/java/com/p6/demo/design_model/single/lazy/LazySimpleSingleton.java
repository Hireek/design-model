package com.p6.demo.design_model.single.lazy;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/11/24
 */

/**
 * 优点: 节省了内存，线程安全
 * 缺点: 性能下降
 */
public class LazySimpleSingleton {

    private static LazySimpleSingleton instance;


    private LazySimpleSingleton(){}

    public static LazySimpleSingleton getInstance() {

        if (null == instance) {


            instance = new LazySimpleSingleton();
        }
        return instance;
    }
}
