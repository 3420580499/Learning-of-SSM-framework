package com.review.socket.TCPTest04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author 小白
 * @create 2021/4/14
 */
public class ServerHandler implements Runnable {
    private Socket socket;
    public ServerHandler(Socket socket){
        this.socket=socket;
    }

    @Override
    public void run() {
        try{
            InputStreamReader reader = new InputStreamReader(socket.getInputStream());
            BufferedReader buffer_reader=new BufferedReader(reader);
            PrintWriter writer=new PrintWriter(socket.getOutputStream());

            String request = buffer_reader.readLine();

            System.out.println("Client say:" + request);

            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入响应内容:");
            String line = scanner.nextLine();
            writer.println(line);
            writer.flush();

            writer.close();
            buffer_reader.close();
            socket.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
