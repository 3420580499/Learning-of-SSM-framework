package com.good;

import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AppTest {
    @Test
    public void testInsert()throws Exception{
        //实现数据库插入数据功能
        String sql ="insert into person values(?,?,?)";
        Connection con =ConUtils.getCon();
        PreparedStatement pre = con.prepareStatement(sql);
        pre.setString(1,"李四");
        pre.setInt(2,21);
        pre.setString(3,"男");
        int result = pre.executeUpdate();
        System.out.println(result);
    }
    @Test
    public void testSelect()throws Exception{
        //实现数据库查询数据
        String sql = "select * from person";
        Connection con =ConUtils.getCon();
        PreparedStatement pre = con.prepareStatement(sql);
        ResultSet set =pre.executeQuery();
        while(set.next()){
            System.out.println(set.getString(1)+" "+set.getInt(2)+" "+set.getString(3));
        }
    }
    @Test
    public void testDelete()throws Exception{
        //实现数据库删除数据
        String sql = "delete from person where age= ?";
        Connection con =ConUtils.getCon();
        PreparedStatement pre = con.prepareStatement(sql);
        pre.setInt(1,21);
        int result =pre.executeUpdate();
        System.out.println(result);
    }
    @Test
    public void testUpdate()throws Exception{
        //实现数据库更新数据
        String sql = "update person set name=? where age= ?";
        Connection con =ConUtils.getCon();
        PreparedStatement pre = con.prepareStatement(sql);
        pre.setString(1,"张三");
        pre.setInt(2,21);
        int result =pre.executeUpdate();
        System.out.println(result);
    }

}
