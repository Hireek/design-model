package com.p6.demo.design_model.builder.chain;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/11/30
 */
public class Test {

    public static void main(String[] args) {

        Course build = new CourseBuilder()

                .addName("设计模式")
                .addPpt("【ppt课件】")
                .addVideo("录播视频").build();

        System.out.println(build);


    }

}
