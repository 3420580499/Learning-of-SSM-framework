package com.review.IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author 小白
 * @create 2021/2/23
 */
public class IoTestFileReader {
    public static void main(String[] args)  {
        FileReader reader =null;
        try{
            reader =new FileReader("D:\\maven\\review\\read.txt");
            char [] chars =new char[4];
            int count =0;
            while((count =reader.read(chars))!=-1){
                System.out.print(new String (chars,0,count));
            }
        } catch(IOException e){
            e.printStackTrace();
        }finally{
            if(reader!=null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
