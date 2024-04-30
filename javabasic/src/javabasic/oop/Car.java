package javabasic.oop;

public class Car {
	
//	클래스의 데이터= 객체들이 공유 = 정적멤버변수(static member variable)
//	static = class loading 상태 /객체없이 실행하려면, / 시점. 
	static int carCount= 0;
	
	
	
	
//	객체 데이터 = 멤버변수 (non-ststic member variable)
	
	String mfName;    //제조사 
	String carName;   //이름
	String color;     //색상
	int tireCount; //타이어수
	
//	클래스의 메소드 = 객체 없이 호출하여 사용할수 있는 메소드
//	정적 멤버 메소드 (static member method)
	static int getCarCount() {
		return carCount;
	}
	
	
//	객체의 기능 = 멤버 메소드 (non-ststic member method)
//	void //반환값 없다. 
//	this : 메모리에 참조되는 객체 자신을 가리키는 키워드 
	
	
	void startCar() {
		System.out.println(this.carName +"자동차 출발!");
	}
	void stopCar() {
		System.out.println(this.carName +"자동차 정지!");
	}
	void accelCar() {
		System.out.println(this.carName +"자동차 가속!");
	}
	void breakCar() {
		System.out.println(this.carName +"자동차 감속!");
	}
	
}
