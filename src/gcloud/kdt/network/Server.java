package gcloud.kdt.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	private ServerSocket ss;
	private Socket innerSocket;
	private BufferedReader br;
	private BufferedWriter bw;
	private PrintWriter pw;
	
	public void serverStart() throws Exception{
		ss = new ServerSocket(24244);
		System.out.println("서버소켓이 생성되었습니다.");
		while(true) {
			System.out.println("클라이언트를 기다립니다.");
			innerSocket = ss.accept();
			System.out.println("클라이언트에 연결되었습니다.");
			getMessage(innerSocket);
		}
	}
	
	public void getMessage(Socket innerSocket) throws Exception{
		InputStream is = innerSocket.getInputStream();
//		InputStreamReader isr = new InputStreamReader(is);
//		br = new BufferedReader(isr);
		br = new BufferedReader(new InputStreamReader(innerSocket.getInputStream()));
//		bw = new BufferedWriter(new OutputStreamWriter(innerSocket.getOutputStream()));
//		bw.write("fafadfkl");
//		bw.flush();
//		
//		PrintWriter는 바로 전송
		pw = new PrintWriter(innerSocket.getOutputStream(), true);
		String temp = br.readLine();
		System.out.println("서버쪽에서 클라이언트로부터 받은 문자열 : " + temp);
		
		if(br!=null) br.close();
		if(ss!=null) innerSocket.close();
	}
	
	public static void main(String[] args) throws Exception {
		Server se = new Server();
		se.serverStart();
	}
}
