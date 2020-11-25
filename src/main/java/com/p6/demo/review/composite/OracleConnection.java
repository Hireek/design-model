package com.p6.demo.review.composite;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/11/18
 */
public class OracleConnection  extends DBConnection{

    @Override
    public String getConnection() {

        return "oracle connection";
    }
}
