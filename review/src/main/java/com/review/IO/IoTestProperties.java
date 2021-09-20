package com.review.IO;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * @author 小白
 * @create 2021/2/24
 */
public class IoTestProperties {
    public static void main(String[] args) throws Exception{
        /**
         * Properties是一个map集合,key和value都是String类型
         * 想将info文件中的数据加载到Properties对象中
         */
        //新建一个输入流对象
        FileInputStream fis = new FileInputStream("D:\\maven\\review\\info.properties");
        //新建一个map集合
        Properties properties = new Properties();
        //调用Properties对象的load方法将文件中的数据加载到map集合中
        properties.load(fis);
        //通过key来获取value
        String username =properties.getProperty("username");
        System.out.println(username);
        String password =properties.getProperty("password");
        System.out.println(password);
    }
}
