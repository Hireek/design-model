package com.p6.demo.design_model.proxy.dynamic.jdkproxy;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/12/1
 */
public class ZhaoLiu implements IPerson{

    @Override
    public void findLove() {

        System.out.println("赵柳要求: ");
        System.out.println("有车有房学历高~");
    }

    @Override
    public void buyInsure() {

        System.out.println("100w");
    }
}
