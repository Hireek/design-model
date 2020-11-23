package com.p6.demo.design_model.factory.method;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/11/23
 */
public class PythonCourseFactory implements ICourseFactory{

    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
