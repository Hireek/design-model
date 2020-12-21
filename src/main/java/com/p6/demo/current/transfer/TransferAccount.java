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
public class TransferAccount implements Runnable {

    private Account fromAccount;

    private Account toAccount;

    private int amount;

    @Override
    public void run() {

        while (true) {

            synchronized (fromAccount) {

                synchronized (toAccount) {


                    if (toAccount.getPrice() > amount) {

                        fromAccount.remainPrice(amount);
                        toAccount.transferPrice(amount);
                    }
                }
            }
            System.out.println(fromAccount.getAccountName() + "--->" + fromAccount.getPrice());
            System.out.println(toAccount.getAccountName() + "--->" + toAccount.getPrice());
        }
    }

    public static void main(String[] args) {

        Account fromAccount = new Account("小李",100000);
        Account toAccount = new Account("小白",300000);

        TransferAccount from = new TransferAccount(fromAccount,toAccount,10);
        TransferAccount to = new TransferAccount(toAccount,fromAccount,30);

        Thread t1 = new Thread(from);
        Thread t2 = new Thread(to);

        t1.start();
        t2.start();

    }
}
