package com.p6.demo.design_model.factory.abstractFactory;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/11/23
 */
public class Test {

    public static void main(String[] args) {


        ICourseFactory factory = new JavaCourseFactory();

        factory.createNode().edit();
        factory.createVideo().record();
    }
}
