package com.p6.demo.review.composite;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/11/18
 */
public class ProductDao {

    private DBConnection dbConnection;

    public void setConnection(DBConnection dbConnection) {

        this.dbConnection = dbConnection;
    }

    public void addProduct() {

        String conn = dbConnection.getConnection();
        System.out.println("获得数据库连接~");

    }

}
