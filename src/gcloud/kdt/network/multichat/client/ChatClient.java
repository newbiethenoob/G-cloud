package gcloud.kdt.network.multichat.client;


import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class ChatClient extends JFrame implements ActionListener,Runnable{
	private JTextField chatField;	
	private JTextArea chatContent;
	private BufferedReader chatIn;
	private PrintWriter chatOut;
	private String nickName;
	private boolean flag=false;
	private Socket socket;
	
	public ChatClient(String nickName) {
		super(nickName);
		this.nickName=nickName;
		//익명클래스
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				stop();
				System.exit(0);
			}			
		});
		design();	//창 띄우기
		initNetwork();	//connet to network
		new Thread(this).start();	//constructor 
	}
	
	public void design() {
		Container ca = this.getContentPane();
		JPanel southPanel = new JPanel();
		chatField= new JTextField(20);
		chatField.addActionListener(this);
		JButton	jb = new JButton("Send");
		jb.addActionListener(this); //actionListener가 와야하는데 actionListener의 자식인 chatclient가 대신오는것 (this)
		
		southPanel.add(chatField);
		southPanel.add(jb);
		chatContent = new JTextArea();
		chatContent.setLineWrap(true);
		chatContent.setEditable(false);
		
		ca.add(southPanel, BorderLayout.SOUTH);
		ca.add(new JScrollPane(chatContent), BorderLayout.CENTER);
	}
	
	public void initNetwork(){
		try {
			socket = new Socket("localhost", 22244);
			chatIn=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			chatOut =new PrintWriter(socket.getOutputStream() ,true);
			sendMessage("["+nickName+"]님이 입장했습니다");
		}catch (Exception e) {
			e.printStackTrace();
		}	
	}	

	@Override
	public void run() {
		try {
			while(!flag){
				String msg = chatIn.readLine();				
				if(msg != null && !msg.equals("")){
					chatContent.append( msg +"\n");
					chatContent.setCaretPosition(chatContent.getText().length());	//scroll bar가 밑으로 따라다니게 하는 코드				
				}else{
					stop();
				}				
			}
			chatIn.close();
			chatOut.close();
			socket.close();			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String message=chatField.getText();
		if(!message.equals("")) {
			sendMessage("["+nickName+"]"+message);
			chatField.setText("");
		}
	}
	
	public void sendMessage(String message) {
		chatOut.println(message);
	}
	
	public void stop(){
		sendMessage("[" + nickName + "]:님이 퇴장합니다" );
		flag=true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
