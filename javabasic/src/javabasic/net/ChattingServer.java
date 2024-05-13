package javabasic.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.spi.FileSystemProvider;

public class ChattingServer {
	
	public static final int SERVERSOKET_PORT =9999; 


	
	public static void main(String[] args) {
		ServerSocket ss = null;
		
		try {
			
		ss = new ServerSocket(SERVERSOKET_PORT);
		if (ss !=null) {
			System.out.println("ServerSocket 생성됨!");
		}
		while (true) {
			
		Socket svSocket = ss.accept();
		if (svSocket !=null) {
			System.out.println("서버 측 Server 생성됨! : " + svSocket);
			
		}
		InputStream is = svSocket.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		System.out.println(br.readLine());
		
		
		}
		}catch (IOException ioe) {
			ioe.printStackTrace();
		
	
		
		
	}//main
	
}//class
}