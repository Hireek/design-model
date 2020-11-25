package com.p6.demo.design_model.single.lazy;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/11/24
 */

/**
 * classPath下面的. class文件
 * LazyStaticInnerClassSingleton.class
 * LazyStaticInnerClassSingleton&LazyHolder.class
 *
 * 优点: 写法优雅，很好的利用了Java本身的的语法特点，性能高，避免了内存浪费, 不能被反射破坏
 * 缺点: 不优雅了
 *
 */
public class LazyStaticInnerClassSingleton {


    private LazyStaticInnerClassSingleton(){

        if (LazyHolder.INSTANCE != null) {

            throw new RuntimeException("不允许非法访问");
        }
    }

    private static LazyStaticInnerClassSingleton getInstance() {

        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder {

        private static final LazyStaticInnerClassSingleton INSTANCE = new LazyStaticInnerClassSingleton();
    }

}
