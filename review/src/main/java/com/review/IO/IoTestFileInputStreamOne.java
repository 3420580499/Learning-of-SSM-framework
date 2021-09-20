package com.review.IO;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author 小白
 * @create 2021/2/23
 */
public class IoTestFileInputStreamOne {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try{
            fis=new FileInputStream("D:\\maven\\review\\read.txt");
            //小写,大写是包装类
            byte [] bytes = new byte[4];
            int count =0;
            while((count = fis.read(bytes)) != -1){
                System.out.print(new String(bytes,0,count));
            }
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
