package com.p6.demo.design_model.flyweight.pool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Vector;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/12/10
 */
public class ConnectionPool {

    private Vector<Connection> pool;

    private int poolSize = 100;

    private String url = "jdbc:mysql://localhost:3306/test";
    private String username = "root";
    private String password = "root";
    private String driverClassName = "com.mysql.jdbc.Driver";

    public ConnectionPool(Vector<Connection> pool) {

        pool = new Vector<>();

        for (int i = 0; i < poolSize; i ++) {

            try{

                Class.forName(driverClassName);
                Connection conn = DriverManager.getConnection(url,username,password);
                pool.add(conn);

            }catch (Exception ex) {


            }
        }
    }

    public synchronized Connection getConnection() {

        if (pool.size() > 0) {
            Connection connection = pool.get(0);
            pool.add(connection);

            return connection;
        }
        return null;
    }

    public synchronized void release(Connection conn) {

        pool.remove(conn);
    }
}
