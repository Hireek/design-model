package com.p6.demo.design_model.msgFactory;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/11/25
 */
public class FactoryZuul {

    /**
     * 工厂路由中转
     * @param type 工厂类型
     * @return 工厂
     */
    public static IMessageFactory getFactory(String type) {

        if ("message".equals(type)) {

            return new PreFinalFactory();

        } else if ("jiguang".equals(type)) {

            return new PrePaymentFactory();
        }else {

            return null;
        }
    }
}
