package com.p6.demo.current.transfer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/12/21
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    private String accountName;

    private int price;


    /**
     * 当前账户转账之后剩余金额
     *
     * @param amount 转账金额
     */
    public void remainPrice(int amount) {

        this.price = this.price - amount;

    }
    /**
     * 转账之后的金额
     *
     * @param amount 转账金额
     */
    public void transferPrice(int amount) {

        this.price = this.price + amount;

    }
}
