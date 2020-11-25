package com.p6.demo.design_model.single.hungry;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/11/24
 */
public class HungryStaticSingleton {

    // 类初始化顺序:
    // 先静态后动态
    // 先上后下
    // 先属性后方法
    private static final  HungryStaticSingleton  hungryStaticSingleton;

    static {

        hungryStaticSingleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton(){}

    public static HungryStaticSingleton getInstance() {

        return hungryStaticSingleton;
    }
}
