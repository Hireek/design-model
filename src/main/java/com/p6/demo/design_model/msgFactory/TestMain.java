package com.p6.demo.design_model.msgFactory;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/11/25
 */
public class TestMain {

    public static void main(String[] args) {

        // 上面在嵌套一层简单工厂
        IMessageFactory factory = new PreFinalFactory();

        IMessage iMessage = factory.factoryMid();

        System.out.println(iMessage.preMessageDB());
        System.out.println(iMessage.preMessageMsg());
        System.out.println(iMessage.title());

        System.out.println("------ 华丽分割线 ------");

        IMessageFactory factory2 = new PrePaymentFactory();

        IMessage iMessage1 = factory2.factoryMid();

        System.out.println(iMessage1.preMessageDB());
        System.out.println(iMessage1.preMessageMsg());
        System.out.println(iMessage1.title());

        System.out.println();
        System.out.println("工厂路由中转");
        System.out.println();

        // 获得具体的产品工厂
        IMessageFactory message = FactoryZuul.getFactory("jiguang");

        // 拿到工厂中具体的产品线
        IMessage product = message.factoryMid();

        // 产品
        System.out.println(product.title());
        System.out.println(product.preMessageMsg());
        System.out.println(product.preMessageDB());




    }
}
