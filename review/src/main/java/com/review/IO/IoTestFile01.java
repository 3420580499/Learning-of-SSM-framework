package com.review.IO;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 小白
 * @create 2021/2/24
 */
public class IoTestFile01 {
    public static void main(String[] args) throws Exception{
        File file = new File("D:\\maven\\review\\read.txt");
        //如果不存在,以文件的形式创建
        //file.createNewFile();
        //如果不存在,以目录的形式创建
        //file.mkdir()

        //获取文件的父路径:D:\maven\review
        System.out.println(file.getParent());
        System.out.println(file.getParentFile());
        //获取绝对路径:D:\maven\review\read.txt
        System.out.println(file.getAbsolutePath());
        //获取文件名
        System.out.println(file.getName());
        //判断是否是目录
        System.out.println(file.isDirectory());
        //判断是否是文件
        System.out.println(file.isFile());
        //获取文件的最后修改时间
        long longTime = file.lastModified();
        Date date= new Date(longTime);
        SimpleDateFormat time =new SimpleDateFormat("yyyy-MM-dd,HH:mm:ss SSS");
        //String nowTime = time.format(date);
        String nowTime = time.format(longTime);
        System.out.println(nowTime);
        //获取文件大小(单位是字节)
        System.out.println(file.length());
    }
}
