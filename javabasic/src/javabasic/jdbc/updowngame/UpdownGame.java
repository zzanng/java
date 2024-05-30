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

	public UpdownGame(HashMap<String, Integer> userMap, String nick, int sol, int count, int rank,
			Timestamp createDate) {
		super();
		this.userMap = userMap;
		this.nick = nick;
		this.sol = sol;
		this.count = count;
		this.rank = rank;
		this.createDate = createDate;
	}

	public HashMap<String, Integer> getUserMap() {
		return userMap;
	}

	public void setUserMap(HashMap<String, Integer> userMap) {
		this.userMap = userMap;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public int getSol() {
		return sol;
	}

	public void setSol(int sol) {
		this.sol = sol;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public Timestamp getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "UpdownGame [userMap=" + userMap + ", nick=" + nick + ", sol=" + sol + ", count=" + count + ", rank="
				+ rank + ", createDate=" + createDate + "]";
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

	


}
}
