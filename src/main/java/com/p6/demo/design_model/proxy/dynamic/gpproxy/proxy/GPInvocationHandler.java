package com.p6.demo.design_model.proxy.dynamic.gpproxy.proxy;

import java.lang.reflect.Method;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/12/2
 */
public interface GPInvocationHandler {

    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}
