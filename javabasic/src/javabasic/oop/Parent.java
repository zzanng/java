package javabasic.oop;

//	참조범위가 확장됐다는 의미로 extends 하위클래스로 갈수록 참조범위가 늘어남. 
//  parent는 grandparent 의 메모리 까지 확장한다 .


public class Parent extends GrandParent {	
	
	
	
	String name;
	int age;
	String job;

	Parent(){
	} //기본생성자가 없으면 하위에서 에러.
	
	Parent(String name, int age, String job){
		//기본생성자가 없으면 하위에서 에러.
		this.name = name;
		this.age = age;
		this.job = job;
	}
	
	@Override
	void say() {
		System.out.println("아버님이 말씀하셨다!");
	}
	
	
	
} //class
