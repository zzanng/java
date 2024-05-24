package javabasic.jdbc.guest;

import java.sql.Connection;

import javabasic.jdbc.ConnectionUtil;
import javabasic.jdbc.Student.StudentMain;

public class GuestMain {
	
	Connection conn;

	public GuestMain() {
		conn = ConnectionUtil.getConnection();
	}

	public static void main(String[] args) throws Exception {
		
		GuestDao guestDao = new GuestDao();
		
		//등록
		Guest guest = new Guest(0,"장보고", 30,"M","999999-1234567",null);
		int result= guestDao.insertGuest(guest);
		if (result>0) {
			System.out.println("등록완료");
		}
		
		
		//수정
		
		//삭제
		//목록
		//한행조회
		//
		
	}//main
	
}//class
