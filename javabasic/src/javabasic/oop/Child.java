package javabasic.oop;

public class Child extends Parent {
	
	String name;
	int age;
	String job;

	

	Child(String name, int age, String job){
//		super(name,age,job); 컴파일러가 자동으로 넣음
		this.name = name;
		this.age = age;
		this.job = job;
	}
	
	@Override
	void say() {
		System.out.println("자식이 말했다!");
	}
	
	
	
} //class
