package com.review.IO;

import java.io.File;

/**
 * @author 小白
 * @create 2021/2/24
 */
public class IOTestFile02 {
    public static void main(String[] args) {
        File file = new File("D:\\maven\\review");
        //获取当前目录下所有子文件(包括目录)
        File [] files = file.listFiles();
        for (File f :files){
            //System.out.println(f.getAbsolutePath());
            System.out.println(f.getName());
        }
    }
}
