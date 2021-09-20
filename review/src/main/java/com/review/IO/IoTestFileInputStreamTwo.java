package com.review.IO;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author 小白
 * @create 2021/2/23
 */
public class IoTestFileInputStreamTwo {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try{
            fis=new FileInputStream("D:\\maven\\review\\read.txt");
            //小写,大写是包装类
            byte [] bytes = new byte[fis.available()];
            //跳过一个字节不读
            //fis.skip(1);
            fis.read(bytes);
            System.out.println(new String (bytes));
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
