package javabasic.jdbc.updowngame;

import java.util.Scanner;

public class UpdownGameMain {
	
	
	public static void main(String[] args) {
		UpdownGame ug = new UpdownGame();
		Scanner sc = new Scanner(System.in);
		
		//유저 생성  
		ug.UserInfo();
		
		//게임 시작 or 랭커 조회 
		
		
		//난수 생성 -메소드 
		ug.solution();
		//숫자 입력 -메소드
		ug.gameStart();
		//결과 입력값+up/down  - > 카운트 횟수 출력 
		//랭커 발표 출력 1등,2등,3등
		
		
		
	}//main


	
}//class
