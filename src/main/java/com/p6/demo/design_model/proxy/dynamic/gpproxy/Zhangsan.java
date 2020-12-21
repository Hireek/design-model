package com.p6.demo.design_model.proxy.dynamic.gpproxy;

import com.p6.demo.design_model.proxy.dynamic.jdkproxy.IPerson;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/12/1
 */
public class Zhangsan implements IPerson {

    @Override
    public void findLove() {

        System.out.println("张三要求: ");
        System.out.println("肤白貌美大长腿~");

    }


    @Override
    public void buyInsure() {

        System.out.println("30w");
    }
}
