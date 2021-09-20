package com.review.Thread.一对一通信;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 小白
 * @create 2021/6/28
 */
public class Server {
    public static void main(String[] args)throws Exception {
        ServerSocket serverSocket = new ServerSocket(111);
        while(true){
            Socket socket = serverSocket.accept();
            InputStream in = socket.getInputStream();
            InputStreamReader reader = new InputStreamReader(in);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String str = bufferedReader.readLine();
            System.out.println("echo"+str);
            PrintWriter writer = new PrintWriter(socket.getOutputStream());
            writer.println(str);
            writer.flush();

            if(str.equals("goodbye")){
                System.out.println("在您吗的见");
                break;
            }

        }

    }
}
