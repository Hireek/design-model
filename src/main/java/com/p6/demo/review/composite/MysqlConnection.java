package com.p6.demo.review.composite;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/11/18
 */
public class MysqlConnection extends DBConnection{

    @Override
    public String getConnection() {

        return "mysql Connection";
    }
}
