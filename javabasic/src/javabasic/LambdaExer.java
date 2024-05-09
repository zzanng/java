package javabasic;

public class LambdaExer {

	public static void main(String[] args) {
		
		//메소드
		printStr("hello");
		//람다표현식
//		str -> System.out.println(str)
		
		
		
		//메소드
		System.out.println(add(10,20));
		//람다표현식
//		(x,y) -> x + y

		
		//메소드
		printStr2("Hi","There");
		//람다표현식
//		(str1+str2) -> {
//			System.out.println(str1);
//			System.out.println(str2);
//		}
		

	}// main

	static void printStr(String str) {
		System.out.println(str);
	}

	static int add(int x, int y) {
		return x + y;
	}

	static void printStr2(String str1, String str2) {
		System.out.println(str1);
		System.out.println(str2);
	}

}// class
