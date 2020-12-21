package com.p6.demo.design_model.builder.simple;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/11/30
 */
public class Test {

    public static void main(String[] args) {

        CourseBuilder builder = new CourseBuilder();

        builder.addName("设计模式");
        builder.addPpt("【ppt课件】");
        builder.addVideo("录播视频");

        System.out.println(builder.build());


    }

}
