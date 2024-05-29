package javabasic.jdbc.updowngame;

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

import javabasic.jdbc.todo.Todo;
import javabasic.jdbc.todo.TodoGUI;
import javabasic.jdbc.todo.TodoLogic;

public class UpdownGameGUI extends JFrame{
	
	
	UpdownGame updownGame;
	
	UpdownGameGUI(){
		updownGame = new UpdownGame();
		init();
	}
	

	public static void main(String[] args) {
		new UpdownGame();
	}

	// 어플리케이션 초기화 메소드
	private void init() {

		// 게임화면 설정
		Panel gamepanel = new Panel(new FlowLayout());
		Panel rowPanel = new Panel(new FlowLayout());

		
		rowPanel.add();
		gamepanel.add(rowPanel);	
		
		//입력화면
		Panel writePanel = new Panel(new BorderLayout());
		JTextField ipNick = new JTextField(20);
		JButton writeBtn = new JButton("확인");

		writeBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String tfText = ipNick.getText();
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
		writePanel.add(ipNick, BorderLayout.CENTER);
		writePanel.add(writeBtn, BorderLayout.EAST);

		// 전체화면 설정
		this.setTitle(":::JAVA UP & DOWN GAME APP:::");
		this.setLayout(new BorderLayout());
		this.setSize(400, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); // x 종료

		this.add(gamepanel, BorderLayout.CENTER);
		this.add(writePanel, BorderLayout.SOUTH);

		// 화면 보여줘
		this.setVisible(true);

	}

}// class
