package javabasic.oop;

public class MethodExer2 {

	public static void main(String[] args) {
		
//		System.out.println(MethodExer2.calc(10,20,"+"));
//		System.out.println(MethodExer2.calc(10,20,"-"));
//		System.out.println(MethodExer2.calc(10,20,"*"));
//		System.out.println(MethodExer2.calc(10,20,"/"));
		
		System.out.println(MethodExer2.add(10,20));
		System.out.println(MethodExer2.sub(10,20));
		System.out.println(MethodExer2.mul(10,20));
		System.out.println(MethodExer2.dev(10,20)); //10,20 인자 
		
		
	}//main
 
	
//	 하나의 메소드는 하나의 기능만 해라
	 
	static int add(int x , int y) {   //int x , int y 파라미터
		return x + y;
	}
	static int sub(int x , int y) {
		return x - y;
	}
	static int mul(int x , int y) {
		return x * y;
	}
	static int dev(int x , int y) {
		return x / y;
	}
	
	
	
	
//	static int calc(int x , int y, String oper) {
//		if (oper.equals("+")) {
//			return x + y;
//		}else if (oper.equals("-")) {
//			return x - y;
//		}else if (oper.equals("*")) {
//			return x * y;
//		}else {
//			return x/y;
//		}
//				}
	
	
}
