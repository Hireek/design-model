package com.p6.demo.design_model.factory.abstractFactory.Factory;

import com.p6.demo.design_model.factory.abstractFactory.api.INote;
import com.p6.demo.design_model.factory.abstractFactory.api.IVideo;
import com.p6.demo.design_model.factory.abstractFactory.model.JavaNote;
import com.p6.demo.design_model.factory.abstractFactory.model.PythonNote;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/11/23
 */
public class NoteFactory extends AbstractFactory {

    @Override
    public INote createNote(String courseName) {
        if ("java".equals(courseName)) {
            return new JavaNote();
        } else if ("python".equals(courseName)) {
            return new PythonNote();
        } else {
            return null;
        }
    }

    @Override
    public IVideo createVideo(String courseName) {
        return null;
    }
}
