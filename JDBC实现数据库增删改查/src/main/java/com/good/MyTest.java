package com.good;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author 小白
 * @create 2021/6/27
 */
public class MyTest {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","333");
        String sql = "select * from employee where dz='四川省' and csny < '1989-9-25'";
        Statement sm = con.createStatement();
        ResultSet rs  = sm.executeQuery(sql);
        while(rs.next()){
            System.out.println(rs.getInt(1)+rs.getString(2)+rs.getString(3)+rs.getString(4));
        }
        rs.close();
        sm.close();
        con.close();
    }
}
