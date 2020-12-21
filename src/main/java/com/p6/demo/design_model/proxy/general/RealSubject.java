package com.p6.demo.design_model.proxy.general;

/**
 *
 * 真实对象(真实主题)
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/12/1
 */
public class RealSubject implements ISubject{

    @Override
    public void request() {

        System.out.println("real service is called.");
    }
}
