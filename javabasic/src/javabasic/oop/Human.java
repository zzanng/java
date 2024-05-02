package javabasic.oop;

class Human {
	
	private String name; //클래스 외의 직접 접근 불가    // 프라이빗 하는 이유? 
	private int age;
	
	Human(String name, int age){
		this.name = name;
		this.age = age;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age + 15;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
////	getter 메소드(get + 변수명 대문자 시작)
//	public String getName() {
//		return name;
//	} // 프라이빗 객체를 접근가능하게 해주는 메소드 getName
//
//	
////	setter 메소드 (set + 대문자 시작 변수명)  
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
		
	
}
