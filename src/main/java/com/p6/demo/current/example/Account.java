package com.p6.demo.current.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/12/20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    private String accountName;

    private int balance;

    // 更新转出方的余额
    public void debit(int amount) {

        this.balance = this.balance - amount;
    }

    public void credit(int amount) {

        this.balance = this.balance + amount;
    }


}
