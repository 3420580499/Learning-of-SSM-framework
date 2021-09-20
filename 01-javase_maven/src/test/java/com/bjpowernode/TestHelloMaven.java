package com.bjpowernode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author 小白
 * @create 2021/2/6
 */
public class TestHelloMaven {
    @Test
    public void testAdd(){
        System.out.println("我终于成功了");
        HelloMaven hello = new HelloMaven();
        int result = hello.add(10,20);
        Assert.assertEquals(30,result);
    }
    @Test
    public void testAddTwo(){
        System.out.println("2222我终于成功了2222");
        HelloMaven hello = new HelloMaven();
        int result = hello.add(10,20);
        Assert.assertEquals(30,result);
    }
}
