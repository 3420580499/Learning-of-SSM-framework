package com.review.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 小白
 * @create 2021/2/23
 */
public class IoTestFileOutputStreamOne {
    public static void main(String[] args) {
        FileOutputStream fos =null;
        try{
            //加入true就不会清除文件原有的内容
            fos = new FileOutputStream("D:\\maven\\review\\read.txt",true);
            byte[] bytes = {'a','b','C'};
            fos.write(bytes);
            fos.flush();
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            if(fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
