package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws Exception{
		Socket socket = new Socket("127.0.0.1",898);
		Scanner scan=new Scanner(System.in);
		InputStreamReader reader = new InputStreamReader(socket.getInputStream());
		BufferedReader buffer_reader = new BufferedReader(reader);
		PrintWriter writer = new PrintWriter(socket.getOutputStream());
		boolean flag=true;
		while(flag) {			
			String response = buffer_reader.readLine();
			System.out.println("Server say:"+ response);
			System.out.println("请输入");
			String readline = scan.nextLine();			
			if(readline.startsWith("<logout"))
				flag=false;
			writer.println(readline);
			writer.flush();
		}
		writer.close(); 
		buffer_reader.close(); 
		socket.close(); 
	}
}