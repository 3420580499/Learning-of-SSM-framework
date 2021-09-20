package com.review.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 小白
 * @create 2021/2/23
 */
public class IoTestFileCopy {
    public static void main(String[] args) {
        FileInputStream fis =null;
        FileOutputStream fos =null;
        try{
            fis=new FileInputStream("D:\\maven\\review\\read.txt");
            fos=new FileOutputStream("D:\\maven\\review\\write.txt");
            byte [] bytes =new byte[1024*1024];
            int count =0;
            while((count = fis.read(bytes))!=-1){
                fos.write(bytes,0,count);
            }
            fos.flush();
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            if(fos!=null){
                try{
                    fos.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }if(fis!=null){
                try{
                    fis.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
