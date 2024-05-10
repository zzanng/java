package javabasic.io;

import java.io.Serializable;

public class Person implements Serializable{
	
	public static final long serrialVersionUID = 12345678945625506L;
		
	
	public String name;
	public int age;
	//private String sno;
	
	
	
	public Person(){
		
}

	public Person(String name, int age, String sno) {
		super();
		this.name = name;
		this.age = age;
		this.sno = sno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sno=" + sno + "]";
	}
	
	
	
	
}
