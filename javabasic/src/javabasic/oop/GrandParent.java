package javabasic.oop;

public class GrandParent {
	
	String name;
	int age;
	String job;
	
	GrandParent(){
	}//기본생성자가 없으면 하위에서 에러.
	
	GrandParent(String name, int age, String job){
		this.name = name;
		this.age = age;
		this.job = job;
	}

	
	void say() {
		System.out.println("할아버님이 말씀하셨다!");
	}
	
	
	
} //class
