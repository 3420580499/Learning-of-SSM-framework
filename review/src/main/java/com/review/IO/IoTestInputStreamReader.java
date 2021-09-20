package com.review.IO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * @author 小白
 * @create 2021/2/23
 */
//InputStreamReader:转换流(将字节流转换为字符流)
public class IoTestInputStreamReader {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("D:\\maven\\review\\read.txt");
        InputStreamReader reader=new InputStreamReader(fis);
        BufferedReader bufferedReader =new BufferedReader(reader);
        String line =null;
        while((line=bufferedReader.readLine())!=null){
            System.out.println(line);
        }
        bufferedReader.close();

    }
}
