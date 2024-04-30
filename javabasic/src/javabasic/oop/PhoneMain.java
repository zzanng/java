package javabasic.oop;

public class PhoneMain {
	public static void main(String[] args) {
		
		//객체 생성
		
		Phone phone1 = new Phone();
		Phone.objCount++;
		Phone phone2 = new Phone();
		Phone.objCount++;
		Phone phone3 = new Phone();
		Phone.objCount++;
		
		
		
		//객체 데이터 설정
		phone1.mfName = "아이폰";
		phone1.version = 14;
		phone1.tellecomName = "KT";
		
		phone2.mfName = "갤럭시";
		phone2.version = 24;
		phone2.tellecomName = "U+";
		
		phone3.mfName = "샤오미";
		phone3.version = 10;
		phone3.tellecomName = "SK";
		
		//객체 데이터 출력
		System.out.println(phone1.mfName+"기종의 버전은 "+phone1.version +"이고 통신사는 "+ phone1.tellecomName+"이다.");
		System.out.println(phone2.mfName+"기종의 버전은 "+phone2.version +"이고 통신사는 "+ phone2.tellecomName+"이다.");
		System.out.println(phone3.mfName+"기종의 버전은 "+phone3.version +"이고 통신사는 "+ phone3.tellecomName+"이다.");
		
		
		//객체 메소드 호출 
		phone1.call();
		phone1.camera();
		phone2.call();
		phone2.camera();
		phone3.call();
		phone3.camera();
		
		
		//생성된 객체 수 
		System.out.println("총 " +Phone.objCount+ "개의 객체가 생성됨.");
		System.out.println("총 " +Phone.getObjCount()+ "개의 객체가 생성됨.");
		
		
		
		
		
	} //main

}//class
