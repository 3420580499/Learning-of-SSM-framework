package com.good;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;

/**
 * @author 小白
 * @create 2021/6/9
 */
public class ConUtils {
    public static Connection getCon() throws Exception{
        ResourceBundle bundle = ResourceBundle.getBundle("jdbc");
        String driver = bundle.getString("driver");
        String url = bundle.getString("url");
        String name = bundle.getString("username");;
        String password = bundle.getString("password");
        Class.forName(driver);
        Connection con = DriverManager.getConnection(url,name,password);
        return con ;
    }
}
