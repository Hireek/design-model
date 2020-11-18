package com.p6.demo.review.denpence_inversion_principle;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/11/16
 */
public class Tom {

//    public void studyJavaCourse() {
//
//        System.out.println("Tom在学习Java的课程");
//    }
//
//    public void studyPythonCourse() {
//
//        System.out.println("Tom在学习Python课程");
//    }

    public void study(ICourse course) {

        course.study();
    }
}
