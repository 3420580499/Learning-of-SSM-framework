package com.review.IO;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * @author 小白
 * @create 2021/2/24
 */
public class IoTestObjectInputStream {
    public static void main(String[] args) throws  Exception{
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("D:\\maven\\review\\student"));
        Student stu = (Student) objectInputStream.readObject();
        System.out.println(stu);
    }
}
