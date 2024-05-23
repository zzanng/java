package javabasic.jdbc.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javabasic.jdbc.ConnectionUtil;

public class StudentMain {

	Connection conn;

	public StudentMain() {
		conn = ConnectionUtil.getConnection();
	}

	public static void main(String[] args) {

		//객체생성
		StudentMain sm = new StudentMain();
	      
	      try {

	    	  //조인 수행결과 행들의 커서 (result set)
	    	  ResultSet rs = sm.getJoinedResultSet();
	    	  
	    	  List<Student> studentList = new InsertData().getStudentList();
	    	  
			//학생수만큼 반복
			for (int i = 0; i < studentList.size(); i++) {
				//과목리스트 선언
				List<Subject> subList = new ArrayList<Subject>();
				//학생별 과목의 수
				int subjectListSize = studentList.get(i).getSubjectList().size();
				

				//과목수 만큼 반복 (1번학생은 3바퀴, 2번은 2바퀴)
				for (int j = 0; j < subjectListSize; j++) {
					
					//결과한행추출 ()커서를 이동시킴)
					rs.next();
					//과목리스트에 과목을 추가
					subList.add(new Subject(rs.getInt("SBNO"), rs.getString("SUBNAME")));
				}
				
				//student 객체 생성 
				Student student = new Student(
						rs.getInt("SNO"), 
						rs.getString("SName"), 
						rs.getInt("SAGE"),
						rs.getString("SGENDER"), 
						subList
						);

			}

		} catch (Exception e) {
			e.printStackTrace();
			}
			

			

		} // main
	//조인쿼리결과를 리절트셋으로 반환
	ResultSet getJoinedResultSet() throws SQLException {
		StringBuilder sb = new StringBuilder();
		sb.append(" SELECT s.SNO, s.SNAME, s.SAGE, s.SGENDER, sb.SBNO, sb.SUBNAME ");
		sb.append(" FROM STUDENT S,SUBJECT SB ");
		sb.append(" WHERE S.SBNO = SB.SBNO  ");
		String joinSql = sb.toString();
		
		Statement stmt = this.conn.createStatement();
		return stmt.executeQuery(joinSql);
	}

}// class
