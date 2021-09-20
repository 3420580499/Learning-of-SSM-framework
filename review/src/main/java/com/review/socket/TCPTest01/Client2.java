package com.review.socket.TCPTest01;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author 小白
 * @create 2021/6/28
 */
public class Client2 {
    public static void main(String[] args)throws Exception {
        while(true){
            Socket socket = new Socket("127.0.0.1",111);
            OutputStream out =socket.getOutputStream();
            PrintWriter writer = new PrintWriter(out);
            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入:");
            String str = scanner.next();
            writer.println(str);

            //这里一定要flush
            writer.flush();
            if(str.equals("goodbye")){
                break;
            }
        }
    }
}
