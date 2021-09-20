package com.review.socket.TCPTest04;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 小白
 * @create 2021/4/14
 */
public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket =new ServerSocket(999);
        while(true){
            Socket socket=serverSocket.accept();
            ServerHandler handler =new ServerHandler(socket);
            Thread thread =new Thread(handler);
            thread.start();
        }
    }
}
