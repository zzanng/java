package javabasic.jdbc.student;

import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.SQLException;

import java.util.ArrayList;

import java.util.List;

import javabasic.jdbc.ConnectionUtil;

public class InsertData {

	Connection conn;

	InsertData() {

		conn = ConnectionUtil.getConnection();

	}

	public static void main(String[] args) {

		InsertData insertData = new InsertData();

		String[] subjectArray = { "국어", "영어", "수학", "과학", "역사" };

		try {

			for (int i = 0; i < subjectArray.length; i++) {

				String sql = " insert into subject values(subject_seq.nextval, '"

						+ subjectArray[i] + "') ";

				insertData.conn.createStatement().execute(sql);

			}

		} catch (SQLException sqle) {

			sqle.printStackTrace();

		}

		List<Student> studentList = new ArrayList<Student>();

		List<Subject> subjectList = new ArrayList<Subject>();

		subjectList.add(new Subject(1, "국어"));

		subjectList.add(new Subject(2, "영어"));

		subjectList.add(new Subject(3, "수학"));

		studentList.add(new Student(0, "홍길동", 20, "M", subjectList));

		subjectList = new ArrayList<Subject>();

		subjectList.add(new Subject(1, "국어"));

		subjectList.add(new Subject(2, "영어"));

		studentList.add(new Student(0, "김길순", 30, "F", subjectList));

		subjectList = new ArrayList<Subject>();

		subjectList.add(new Subject(2, "영어"));

		subjectList.add(new Subject(3, "수학"));

		studentList.add(new Student(0, "최길동", 40, "M", subjectList));

		subjectList = new ArrayList<Subject>();

		subjectList.add(new Subject(1, "국어"));

		subjectList.add(new Subject(3, "수학"));

		studentList.add(new Student(0, "박길순", 50, "F", subjectList));

		subjectList = new ArrayList<Subject>();

		subjectList.add(new Subject(1, "국어"));

		subjectList.add(new Subject(2, "영어"));

		subjectList.add(new Subject(3, "수학"));

		subjectList.add(new Subject(4, "과학"));

		studentList.add(new Student(0, "유길동", 60, "M", subjectList));

		PreparedStatement pstmt = null;

		try {

			for (Student student : studentList) {

				for (Subject subject : student.getSubjectList()) {

					String sql = " insert into student values(student_seq.nextval, ?, ?, ?, ?) ";

					pstmt = insertData.conn.prepareStatement(sql);

					pstmt.setString(1, student.getSname());

					pstmt.setInt(2, student.getSage());

					pstmt.setString(3, student.getSgender());

					pstmt.setInt(4, subject.getSbNo());

					pstmt.executeUpdate();

				}

			}

		} catch (SQLException sqle) {

			sqle.printStackTrace();

		} finally {

			try {

				pstmt.close();

				ConnectionUtil.closeConnection(insertData.conn);

			} catch (SQLException sqle) {

				sqle.printStackTrace();

			}

		}

	} // main

} // class
