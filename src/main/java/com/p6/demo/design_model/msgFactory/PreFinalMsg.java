package com.p6.demo.design_model.msgFactory;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/11/25
 */
public class PreFinalMsg implements IMessage{

    @Override
    public String preMessageDB() {
        return "待付尾款需要插入数据库";
    }

    @Override
    public String preMessageMsg() {
        return "待付尾款不需要发送短信!";
    }

    @Override
    public String title() {
        return "这个是标题待付尾款";
    }
}
