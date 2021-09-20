package com.review.IO;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * @author 小白
 * @create 2021/2/24
 */
public class IoTestObjectOutputStream {
    public static void main(String[] args) throws Exception{
        ObjectOutputStream objectOutputStream =new ObjectOutputStream(new FileOutputStream("D:\\maven\\review\\student"));
        Student stu = new Student("张飞",23);
        objectOutputStream.writeObject(stu);
        objectOutputStream.flush();
        objectOutputStream.close();
    }
}
