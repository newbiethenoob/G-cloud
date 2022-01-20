package gcloud.kdt.network.multichat.server;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class ChatThread extends Thread {
	private Socket socket;	
	private BufferedReader chatIn;
	private PrintWriter chatOut;
	private boolean flag =false;
	
	public ChatThread(Socket socket){
		this.socket= socket;
		initNetwork();
	}
	
	public void initNetwork() {
		try{
			chatIn= new BufferedReader(new InputStreamReader(socket.getInputStream()));
			chatOut= new PrintWriter(socket.getOutputStream(), true);
		}catch(Exception e){
			e.printStackTrace();
		}		
	}

	@Override
	public void run() {
		try {
			while(!flag){   
				String msg = chatIn.readLine();				
				if(msg != null && !msg.equals("")){
					System.out.println(this);
					ChatServerMain.cct.sendAllmessage(msg);
					if(msg.endsWith("]:¥‘¿Ã ≈¿Â«’¥œ¥Ÿ ")){						
						ChatServerMain.cct.removeChatThread(this);
						flag=true;
					}
				}else{     //æÎ ø÷¿÷¥¬∞≈¿”?
					
				}				
			}
			chatIn.close();
			chatOut.close();
			socket.close();			
		}catch (Exception e) {
			ChatServerMain.cct.removeChatThread(this);
			try{
				if(chatIn != null) chatIn.close();
				if(chatOut != null) chatOut.close();
				if(socket != null) socket.close();
			}catch(IOException e1){
				e1.printStackTrace();
			}
		}		
	}
	
	public void sendMessage(String msg){
		chatOut.println(msg);
	}
	
	
	
	
	
	
	
	
	
	
	

}
