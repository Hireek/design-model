package com.p6.demo.design_model.single.register;

import java.lang.reflect.Constructor;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/11/24
 */
public class EnumSingletonTest {

    public static void main(String[] args) throws Exception{

        EnumSingleton instance = EnumSingleton.getInstance();

        instance.setData(new Object());

        Class  clazz = EnumSingleton.class;

        Constructor c = clazz.getDeclaredConstructor(String.class,int.class);
        c.setAccessible(true);

        Object instance1 = c.newInstance();

        System.out.println(instance1);
    }
}
