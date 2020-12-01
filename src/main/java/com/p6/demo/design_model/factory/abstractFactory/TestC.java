package com.p6.demo.design_model.factory.abstractFactory;

import com.p6.demo.design_model.factory.abstractFactory.Factory.AbstractFactory;
import com.p6.demo.design_model.factory.abstractFactory.Factory.FactoryBuilder;
import com.p6.demo.design_model.factory.abstractFactory.api.INote;
import com.p6.demo.design_model.factory.abstractFactory.api.IVideo;
import lombok.extern.slf4j.Slf4j;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/11/23
 */
@Slf4j
public class TestC {

    public static void main(String[] args) {
        AbstractFactory noteFactory = FactoryBuilder.getFactory("note");
        log.info("构建了笔记工厂");

        INote javaNote = noteFactory.createNote("java");
        log.info("生产了java笔记实体");
        javaNote.edit();

        INote pythonNote = noteFactory.createNote("python");
        log.info("生产了python笔记实体");
        pythonNote.edit();

        AbstractFactory videoFactory = FactoryBuilder.getFactory("video");
        log.info("构建了视频工厂");

        IVideo javaVideo = videoFactory.createVideo("java");
        log.info("生产了java视频实体");
        javaVideo.record();

        IVideo pythonVideo = videoFactory.createVideo("python");
        log.info("生产了python视频实体");
        pythonVideo.record();
    }
}
