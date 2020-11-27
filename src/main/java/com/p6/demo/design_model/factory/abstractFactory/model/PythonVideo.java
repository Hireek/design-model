package com.p6.demo.design_model.factory.abstractFactory.model;

import com.p6.demo.design_model.factory.abstractFactory.api.IVideo;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/11/23
 */
public class PythonVideo implements IVideo {

    @Override
    public void record() {
        System.out.println("录制了python视频");
    }
}
