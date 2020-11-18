package com.p6.demo.review.simple_repository_principle;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/11/17
 */
public class Course {

    // 反例就是mybatis plus中的saveOrUpdate()方法
    public void study(String courseName) {
        if ("直播课".equals(courseName)) {
            System.out.println(courseName + "不能快进");
        }else {
            System.out.println(courseName + "可以反复回看");
        }
    }


    public static void main(String[] args) {

        Course course = new Course();

        course.study("直播课");
        course.study("录播课");
    }
}
