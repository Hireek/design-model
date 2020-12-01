package com.p6.demo.design_model.proxy.dynamic.jdkproxy;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/12/1
 */
public class Test {

    public static void main(String[] args) {


        JdkMeiPo jdkMeiPo = new JdkMeiPo();

        IPerson zhangsan = jdkMeiPo.getInstance(new Zhangsan());

        zhangsan.findLove();

        IPerson zhaoliu = jdkMeiPo.getInstance(new ZhaoLiu());

        zhaoliu.findLove();
        zhaoliu.buyInsure();
    }
}
