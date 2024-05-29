package javabasic.jdbc.updowngame;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Scanner;

import javabasic.jdbc.guest.Guest;

public class UpdownGame {
	
	HashMap<String,Integer> userMap = new HashMap<String, Integer>();
	private String nick;
	private int sol;
	private int count;
	private int rank;
	private Timestamp createDate;
	
	public UpdownGame() {
		
	}
	
	
	//유저생성, 정보입력 
	public void UserInfo() {
		Scanner input = new Scanner(System.in);
        System.out.println("닉네임 입력 : ");
        nick = input.next();     
        if (!userMap.containsKey(nick)) {
            userMap.put(nick, 0);
            System.out.println(nick+"님 환영합니다. 사용자 등록이 정상적으로 처리 되었습니다.");
        } else {
            System.out.println("이미 등록된 사용자 입니다. 사용자 이름을 입력하세요.");
            UserInfo();
        }
    }

	
//insert 등록
//	public int insertGuest(Guest guest) throws SQLException{
//		String sql = " insert into guest value (seq_guest.nextval,?,?,?,?,sysdate ";
//		pstmt = conn.prepareStatement(sql);
//		pstmt.setString(1,guest.getgName());
//		pstmt.setInt(2,guest.getgAge());
//		pstmt.setString(3,guest.getgGender());
//		pstmt.setString(4,guest.getgSid());
//		return pstmt.executeUpdate(); 
//		}
	
	//정답만들기 (난수생성 메소드)
	public int solution() {
		sol = (int) (Math.random()*100+1); // 1부터 100까지의 정수 난수
		return sol;
		}
	
	
	//게임 진행 
    public void gameStart() {// 게임 시작 메소드
    	
  
        Scanner input = new Scanner(System.in);
        System.out.println("닉네임을 입력하세요 : ");
        nick = input.next();
            System.out.println(nick+"님 게임을 시작하겠습니다.");
            count = 0;    
        while (true) {
            System.out.print("수를 입력하세요. : ");
            int inputNum = input.nextInt();
            if (inputNum == sol) {
                System.out.println(inputNum + " 정답입니다!");
                count++;
                break;
            }else if(inputNum > sol) {
                System.out.println(inputNum + "보다 Down!");
                count++;
                continue;
            }else if(inputNum < sol) {
                System.out.println(inputNum + "보다 Up!");
                count++;
                continue;
            }else if (inputNum > 100 || inputNum < 0) {
                System.out.println("범위를 벗어난 수 입니다.");
                continue;
            }
        }System.out.println(nick+"님의 시도횟수는 " + count +"번으로 "+ rank + "등 입니다!");
        
        
        



	


}}
