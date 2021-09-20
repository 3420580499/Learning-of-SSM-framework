package com.review.socket.TCPTest01;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author 小白
 * @create 2021/4/9
 */
public class Client {
    public static void main(String[] args) throws Exception{
        Socket socket=new Socket("127.0.0.1",12121);
        OutputStream out=socket.getOutputStream();
        out.write("Hello,服务端".getBytes());

        out.flush();
        out.close();
        socket.close();

       /* InputStream in = socket.getInputStream();
        InputStreamReader reader= new InputStreamReader(in);
        BufferedReader bufferedReader =new BufferedReader(reader);
        System.out.println(bufferedReader.readLine());*/

        /*out.flush();
        out.close();
        bufferedReader.close();
        socket.close();*/
    }
}
