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
public class TransferAccountSave2 implements Runnable {

    private Account fromAccount;

    private Account toAccount;

    private int amount;

    Allocator allocator;

    @Override
    public void run() {

        try {

            if (allocator.accountObtainIs(fromAccount, toAccount)) {

                while (true) {

                    synchronized (fromAccount) {

                        synchronized (toAccount) {

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
        } catch (Exception ex) {

            ex.printStackTrace();

        } finally {

            allocator.free(fromAccount, toAccount);
        }
    }

    public static void main(String[] args) {

        Account fromAccount = new Account("小李", 100000);
        Account toAccount = new Account("小白", 300000);

        Allocator allocator = new Allocator();

        TransferAccountSave2 from = new TransferAccountSave2(fromAccount, toAccount, 10, allocator);
        TransferAccountSave2 to = new TransferAccountSave2(toAccount, fromAccount, 30, allocator);

        Thread t1 = new Thread(from);
        Thread t2 = new Thread(to);

        t1.start();
        t2.start();

    }
}
