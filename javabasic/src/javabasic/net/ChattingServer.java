package javabasic.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.spi.FileSystemProvider;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import javabasic.net.chat.ClientHandler;

public class ChattingServer {

//	public static final int SERVERSOKET_PORT =9999; 
//
//
//	
//	public static void main(String[] args) {
//		ServerSocket ss = null;
//		
//		try {
//			
//		ss = new ServerSocket(SERVERSOKET_PORT);
//		if (ss !=null) {
//			System.out.println("ServerSocket 생성됨!");
//		}
//		while (true) {
//			
//		Socket svSocket = ss.accept();
//		if (svSocket !=null) {
//			System.out.println("서버 측 Server 생성됨! : " + svSocket);
//			
//		}
//		InputStream is = svSocket.getInputStream();
//		BufferedReader br = new BufferedReader(new InputStreamReader(is));
//		System.out.println(br.readLine());
//		
//		
//		}
//		}catch (IOException ioe) {
//			ioe.printStackTrace();

	
	//클라이언트 핸들러 리스트 = 클라이언트 소켓 리스트 = 클라이언트 송/수신 리스트
	private static List<ClientHandler> clients = new ArrayList<ClientHandler>();

	public static void main(String[] args) throws IOException {

		//서버소캣객체를 5000번 포트로 생성
		ServerSocket serverSocket = new ServerSocket(5000);
		if (serverSocket != null) {
			System.out.println("서버 시작됨! 클라이언트 대기중!");
		}

		//무한히 대기블락킹(accept ) => accept 는 접속요청이 오면 블락킹을 중지
		while (true) {			
			//접속요청이 오면 클라이언트와 송수신할 소켓이 생성됨
			Socket clientCommSocket = serverSocket.accept();
			System.out.println("클라이언트 접속 : " + clientCommSocket);
			//클라이언트핸들러 생성
			ClientHandler clientHandler = new ClientHandler(clientCommSocket, clients);
			//클라이언트 리스트에 클라이언트 저장
			clients.add(clientHandler);
			//클라이언트 핸들러 스레드 시작 = 송수신 시작
			new Thread(clientHandler).start();
		}

	}// main

}// class
