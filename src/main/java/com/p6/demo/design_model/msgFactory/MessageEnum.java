package com.p6.demo.design_model.msgFactory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/11/26
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum MessageEnum {


    LIU_PAI("liu_pai", "流拍"),
    PRE_DEAL("pre_deal", "待成交"),
    PRE_PAYMENT("pre_payment", "待付订金"),
    PRE_TRANSFER("pre_transfer", "待过户"),
    PRE_ARBITRATION("pre_arbitration", "待仲裁"),
    PRE_FINAL_PAYMENT("pre_final_payment", "待付尾款"),
    HAS_PAY_FINAL_PRICE("has_pay_final_price", "已付尾款");


    private String key;

    private String value;

}
