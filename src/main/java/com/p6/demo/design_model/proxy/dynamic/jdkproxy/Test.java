package com.p6.demo.design_model.proxy.dynamic.jdkproxy;

import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/12/1
 */
public class Test {

    public static void main(String[] args) {


        JdkMeiPo jdkMeiPo = new JdkMeiPo();

        IPerson zhangsan = jdkMeiPo.getInstance(new Zhangsan());

        zhangsan.findLove();

        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{IPerson.class});

        try {
            FileOutputStream os = new FileOutputStream("/Users/xuenhan/Documents/design-model/$Proxy0.class");

            os.write(bytes);
            os.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

//        IPerson zhaoliu = jdkMeiPo.getInstance(new ZhaoLiu());
//
//        zhaoliu.findLove();
//        zhaoliu.buyInsure();
    }
}
