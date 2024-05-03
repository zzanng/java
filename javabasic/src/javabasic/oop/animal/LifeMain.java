package javabasic.oop.animal;

public class LifeMain {

	public static void main(String[] args) {
		
		ILife dog = new Dog("말티즈");   //객체생성 ILife => 상위타입으로 만들어라.
		ILife cat = new Cat("러시안블루");
		
		ILife rose = new Rose("백장미");
		ILife lily = new Lily("홍백합");
		
		//개를 숨쉬기 
		dog.breath();
		
						
		
		//장미 광합성하기 
//		방법1
//		((IPlant)rose).light();
		
//		방법2 (인터페이스 분리 이용) 
		rose.light();
		
		cat.breath();
		

		
		
		

	}

}
