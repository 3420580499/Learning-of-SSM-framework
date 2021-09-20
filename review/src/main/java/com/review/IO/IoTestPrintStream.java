package com.review.IO;

import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * @author 小白
 * @create 2021/2/24
 */
//标准输出流(改变输出方向)
public class IoTestPrintStream {
    public static void main(String[] args) throws Exception{
        PrintStream printStream = System.out;
        printStream.println("标准输出流");
        //改变标准输出流的输出方向
        PrintStream pr = new PrintStream(new FileOutputStream("D:\\maven\\review\\write.txt",true));
        pr.println("改变了输出方向");
        //修改输出方向
        System.setOut(pr);
        System.out.println("可直接输入到文件中去了");
    }
}
