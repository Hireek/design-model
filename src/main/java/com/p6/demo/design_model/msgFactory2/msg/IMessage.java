package com.p6.demo.design_model.msgFactory2.msg;

/**
 * @Author: Chord
 * @Date: 2020/11/25 9:31 下午
 */
public interface IMessage {
    /**
     * 获取推送头
     */
    String title();
    /**
     * 获取极光需要推送的消息
     */
    String preMessageDB();
    /**
     * 获取需要发送的短信消息
     */
    String preMessageMsg();
}
