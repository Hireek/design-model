package com.p6.demo.design_model.proxy.dynamic.gpproxy.proxy;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/12/2
 */
public class GPProxy {

    public static final String ln = "\r\n";

    public static Object newProxyInstance(GPClassLoader loader,
                                          Class<?>[] interfaces,
                                          GPInvocationHandler h)
            throws IllegalArgumentException {


        // 1、动态生成源码.java文件
        String src = generateSrc(interfaces);

        // 2、把java文件输出到磁盘，保存文件为$Proxy0.java

        // 3、把.java文件编译成$Proxy.class文件

        // 4、把生成的.class文件加载到JVM中

        // 5、返回新的代理对象

        return null;
    }

    private static String generateSrc(Class<?>[] interfaces) {

        StringBuilder sb = new StringBuilder();

        sb.append("com.p6.demo.design_model.proxy.dynamic.gpproxy.proxy;" + ln);
        sb.append("import com.p6.demo.design_model.proxy.dynamic.jdkproxy.IPerson;" + ln);
        sb.append("import java.lang.reflect.*;" + ln);
        sb.append("public final class $Proxy0 implements " + interfaces[0].getClass() + " {" + ln);



        sb.append("}");
        return sb.toString();
    }
}
