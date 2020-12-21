package com.p6.demo.design_model.proxy.dynamic.cglibproxy;

import com.p6.demo.design_model.proxy.dynamic.jdkproxy.IPerson;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/12/1
 */
public class CglibMeiPo implements MethodInterceptor {

    private IPerson target;

    public Object getInstance(Class<?> clazz) {

        Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);

        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        before();

        Object results = methodProxy.invokeSuper(o, objects);

        after();


        return results;
    }

    private void before() {

        System.out.println("我是媒婆，我已经收到你的需求~开始物色");
    }

    private void after() {

        System.out.println("双方同意，开始交往!");
    }
}
