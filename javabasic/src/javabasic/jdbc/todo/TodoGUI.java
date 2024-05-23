package javabasic.jdbc.todo;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TodoGUI extends JFrame {

	TodoLogic todoLogic;

	TodoGUI() {
		todoLogic = new TodoLogic();
		init();
	}

	public static void main(String[] args) {
		new TodoGUI();
	}

	// 어플리케이션 초기화 메소드
	private void init() {

		// 리스트화면 설정
		Panel listPanel = new Panel(new FlowLayout());
		List<Todo> todoList = null;
		
		try {
			
			todoList = todoLogic.listTodo();
		for(Todo todo : todoList) {
					
		Panel rowPanel = new Panel(new FlowLayout());
		JLabel todoContent = new JLabel(todo.getTdcontent());
		JLabel todoRegdate = new JLabel(todo.getTdregdate().toString());	
		JButton deleteBtn = new JButton("삭제");
		deleteBtn.setActionCommand(""+todo.getTdid());
		
		
		deleteBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				System.out.println( ae.getSource());
				Todo todo = new Todo(
						Integer.parseInt(ae.getActionCommand()),null,null,null);	
				try {
					
				todoLogic.deleteTodo(todo);
				}catch (Exception ex) {
					ex.printStackTrace();
				}
				
			}

		});
		rowPanel.add(todoContent);
		rowPanel.add(todoRegdate);
		rowPanel.add(deleteBtn);
		listPanel.add(rowPanel);
		}
		}catch (Exception ex) {
			ex.printStackTrace();
		}

		// 메세지 입력화면
		Panel writePanel = new Panel(new BorderLayout());
		JTextField todoTF = new JTextField(20);
		JButton writeBtn = new JButton("등록");

		writeBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String tfText = todoTF.getText();
				if (tfText != null && !tfText.trim().equals("")) {
					Todo todo = new Todo(0, tfText, null, null);
					try {
						todoLogic.writeTodo(todo);
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				}
			}

		});
		writePanel.add(todoTF, BorderLayout.CENTER);
		writePanel.add(writeBtn, BorderLayout.EAST);

		// 전체화면 설정
		this.setTitle(":::JAVA TODO APP:::");
		this.setLayout(new BorderLayout());
		this.setSize(400, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); // x 종료

		this.add(listPanel, BorderLayout.CENTER);
		this.add(writePanel, BorderLayout.SOUTH);

		// 화면 보여줘
		this.setVisible(true);

	}

}// class
