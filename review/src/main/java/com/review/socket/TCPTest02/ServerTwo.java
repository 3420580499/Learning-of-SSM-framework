package com.review.socket.TCPTest02;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 小白
 * @create 2021/4/9
 */
public class ServerTwo {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(8848);
        Socket socket = serverSocket.accept();
        InputStream in = socket.getInputStream();
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader bufferedReader = new BufferedReader(reader);
        System.out.println(bufferedReader.readLine());

        /*bufferedReader.close();
        reader.close();
        in.close();
        socket.close();
        serverSocket.close();*/

        PrintWriter writer = new PrintWriter(socket.getOutputStream());
        writer.println("<Hello,客户端>");

        writer.flush();
        writer.close();
        bufferedReader.close();
        socket.close();
        serverSocket.close();


    }
}
