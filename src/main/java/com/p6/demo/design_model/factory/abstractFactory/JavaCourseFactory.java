package com.p6.demo.design_model.factory.abstractFactory;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/11/23
 */
public class JavaCourseFactory extends ICourseFactory{

    @Override
    protected INote createNode() {
        super.init();
        return new JavaNote();
    }

    @Override
    protected IVideo createVideo() {
        super.init();
        return new JavaVideo();
    }
}
