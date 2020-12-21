package com.p6.demo.current.demo3;

import org.openjdk.jol.info.ClassLayout;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/12/9
 */
public class ClassLayoutDemo {

    public static void main(String[] args) {

        ClassLayoutDemo classLayoutDemo = new ClassLayoutDemo();

        synchronized (classLayoutDemo) {

            System.out.println("locking");
        }

        System.out.println(ClassLayout.parseInstance(classLayoutDemo).toPrintable());
    }

}
