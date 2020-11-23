package com.p6.demo.design_model.factory.abstractFactory;

import com.p6.demo.design_model.factory.method.ICourse;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/11/16
 */
public class PythonCourse implements ICourse {

    @Override
    public void study() {

        System.out.println("Tom在学习Python课程");
    }
}
