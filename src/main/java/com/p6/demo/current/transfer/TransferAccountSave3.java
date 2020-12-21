package com.p6.demo.current.transfer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/12/21
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransferAccountSave3 implements Runnable {

    private Account fromAccount;

    private Account toAccount;

    private int amount;

    private Lock fromLock = new ReentrantLock();

    private Lock toLock = new ReentrantLock();

    @Override
    public void run() {

        while (true) {

            /**
             * 这里面我们采用 ReentrantLock.tryLock()
             * 意味: 获取到锁返回true, 获取不到返回false
             */
            if (fromLock.tryLock()) {

                if (toLock.tryLock()) {


                    if (fromAccount.getPrice() >= amount) {

                        fromAccount.remainPrice(amount);
                        toAccount.transferPrice(amount);
                    }
                }
            }
            System.out.println(fromAccount.getAccountName() + "--->" + fromAccount.getPrice());
            System.out.println(toAccount.getAccountName() + "--->" + toAccount.getPrice());
        }
    }

    public TransferAccountSave3(Account fromAccount, Account toAccount, int amount) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
    }

    public static void main(String[] args) {

        Account fromAccount = new Account("小李", 100000);
        Account toAccount = new Account("小白", 300000);

        TransferAccountSave3 from = new TransferAccountSave3(fromAccount, toAccount, 10);
        TransferAccountSave3 to = new TransferAccountSave3(toAccount, fromAccount, 30);

        Thread t1 = new Thread(from);
        Thread t2 = new Thread(to);

        t1.start();
        t2.start();

    }
}
