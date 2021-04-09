package org.utcn.Controller;

import lombok.SneakyThrows;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String DBURL = "jdbc:mysql://localhost:3306/warehousedb";
    private static final String USER = "root";
    private static final String PASS = "root";

    private static ConnectionFactory singleInstance = new ConnectionFactory();

    @SneakyThrows
    private ConnectionFactory(){
        Class.forName(DRIVER);
    }

    @SneakyThrows
    private Connection createConnection(){
        return DriverManager.getConnection(DBURL);
    }


}
