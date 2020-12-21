package com.p6.demo.design_model.composite.general.demo.transparent;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/12/15
 */
public class Test {

    public static void main(String[] args) {

        System.out.println("透明的组合模式");

        CourseComponent javaBase = new Course("Java入门课程",8280);
        CourseComponent ai = new Course("人工智能",5000);

        CourseComponent packageCourse = new CoursePackage("Java架构师",2);
    }
}
