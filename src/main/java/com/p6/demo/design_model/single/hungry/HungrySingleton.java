package com.p6.demo.design_model.single.hungry;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/11/24
 */


/**
 *  优点: 执行效率高，性能高，没有加任何的锁
 *  缺点: 某些情况下，可能会造成内存浪费
 */

public class HungrySingleton {

    private static final HungrySingleton hungrySinglEton = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance() {

        return hungrySinglEton;
    }
}
