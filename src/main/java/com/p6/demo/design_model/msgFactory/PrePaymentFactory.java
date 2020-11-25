package com.p6.demo.design_model.msgFactory;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/11/25
 */
public class PrePaymentFactory implements IMessageFactory{

    @Override
    public IMessage factoryMid() {
        return new PrePaymentMsg();
    }
}
