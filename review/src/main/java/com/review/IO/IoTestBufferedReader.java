package com.review.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

/**
 * @author 小白
 * @create 2021/2/23
 */
//带有缓冲区的字符输入流
public class IoTestBufferedReader {
    public static void main(String[] args) throws Exception{
        FileReader reader =new FileReader("D:\\maven\\review\\write.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        System.out.println(bufferedReader.readLine()+"\n"+bufferedReader.readLine());
        bufferedReader.close();
    }
}
