package com.review.IO;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 小白
 * @create 2021/2/23
 */
public class IOTestFileWriter {
    public static void main(String[] args) {
        FileWriter writer =null;
        try{
            writer = new FileWriter("D:\\maven\\review\\write.txt");
            char [] chars = {'胡','康','安','是','一','个','憨','批'};
            writer.write(chars);
            writer.flush();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(writer !=null){
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
