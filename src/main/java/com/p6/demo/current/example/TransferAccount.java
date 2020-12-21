package com.p6.demo.current.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/12/20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransferAccount implements Runnable {

    private Account fromAccount;
    private Account toAccount;

    private int amount;

    Allocator allocator;


    @Override
    public void run() {

        while (true) {

            if (allocator.apply(fromAccount, toAccount)) {

                try {

                    synchronized (fromAccount) {

                        synchronized (toAccount) {

                            if (fromAccount.getBalance() >= amount) {

                                fromAccount.debit(amount);
                                toAccount.credit(amount);
                            }
                        }
                    }
                } catch (Exception ex) {

                    allocator.free(fromAccount,toAccount);
                }
            }
            // 转入账户的余额
            System.out.println(fromAccount.getAccountName() + "->" + fromAccount.getBalance());

            // 转出账户的余额
            System.out.println(toAccount.getAccountName() + "->" + toAccount.getBalance());
        }
    }

    public static void main(String[] args) {

        Account fromAccount = new Account("Mic", 100000);
        Account toAccount = new Account("花花", 300000);

        Allocator allocator = new Allocator();
        Thread a = new Thread(new TransferAccount(fromAccount, toAccount, 10,allocator));
        Thread b = new Thread(new TransferAccount(toAccount, fromAccount, 30,allocator));

        a.start();
        b.start();


    }
}
