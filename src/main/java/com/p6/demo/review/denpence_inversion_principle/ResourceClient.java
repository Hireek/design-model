package com.p6.demo.review.denpence_inversion_principle;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/11/16
 */
public class ResourceClient {

    public static void main(String[] args) {


        Tom tom = new Tom();
        /****** 高层不应该依赖于低层 ******/
//        tom.studyJavaCourse();
//        tom.studyPythonCourse();

        /****** 抽象不应该依赖于低层，底层应该依赖于抽象 ******/
        tom.study(new JavaCourse());
        tom.study(new PythonCourse());
    }
}
