package com.p6.demo.homework.factory;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/11/27
 */
public interface IPay {

    /**
     * 当前支付方式具体的执行逻辑,参数请后续增加
     * @return
     */
    String pay();

}
