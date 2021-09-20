package com.review.socket.TCPTest03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;
import java.util.Scanner;

public class Server {
	public static void main(String[] args) throws Exception{
		ServerSocket server = new ServerSocket(888);
		Socket socket = server.accept();
 		
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
		server.close();
	}
}
