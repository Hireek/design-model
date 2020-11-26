package com.p6.demo.design_model.single.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/11/25
 */
public class ContainerSingleton {

    private ContainerSingleton(){}

    private static Map<String,Object> ioc = new ConcurrentHashMap<>();

    public static Object getInstance(String className) {

        if (! ioc.containsKey(className)) {

            Object instance = null;

            try {
                instance = Class.forName(className).newInstance();
                ioc.put(className,instance);
            }  catch (Exception e) {
                e.printStackTrace();
            }
            return instance;
        } else {
            return ioc.get(className);
        }
    }

}
