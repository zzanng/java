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


public class UpdownGameGUI extends JFrame{
	
	
	UpdownGame updownGame;
	
	UpdownGameGUI(){
		updownGame = new UpdownGame();
		init();
	}
	private void init() {

		
		
		JLabel l1 = new JLabel("사용자 이름");
		JLabel l2 = new JLabel("");
		JTextField f1 = new JTextField(15); //15글자를 입력할 수 있는 텍스트필드
		JButton b1 = new JButton("확인"); //가운데 정렬이 디폴트인 FlowLayout
		
//		b1.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				String tfText = f1.getText();
//				if (tfText != null && !tfText.trim().equals("")) {
//			
//					}
//				}
//			}
//
//		});
		//여기서부터 순서 중요함!! FlowLayout이니깐
		add(l1);
		add(f1);
		add(l2);
		add(b1);
		
		
		this.setTitle(":::JAVA UP & DOWN GAME APP:::");
		this.setLayout(new FlowLayout());
		this.setSize(400, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); // x 종료

		
		setVisible(true);
	}

	public static void main(String[] args) {
		new UpdownGameGUI();
	}


	

}// class
