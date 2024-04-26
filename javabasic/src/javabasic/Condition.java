package javabasic;

import java.util.Scanner;

public class Condition { 
	
	
	public static void main(String[] args) {
		
		int i = 15;
//		범위 지정 이 가능 한 부분 
		if (i <10) {
			System.out.println("i가 10보다 작다.");	
		} else if (i==15) {
			System.out.println("i는 15입니다");
		} else {
			System.out.println("i가 10보다 작지않고 15가 아닙니다. ");
		}
		
		int j = 1;
		
//		범위값 xx 월화수목? 이런거 .
		switch (j){
		case 1 : 
			System.out.println("남성입니다.");
			break;
		case 2 : 
			System.out.println("여성입니다.");
			break;
		default :
			System.out.println("남성도 여성도 아닙니다.");
		} 
		
		
		if (j == 1) {
			System.out.println("남성입니다.");
		} else if (j == 2) {
			System.out.println("여성입니다.");
		} else {
			System.out.println("남성도 여성도 아닙니다.");
		}
		
		
//	    실습 1)
//		두 개의 int 변수를 만들어 5 와 10 값을 대입
//		두 변수의 합을 sum 이라는 byte 변수
//		sum 변수값이 10 보다 큰지 비교 출력 
		
		int i1 = 5;
		int j1 = 10;
//		int sum  = (byte)i1+ j1;   : 오류. 
		byte sum  = (byte)(i1+ j1);
		
		
		if (sum>10) {
			System.out.println("sum은 10 보다 큽니다.");
		} else {
			System.out.println("sum은 10 보다 같거나 작습니다. ");
		}
		
		
		
//		
//		실습 2)
//		num3 이라는 int 변수 5
//		num4 이라는 int 변수 10
//		sum2 이라는 두변수의 합
//		mul 이라는 두변수의 곱
//		두 변수의 곱에서 두 변수의 합을 뺀값을 result 라는 short변수에 저장 
//		result 가 0~10사이에 있는지 11~20사이에 있는지 21~30사이에 있는지 31~40사이에 있는지 출력해보기.		


		int num3 = 5;
		int num4 = 10;
		int sum2 = num3 + num4;
		int mul = num3 * num4;
		
		short result = (short)(mul - sum2);
		
		// 강사님 답
		if (result>=0 && result<=10) {
			System.out.println("result는 0에서 10사이에 값입니다.");
		}else if (result>=11 && result<=20) {
			System.out.println("result는 11에서 20사이에 값입니다.");
		}else if (result>=21 && result<=30) {
			System.out.println("result는 21에서 30사이에 값입니다.");
		}else if (result>=31 && result<=40) {
			System.out.println("result는 31에서 40사이에 값입니다.");
		} 
		
		
		//내 답		
		if(result < 11) {
			System.out.println("result는 0에서 10사이에 값입니다.");
		} else if (result < 21){
			System.out.println("result는 11에서 20사이에 값입니다.");
		} else if (result < 31){
			System.out.println("result는 21에서 30사이에 값입니다.");
		} else {
			System.out.println("result는 31에서 40사이에 값입니다.");	
		}
		
		
//		실습 3)
//		키보드에서 숫자를 하나 입력받아서 입력받은 숫자를 5로 나눈 나머지를 출력 
		
		Scanner sc = new Scanner(System.in);
		int i3 = sc.nextInt();
//		int i4 = i3 % 5; 생략가능
		System.out.println(i3+ "를 5로 나눈 나머지는 " + i3 % 5 + "입니다.");
		
		sc.close();		

		
		
		
//		실습 4)
//		키보드에서 숫자를 두개 입력받아서 입력받은 두 수의 합을 출력
		Scanner sc2 = new Scanner(System.in);
		int n1 = sc2.nextInt();
		int n2 = sc2.nextInt();
//		int sum3 = n1 +n2;  생략가능
		
		System.out.println("입력받은 두 수의 합은 " + n1 +n2 + "입니다.");
//		System.out.println(sum3);
		
		

//		실습 5)
//		키보드에서 0~6까지 숫자를 입력받아서 0이면 일요일 1이면 월요일.. 출력하기 

		
		Scanner sc3 = new Scanner(System.in);
		int n3 = sc3.nextInt();
		
		switch (n3) {
		case 0: System.out.println("일요일입니다."); break;
		case 1: System.out.println("월요일입니다."); break;
		case 2: System.out.println("화요일입니다."); break;
		case 3:	System.out.println("수요일입니다."); break;
		case 4:	System.out.println("목요일입니다."); break;
		case 5: System.out.println("금요일입니다."); break;
		case 6: System.out.println("토요일입니다."); 
		}
		
				
		







		
		
		
	} //main
} //class
