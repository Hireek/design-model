package com.p6.demo.design_model.proxy.general;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/12/1
 */
public class Proxy implements ISubject{

    private ISubject subject;

    public Proxy(ISubject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {

        before();
        subject.request();
        after();
    }

    private void after() {
        System.out.println("called after request()");
    }

    private void before() {
        System.out.println("called before request()");
    }
}
