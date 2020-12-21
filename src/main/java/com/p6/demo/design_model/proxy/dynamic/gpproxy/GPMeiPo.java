package com.p6.demo.design_model.proxy.dynamic.gpproxy;

import com.p6.demo.design_model.proxy.dynamic.gpproxy.proxy.GPClassLoader;
import com.p6.demo.design_model.proxy.dynamic.gpproxy.proxy.GPInvocationHandler;
import com.p6.demo.design_model.proxy.dynamic.gpproxy.proxy.GPProxy;
import com.p6.demo.design_model.proxy.dynamic.jdkproxy.IPerson;

import java.lang.reflect.Method;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/12/1
 */
public class GPMeiPo implements GPInvocationHandler {

    private IPerson target;

    public IPerson getInstance(IPerson target) {

        this.target = target;

        Class<?> clazz = target.getClass();

        return (IPerson) GPProxy.newProxyInstance(new GPClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {


        before();

        Object result = method.invoke(this.target, args);

        after();

        return null;
    }

    private void before() {

        System.out.println("我是媒婆，我已经收到你的需求~开始物色");
    }

    private void after() {

        System.out.println("双方同意，开始交往!");
    }
}
