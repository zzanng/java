package javabasic.jdbc.todo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.rowset.WebRowSet;

import javabasic.AccountMain;
import javabasic.jdbc.ConnectionUtil;
import oracle.jdbc.proxy.annotation.Pre;

public class TodoLogic {
	
	Connection conn;
	
	TodoLogic(){
		conn = ConnectionUtil.getConnection();
	

		
	}
	
	
	public static void main(String[] args) throws Exception {
		TodoLogic  todoLogic = new TodoLogic();
		/*
		 * //등록
		Todo testTodo = new Todo(0,"테스트 todo",null,null);
		int result =todoLogic.writeTodo(testTodo);
		if(result > 0) {
			System.out.println("등록성공");
		}
		
		*/
		
		//삭제
		/*
		Todo testTodo = new Todo(1,null,null,null);
		int result =todoLogic.deleteTodo(testTodo);
		if(result > 0) {
			System.out.println("삭제성공!");
		}
		*/
		//리스트 
		System.out.println(todoLogic.listTodo());
		
	}
	
	//리스트 
	public List<Todo>listTodo() throws Exception {
		String sql = " select tdid, tdcontent, tdcomplete,tdregdate from todo ";
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		
		List<Todo> todoList = new ArrayList<Todo>();
		while (rs.next()) {
			Todo todo = new Todo();
			todo.setTdid(rs.getInt("tdid"));
			todo.setTdcontent(rs.getString("tdcontent"));
			todo.setTdcomplete(rs.getString("tdcomplete"));
			todo.setTdregdate(rs.getTimestamp("tdregdate"));
			todoList.add(todo);
			
		}return todoList;
		
		}
	
	
	//등록
	public int writeTodo(Todo todo) throws Exception{
		String sql = " insert into todo ";
		sql += " values(todo_seq.nextval,?,'N',sysdate) ";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, todo.getTdcontent());		
	return pstmt.executeUpdate();
	}

	
	
	//삭제 
	public int deleteTodo(Todo todo) throws Exception{		
		String sql = " delete todo where tdid=? ";
		sql += " values(todo_seq.nextval,?,'N',sysdate) ";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, todo.getTdid());	
		return pstmt.executeUpdate();
	}

}
