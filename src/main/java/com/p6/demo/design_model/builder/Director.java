package com.p6.demo.design_model.builder;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/11/30
 */
public class Director {

    public static void main(String[] args) {

        IBuilder builder = new ConcreteBuilder();

        System.out.println(builder.build());
    }
}
