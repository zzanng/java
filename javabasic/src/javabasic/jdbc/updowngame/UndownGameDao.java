package javabasic.jdbc.updowngame;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import javabasic.jdbc.ConnectionUtil;
import javabasic.jdbc.guest.Guest;

public class UndownGameDao {
	
	Connection conn;
	PreparedStatement pstmt;
	UndownGameDao() {
		conn = ConnectionUtil.getConnection();
		
	}
	
	



	    
	 // insert 등록
		public int insertUserInfo(UpdownGame updownGame) throws SQLException{
			String sql = " insert into guest value (seq_guest.nextval,?,?,?,sysdate ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(2,updownGame.getNick());
			return pstmt.executeUpdate(); 
			}
		
		
		//update 수정
		public int updateUserInfo(UpdownGame updownGame) throws SQLException{
			String sql = " update guest set count=?, rank=? where gName=? ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(3,updownGame.getCount());
			pstmt.setInt(4,updownGame.getCount());
			pstmt.setString(2,updownGame.getNick());
			return pstmt.executeUpdate();
		}
		

	    
}
