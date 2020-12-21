package com.p6.demo.design_model.msgFactory2.factory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/6/9
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum OrderEnum {

    /*******订单状态：*******/

    /**
     * "待付订金: 1. pre_payment " +
     *             "待付尾款: 2. pre_final_payment " +
     *             "待过户: 3. pre_transfer " +
     *             "争议中: 4.pre_arbitration " +
     *             "待成交: 5. pre_deal " +
     *             "流拍: 6. liu_pai " +
     *             "交易成功: 7. has_pay_final_price  Ps:拍卖订单需要传，其他不需要")
     */
    /****** 待付款： 待付订金 + 待付尾款 ******/
    pre_pay_money("pre_pay_money",1002),
    // 待付订金: 1. pre_payment
    PRE_PAYMENT("pre_payment", 1),
    // 待付尾款: 2. pre_final_payment
    PRE_FINAL_PAYMENT("pre_final_payment", 2),

    /****** 待过户 ******/
    // 待过户: 3. pre_transfer
    PRE_TRANSFER("pre_transfer", 3),

    /****** 争议中: 查看: pre_arbitration_see 转入平台仲裁: pre_arbitration_to_B ******/
    // 待仲裁 4.pre_arbitration_查看
    PRE_ARBITRATION("pre_arbitration",41),
    PRE_ARBITRATION_SEE("pre_arbitration_see", 42),
    PRE_ARBITRATION_TO_B("pre_arbitration_to_b", 43),

    /****** 待成交 ******/
    // 待成交 5. pre_deal
    PRE_DEAL("pre_deal", 5),

    /****** 交易失败 ******/
    // 流拍 6. liu_pai
    LIU_PAI("liu_pai", 6),

    /****** 交易成功 ******/
    // 已付尾款
    HAS_PAY_FINAL_PRICE("has_pay_final_price",7),
    /**
     * 拍卖订单过户状态，默认：未过户
     */
    TRANSFER_IS_NOT("未过户",0),
    /**
     * 拍卖订单过户状态，待过户
     */
    TRANSFER_IS_WAIT("待过户",1),
    /**
     * 拍卖订单过户状态，已过户
     */
    TRANSFER_IS_OK("已过户",2);

    /****** 争议中:  ******/



    private String name;
    private Integer value;

    // 普通方法
    public static Integer getValue(String name) {
        for (OrderEnum c : OrderEnum.values()) {
            if (c.getName().equals(name)) {
                return c.value;
            }
        }
        return null;
    }

    // 普通方法
    public static OrderEnum getEnum(String value) {
        for (OrderEnum c : OrderEnum.values()) {
            if (c.getValue().equals(value)) {
                return c;
            }
        }
        return null;
    }
}
