package com.review.IO;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * @author 小白
 * @create 2021/2/23
 */
public class IoTestDataOutputStream {
    public static void main(String[] args) throws Exception{
        DataOutputStream dataOutputStream =new DataOutputStream(new FileOutputStream("D:\\maven\\review\\data.txt"));
        int a =10;
        float b =1.0f;
        char c = 'a';
        dataOutputStream.writeInt(a);
        dataOutputStream.writeFloat(b);
        dataOutputStream.writeChar(c);
        dataOutputStream.flush();
        dataOutputStream.close();
    }
}
