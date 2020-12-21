package com.p6.demo.design_model.flyweight.jdk;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/12/10
 */
public class IntegerTest {

    public static void main(String[] args) {

        Integer a = Integer.valueOf(100);
        Integer b = 100;

        System.out.println(a == b);
    }

}
