package com.p6.demo.design_model.single.lazy;

import java.lang.reflect.Constructor;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/11/24
 */
public class ReflectTest {

    public static void main(String[] args) throws Exception{

        Class<?> clazz = LazyStaticInnerClassSingleton.class;
        Constructor<?> c = clazz.getDeclaredConstructor(null);

        c.setAccessible(true);
        Object instance = c.newInstance();
        Object instance2 = c.newInstance();
        System.out.println(instance);
        System.out.println(instance2);
    }
}
