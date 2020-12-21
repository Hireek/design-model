package com.p6.demo.current.transfer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/12/21
 */
public class Allocator {

    private List<Account> accounts = new ArrayList<>();

    /**
     * 资源统一调配中心
     *
     * @param fromAccount 转账账户
     * @param toAccount 转入账户
     */
    public boolean accountObtainIs(Account fromAccount,Account toAccount) {

        if (accounts.contains(fromAccount) || accounts.contains(toAccount)) {

            return false;
        }

        accounts.add(fromAccount);
        accounts.add(toAccount);

        return true;
    }


    /**
     * 资源释放
     *
     * @param fromAccount 转账账户
     * @param toAccount 转入账户
     */
    public void free(Account fromAccount,Account toAccount) {

        accounts.remove(fromAccount);
        accounts.remove(toAccount);
    }

}
