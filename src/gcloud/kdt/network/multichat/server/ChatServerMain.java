package gcloud.kdt.network.multichat.server;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServerMain {
	Socket socket;
	ServerSocket serverSocket;
	static ChatControl cct = new ChatControl();	
	public void startServer(){
		try{
			serverSocket = new ServerSocket(22244);			
			while(true){
				socket=serverSocket.accept();
				ChatThread ct=new ChatThread(socket);
				cct.addChatThread(ct);
				ct.start();	
//				new Thread(ct).start();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ChatServerMain csm = new ChatServerMain();
		csm.startServer();		              
	}

}
