package com.review.socket.TCPTest03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws Exception{
		Socket socket = new Socket("127.0.0.1",888);
		
		InputStreamReader reader = new InputStreamReader(socket.getInputStream());
		BufferedReader buffer_reader = new BufferedReader(reader);
		
		PrintWriter writer = new PrintWriter(socket.getOutputStream());
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入请求内容:");
		String readline = scanner.nextLine();
		writer.println(readline);
		writer.flush();
		
		String response = buffer_reader.readLine();
		System.out.println("Server say:"+ response);
		
		writer.close(); 
		buffer_reader.close(); 
		socket.close(); 
	}
}
