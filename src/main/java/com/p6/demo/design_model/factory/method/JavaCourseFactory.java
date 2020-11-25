package com.p6.demo.design_model.factory.method;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/11/23
 */
public class JavaCourseFactory implements ICourseFactory{

    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
