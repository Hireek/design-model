package com.p6.demo.design_model.proxy.dynamic.cglibproxy;

import com.p6.demo.design_model.proxy.dynamic.jdkproxy.IPerson;
import com.p6.demo.design_model.proxy.dynamic.jdkproxy.JdkMeiPo;
import com.p6.demo.design_model.proxy.dynamic.jdkproxy.ZhaoLiu;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/12/1
 */
public class Test {

    public static void main(String[] args) {

        Zhangsan instance = (Zhangsan)new CglibMeiPo().getInstance(Zhangsan.class);

        instance.findLove();


    }
}
