package javabasic;

import java.util.ArrayList;
import java.util.List;

import javax.imageio.spi.IIOServiceProvider;

import org.w3c.dom.DOMStringList;

public class Roof {
	
	public static void main(String[] args) {
		
		//i++ 
		//++i 후치
		
		
//		
//		for (int i = 1; i<11; i++) {
//			System.out.println(i);
//		}
//		
//		
////		 실습 1) 11 부터 33까지 반복출력 
//		
//		for (int i =11; i<34; i++ ) {
//			System.out.println(i);
//		}
//		
////		실습 2) 15부터 30까지 홀수만 출력   강사님 답 증감식(i=i+2)
//		for (int i = 15; i<31; i +=2) {
//			System.out.println(i);
//		}
//		
//		
////		실슬 3)3~100 3의 배수 출력
//		for (int i = 3; i<101; i = i + 3  ) {
//			System.out.println(i);
//		}
//		
//		
////		실습 4) 1부터 1000 까지 정수 중에서 5와 7로 나누어 떨어지는 수를 출력 
//		
//		for (int i = 1; i<1001; i++) {
//			if(i % 5 == 0 | i % 7 == 0)
//			System.out.println(i);
//
//		}
		
		
//		실습 5) 1부터 1000 까지 소수(소인수)만 출력
		
		//1일때는 1이 소수이므로 출력
		//1이 아닐때는 현재수부터 마지막 수까지 나눠주기
		//나누어 떨어지는 수의 개수가 1개이면 소수. 그렇지 않으면 소수가 아닌 수
		
//		for (int i = 1; i<1001; i++) {
//			for (int j = 2; j > i; j++)
//				if(i%j == 0)
//			System.out.println(i);
//		} 
//		
//		for (int i = 1; i<1001; i++) {
//		if(isPrime(i)){                                        
//			System.out.println(i);
//		}
//		
//		}
//		
		
//		
//		//enhaced for
//		int [] intArray = {10,20,30,40};
//		for(int i : intArray) {
//			System.out.println(i);
//		}
//		for(int i=0; i<intArray.length; i++) {
//			System.out.println(intArray[i]);
//		}
//		
//		
//
//		
//		
//		List<String> strList = new ArrayList<String>();
//		strList.add("홍길동");
//		strList.add("강감찬");
//		strList.add("유관순");
//		for (String str : strList) {
//			System.out.println(str);
//		}
//		
//		
//		for (int i=0; i<strList.size(); i++)
//		System.out.println(strList.get(i));
//		
//		
//		int k = 10;
//		while (k<100) {
//			System.out.println("k");
//			k++;
//		}
//		
//		int l = 1;
//		while (l<100) {
//			if (l==50) break;   브래이크 만나면 가장가까운 조건식에서 정지
//			l++;
//			if (l%2==0) continue;
//			System.out.println(l);
//		}
//		
		
		
//		실습 1) while 문 이용 하여 10부터 100까지의 정수중에서 3의 배수만 출력
		int m = 10;
		while (m<101) {
			if (m%3 == 0)
			System.out.println(m);
			m++;
		}
		
		
//		실습 2) while 문 이용 하여 10부터 100까지의 정수중에서 3의 배수지만 6의 배수는 아닌 수들만 출력
		
			
		int m1 = 10;
		while (m1<101) {
			if (m1%3 == 0 && m1%6!=0) 
				System.out.println(m);
			}
		
		
//		실습 3) while 문 이용 하여 10부터 100까지의 정수중에서 3의 배수 아닌 것만 출력
		
		int i= 19;
		while (i<101) {
			i++;
			if (i%3 == 0)continue;
			System.out.println(i);		
			}
		
		
		int i= 1;
		do { 
			System.out.println(i);
			i++;
		}while (i<10);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main
		
		static boolean isPrime(int n) {
			if(n==1) return true;
			for(int i = 2; i <n; i++) {
				if(n % 1 == 0) return false;
		}
			return true;			
		} 

}//class
