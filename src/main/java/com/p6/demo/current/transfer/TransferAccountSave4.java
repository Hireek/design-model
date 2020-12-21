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
public class TransferAccountSave4 implements Runnable {

    private Account fromAccount;

    private Account toAccount;


    private int amount;

    @Override
    public void run() {

        Account left = null;
        Account right = null;

        if (fromAccount.hashCode() > toAccount.hashCode()) {

            left = toAccount;
            right = fromAccount;
        }
        while (true) {

            synchronized (left) {

                synchronized (right) {


                    if (fromAccount.getPrice() > amount) {

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

        Account fromAccount = new Account("小李", 100000);
        Account toAccount = new Account("小白", 300000);

        TransferAccountSave4 from = new TransferAccountSave4(fromAccount, toAccount, 10);
        TransferAccountSave4 to = new TransferAccountSave4(toAccount, fromAccount, 30);

        Thread t1 = new Thread(from);
        Thread t2 = new Thread(to);

        t1.start();
        t2.start();

    }
}
