package javabasic.jdbc.board;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import javabasic.jdbc.ConnectionUtil;

public class BoardMain {

	Connection conn;
	CallableStatement cstmt;
	
	BoardMain(){
		conn = ConnectionUtil.getConnection();
	}
	
	public static void main(String[] args) throws SQLException{
	
		BoardMain bm = new BoardMain();
		
		//인
//		String sql = " insert into values(seq_board.nextval, ?,?,stsdate ) ";
//		String sql = " { call PROC_INSERT(?,?) } ";
//		bm.cstmt = bm.conn.prepareCall(sql);
//		bm.cstmt.setString(1, "제목 1");
//		bm.cstmt.setString(2, "내용 1");
//		int result = bm.cstmt.executeUpdate();
//		if (result>0) {
//			System.out.println("한행입력완료");
//		}
		
		//아웃,
//		String sql = " { call PROC_INSERT2(?,?,?) } ";
//		bm.cstmt = bm.conn.prepareCall(sql);
//		bm.cstmt.setString(1, "제목 1");
//		bm.cstmt.setString(2, "내용 1");
//		bm.cstmt.registerOutParameter(3, Types.NUMERIC);
//		int result = bm.cstmt.executeUpdate();
//		if (result>0) {
//			System.out.println("한행 입력 완료! ");
//			System.out.println("전체 행의 수 : "+ bm.cstmt.getInt(3));
//		}
//		

		//in out 파라미터
		String sql = " { call proc_inout(?) } ";
		bm.cstmt = bm.conn.prepareCall(sql);
		bm.cstmt.setInt(1,5);
		bm.cstmt.registerOutParameter(1, Types.NUMERIC);
		bm.cstmt.executeUpdate();
		System.out.println(bm.cstmt.getInt(1));
		

		
		
		
		
		
		//java 에서 function 호출
//		String sql = " { ? = call FUNC_COUNT} ";
//		bm.cstmt = bm.conn.prepareCall(sql);
//		bm.cstmt.registerOutParameter(1, Types.NUMERIC);
//		bm.cstmt.executeUpdate();
//		System.out.println("함수 호출후 리턴받은 값 :" + bm.cstmt.getInt(1));
		
		//다른방법도 이싿. 
//		String sql = " select func_count() CNT from dual ";
//		bm.cstmt = bm.conn.prepareCall(sql);
//		ResultSet rs = bm.cstmt.executeQuery();
//		if (rs.next()) {
//			System.out.println(rs.getInt("CNT"));
//		}

		
		
	}//main
}//class
