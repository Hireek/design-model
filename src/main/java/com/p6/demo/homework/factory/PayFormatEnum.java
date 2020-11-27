package com.p6.demo.homework.factory;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/11/27
 */
@Getter
@AllArgsConstructor
public enum PayFormatEnum {

    /*** 境内支付****/
    ALI("支付宝","ALI"),
    WEC("微信","WEC"),
    YIL("银联","YIL"),

    /*** 境外支付***/
    EPA("EPA","EPA"),
    GOOGLE("GOOGLE","google");


    private String key;
    private String value;
}
