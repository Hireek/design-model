package com.p6.demo.current.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/12/20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransferAccount03 implements Runnable {

    private Account fromAccount;
    private Account toAccount;

    private int amount;

    Lock fromLock = new ReentrantLock();

    Lock toLock = new ReentrantLock();


    @Override
    public void run() {

        Account left = null;
        Account right = null;

        // 是不是有什么算法能证明说: 先申明的对象的hashCode一定比后声明的要大？
        if (fromAccount.hashCode() > toAccount.hashCode()) {

            left = toAccount;
            right = fromAccount;
        }

        while (true) {
            // true or false
            synchronized (left) {

                synchronized (right) {

                    if (fromAccount.getBalance() >= amount) {

                        fromAccount.debit(amount);
                        toAccount.credit(amount);
                    }
                }
            }
            // 转入账户的余额
            System.out.println(fromAccount.getAccountName() + "->" + fromAccount.getBalance());

            // 转出账户的余额
            System.out.println(toAccount.getAccountName() + "->" + toAccount.getBalance());
        }
    }

    public TransferAccount03(Account fromAccount, Account toAccount, int amount) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
    }

    public static void main(String[] args) {

        Account fromAccount = new Account("Mic", 100000);
        Account toAccount = new Account("花花", 300000);

        Thread a = new Thread(new TransferAccount03(fromAccount, toAccount, 10));
        Thread b = new Thread(new TransferAccount03(toAccount, fromAccount, 30));

        a.start();
        b.start();

    }
}
