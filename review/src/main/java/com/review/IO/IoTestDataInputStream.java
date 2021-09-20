package com.review.IO;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * @author 小白
 * @create 2021/2/23
 */

/**
 * 先往文件写数据,在读数据,要不然会报错
 */
public class IoTestDataInputStream {
    public static void main(String[] args) throws  Exception{
        DataInputStream dataInputStream =new DataInputStream(new FileInputStream("D:\\maven\\review\\data.txt"));
        int a=dataInputStream.readInt();
        float b =dataInputStream.readFloat();
        char c =dataInputStream.readChar();
        System.out.println(a+b);
        System.out.println(c);
    }
}
