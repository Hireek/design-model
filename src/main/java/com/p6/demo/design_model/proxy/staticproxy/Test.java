package com.p6.demo.design_model.proxy.staticproxy;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/12/1
 */
public class Test {

    public static void main(String[] args) {

        ZhangLaoSan zhangLaoSan = new ZhangLaoSan(new Zhangsan());


        zhangLaoSan.findLove();
    }
}
