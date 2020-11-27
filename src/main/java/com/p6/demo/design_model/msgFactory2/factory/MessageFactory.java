package com.p6.demo.design_model.msgFactory2.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/11/25
 */
public class MessageFactory {

    private static final Map<String, IMessageFactory> factoryMap = new HashMap<>();

    static {
        factoryMap.put("message", new PreFinalFactory());
        factoryMap.put("jiguang", new PrePaymentFactory());
    }
    /**
     * 工厂路由中转
     * @param type 工厂类型
     * @return 工厂
     */
    public static IMessageFactory getFactory(String type) {
        return factoryMap.get(type);
    }
}
