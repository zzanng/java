package javabasic;

public class Outer {
	
	static String outerSStr = "outer static String";
	String outerNSStr = " outer non-static String";
	
	//non-static inner class
	class NSInner {
		static String nsinnerSStr = "nsinner static String";
		String nsinnerNSStr = "nsinner non-static String";
		String getOuterS() {
			return outerSStr;
		}
		String getOuterNS() {
			return outerNSStr;
		}
	}
	
	//static inner class
	//시점 차이. 스태틱이 먼저 생성됨.클래스 로딩타임에 올라옴
	static class SInner {
		static String sinnerSStr = "sinner static String";
		String sinnerNSStr = "sinner non-static String";
		String getOuterS() {
			return outerSStr;
		}
//		넌스태틱 메소드는 스태틱 클래스안에 선언할수 없음: 시점의 차이
//		String getOuterNS() {
//			return outerNSStr;
//		}
		
	}
	
	public int add(int a, int b) {
		//local inner class
		//add 메소드의 지역변수 취급. 
		class LInner{
			static String linnerSStr = "linner static String";
			String linnerNSStr = "linner non-static String";
		}
		return a + b; 
	}

}//class
