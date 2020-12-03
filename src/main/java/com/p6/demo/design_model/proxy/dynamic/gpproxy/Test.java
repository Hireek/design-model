package com.p6.demo.design_model.proxy.dynamic.gpproxy;

import com.p6.demo.design_model.proxy.dynamic.jdkproxy.IPerson;
import com.p6.demo.design_model.proxy.dynamic.jdkproxy.Zhangsan;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/12/1
 */
public class Test {

    public static void main(String[] args) {


        GPMeiPo gpMeiPo = new GPMeiPo();

        IPerson zhangsan = gpMeiPo.getInstance(new Zhangsan());

        zhangsan.findLove();

    }
}
