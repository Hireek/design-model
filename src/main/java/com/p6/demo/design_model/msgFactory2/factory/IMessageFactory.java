package com.p6.demo.design_model.msgFactory2.factory;

import com.p6.demo.design_model.msgFactory2.msg.IMessage;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/11/25
 */
public interface IMessageFactory {

    /**
     * 工厂方法模式: 工厂流转
     */
    IMessage factoryMid();
}
