package com.p6.demo.design_model.single.lazy;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/11/24
 */

/**
 * 优点: 性能高了，线程也安全了
 * 缺点: 可读性差
 */
public class LazyDoubleCheckSingleton {


    private volatile static LazyDoubleCheckSingleton instance;


    private LazyDoubleCheckSingleton() {
    }

    public static LazyDoubleCheckSingleton getInstance() {

        // 检查是否要阻塞
        if (null == instance) {

            synchronized (LazyDoubleCheckSingleton.class) {

                // 是否要重新创建实例
                if (null == instance) {
                    instance = new LazyDoubleCheckSingleton();
                    // 指令重排序
                }
            }
        }

        return instance;
    }
}
