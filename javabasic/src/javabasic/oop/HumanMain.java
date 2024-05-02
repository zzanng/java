package javabasic.oop;

class HumanMain {
	
	public static void main(String[] args) {
		
		Human human1 = new Human("홍길동",89);
//		System.out.println(human1.name); //private 이므로 직접접근이 불가.
		System.out.println(human1.getName());
		
//		human1.name = "강감찬" ; //private 이므로 직접접근이 불가.
		human1.setName("강감찬");
			
		human1.setAge(50);
		System.out.println(human1.getAge());
		
	
		
	}

}
