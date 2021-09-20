package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.List;

public class SocketHandler implements Runnable {
	private Socket socket;
	private List<SocketHandler> users;
	BufferedReader buffer_reader;
	PrintWriter writer;
	String name;
	public SocketHandler(Socket socket,List<SocketHandler> users) {
		this.socket = socket;
		this.users=users;
	}
	public String getName(String str) {
		if(!str.contains("name="))
			return "";
		else {
			int beginIndex=str.indexOf("name=")+6;
			int endIndex=str.indexOf("\"",beginIndex);
			return str.substring(beginIndex,endIndex);
		}
	}
	public void run() {
		try {
			buffer_reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			writer = new PrintWriter(socket.getOutputStream());
			writer.println("欢迎...");
			writer.flush();
			while (true) {	
				String request = buffer_reader.readLine();
				String clientName =getName(request) ;
				if( request.startsWith("<logout")){
					writer.println("退出系统");
					writer.flush();
					break;
				}else if( request.startsWith("<login")){
					String state="Error";//假设没有该用户，默认登录失败
					for(SocketHandler user:users) {
						if (user.name.equals(clientName))  //如果用户在用户数组中,即已注册
							state="OK";  //状态为OK
					}
					writer.println("<result command='login' state='"+state+"'>");
					writer.flush();
				}else if( request.startsWith("<register")){
					String state="OK"; //默认注册成功
					for(SocketHandler user:users) {
						if (user.name.equals(clientName))  	//如果其他用户已经使用过这个用户名
							state="重名";  		//注册失败，显示失败原因
					}
					if (state.equals("OK")) {
						this.name=clientName;
						users.add(this); //将注册成功的用户名加入到已注册数组
					}
					writer.println("<result command='register' state='"+state+"'/>");
					writer.flush();
				}else if( request.startsWith("<message")){
					String from=getName(request);//当前登录用户名
					int beginIndex=request.indexOf("to")+4;
					int endIndex=request.indexOf("\"",beginIndex);
					String to=request.substring(beginIndex,endIndex);
					String info=request.substring(request.indexOf("message=")+9);
					writer.println("<result command='message' state='OK'/>");
					writer.flush();
					//将message消息发给用户to
					for(SocketHandler user:users) {
						if(user.name.equals(to)) {
							user.writer.println("<message from="+from+" to="+to+" message="+info);
							user.writer.flush();
							break;
						}
					}
				}						
			}
			writer.close();
			buffer_reader.close();
			socket.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}