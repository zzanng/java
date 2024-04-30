package javabasic.oop;

public class Phone {
	
	
	static int objCount = 0;  //static은 초기화 해주는 것이 좋다 .
	
	
	
	String mfName;       // ""로 자동초기화
	int version;         // 0으로 초기화
	String tellecomName; // ""로 자동초기화
	
	
	
	static int getObjCount() {
		return objCount;
	}
	
	
	void call() {
		System.out.println(this.mfName+ "이 전화한다.");
	}	
	void messege() {
		System.out.println("문자한다.");
	}	
	void camera() {
		System.out.println(this.mfName+ "이 촬영한다.");
	}
	
	
	
	
	
	

}
