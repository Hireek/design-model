package com.p6.demo.design_model.proxy.dynamic.cglibproxy;


import com.p6.demo.design_model.proxy.staticproxy.IPerson;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/12/1
 */
public class Zhangsan implements IPerson {

    @Override
    public void findLove() {

        System.out.println("儿子要求: ");
        System.out.println("肤白貌美大长腿~");

    }
}
