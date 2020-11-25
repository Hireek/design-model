package com.p6.demo.design_model.msgFactory;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/11/25
 */
public class PrePaymentMsg implements IMessage{

    @Override
    public String preMessageDB() {
        return "待付定金不需要插入数据库！";
    }

    @Override
    public String preMessageMsg() {
        return "待付订金";
    }

    @Override
    public String title() {
        return "title";
    }
}
