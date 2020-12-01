package com.p6.demo.design_model.factory.abstractFactory.Factory;

import com.p6.demo.design_model.factory.abstractFactory.api.INote;
import com.p6.demo.design_model.factory.abstractFactory.api.IVideo;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/11/23
 */
public abstract class AbstractFactory {

    public void init() {
        System.out.println("初始化基础数据...");
    }

    public abstract INote createNote(String courseName);

    public abstract IVideo createVideo(String courseName);
}
