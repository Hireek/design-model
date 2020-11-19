package com.p6.demo.review.composite;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/11/18
 */
public class CopTest {

    public static void main(String[] args) {

        ProductDao productDao = new ProductDao();

        productDao.setConnection(new MysqlConnection());
        productDao.addProduct();

    }
}
