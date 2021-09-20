package test;


import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {
	public static void main(String[] args) throws Exception {
		ServerSocket server5 = new ServerSocket(898);
		List<SocketHandler> users=new ArrayList<SocketHandler>();
		while (true) {
			System.out.println("等待客户连接...");
			Socket socket = server5.accept();
			SocketHandler handler = new SocketHandler(socket,users);
			Thread thread = new Thread(handler);
			thread.start();
		}
	}
}