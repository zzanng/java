package javabasic.jdbc.guest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javabasic.jdbc.ConnectionUtil;

public class GuestDao {

	// data access o

	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;

	
	GuestDao() {
		conn = ConnectionUtil.getConnection();
		
	}
	
	//list
	public List<Guest> listGuest() throws SQLException{
		String sql = " select gno ,gname,gage,gagender,gsid,gconndt from order by gno desc ";
		pstmt = conn.prepareStatement(sql);
		rs= pstmt.executeQuery();
		List<Guest> guestList = null;
		while (rs.next()) {
			Guest guest= new Guest();
				rs.getInt("gno");
				rs.getString("gname");
				rs.getInt("gage");
				rs.getString("gsid");
				rs.getString("gagender");
				rs.getDate("gconndt");
		};
		guestList.add(guest);
	}return guestList;
	
	//리스트 한건 조회 
	public Guest getGuest(int gno) throws SQLException{
		String sql = " selet gno ,gname,gage,gagender,gsid,gconndt from order by gno desc ";
		sql += " from guest where gno=? order by gno desc ";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, gno);
		rs= pstmt.executeQuery();
		List<Guest> guestList = null;
		if (rs.next()) {
			Guest guest= new Guest();
				rs.getInt("gno");
				rs.getString("gname");
				rs.getInt("gage");
				rs.getString("gsid");
				rs.getString("gagender");
				rs.getDate("gconndt");
		};
		guestList.add(guest);
	return guestList;
	}
	
	//insert 등록
	public int insertGuest(Guest guest) throws SQLException{
		String sql = " insert into guest value (seq_guest.nextval,?,?,?,?,sysdate ";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1,guest.getgName());
		pstmt.setInt(2,guest.getgAge());
		pstmt.setString(3,guest.getgGender());
		pstmt.setString(4,guest.getgSid());
		return pstmt.executeUpdate();
	}
	//update 수정
	public int updateGuest(Guest guest) throws SQLException{
		String sql = " update guest set gName=?, gage=?, ggender=?,gsid=? where gno=? ";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1,guest.getgName());
		pstmt.setInt(2,guest.getgAge());
		pstmt.setString(3,guest.getgGender());
		pstmt.setString(4,guest.getgSid());
		pstmt.setInt(5,guest.getGno());
		return pstmt.executeUpdate();
	}
	
	//delete 삭제
	public Guest deleteGuest(int gno) throws SQLException{
		String sql = " delete from guest where gno=? ";
		pstmt = conn.prepareStatement(sql);	
		pstmt.setInt(1,gno);
		return pstmt.executeUpdate();
	}
	
	
	
	
	

}//class
