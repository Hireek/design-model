package com.p6.demo.design_model.factory.abstractFactory.Factory;

import com.p6.demo.design_model.factory.abstractFactory.api.INote;
import com.p6.demo.design_model.factory.abstractFactory.api.IVideo;
import com.p6.demo.design_model.factory.abstractFactory.model.JavaVideo;
import com.p6.demo.design_model.factory.abstractFactory.model.PythonVideo;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/11/23
 */
public class VideoFactory extends AbstractFactory {

    @Override
    public INote createNote(String courseName) {
        return null;
    }

    @Override
    public IVideo createVideo(String courseName) {
        if ("java".equals(courseName)) {
            return new JavaVideo();
        } else if ("python".equals(courseName)) {
            return new PythonVideo();
        } else {
            return null;
        }
    }
}
