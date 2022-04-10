package pl.coderslab.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

    private static final String DL_URL = "jdbc:mysql://localhost:3306/workshop2?useSSL=false&characterEncoding=UTF-8&serverTimezone=UTC";
    private static final String DL_USER = "root";
    private static final String DL_PASS = "coderslab";


    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DL_URL, DL_USER, DL_PASS);
    }


}
