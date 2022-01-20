package gcloud.kdt.network.multichat.server;


import java.util.Vector;

public class ChatControl extends Vector<ChatThread>{
	
	public synchronized void addChatThread(ChatThread ct) {
		this.add(ct);		
	}
	public synchronized void sendAllmessage(String msg){
		for(ChatThread ct: this){				
			ct.sendMessage(msg);
		}
	}
	
	public synchronized void removeChatThread(ChatThread ct) {
		if(this.contains(ct)) {
			this.remove(ct);
		}
	}
	
	
	
	
	
	
	
	
	

}
