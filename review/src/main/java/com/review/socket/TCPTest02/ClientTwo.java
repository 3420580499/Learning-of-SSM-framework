package com.review.socket.TCPTest02;

import java.io.*;
import java.net.Socket;

/**
 * @author 小白
 * @create 2021/4/9
 */
public class ClientTwo {
    public static void main(String[] args) throws Exception{
        Socket socket=new Socket("127.0.0.2",8848);
        OutputStream out=socket.getOutputStream();
        PrintWriter printWriter =new PrintWriter(out);
        printWriter.println("Hello,服务端");

        printWriter.flush();

        InputStream in = socket.getInputStream();
        InputStreamReader reader= new InputStreamReader(in);
        BufferedReader bufferedReader =new BufferedReader(reader);
        System.out.println(bufferedReader.readLine());

        out.close();
        bufferedReader.close();
        socket.close();


    }
}
