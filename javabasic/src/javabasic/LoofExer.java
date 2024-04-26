package javabasic;

public class LoofExer {
	public static void main(String[] args) {
		
		// 별찍기1
//		*
//		**
//		***
//		****
//		*****
		
//		for (int i=0; i<5; i++) {
//			for(int j=0; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		// 별찍기2
//		    *
//		   **
//		  ***
//		 ****
//		*****
		
		for (int i=0; i<5; i++) {
			for(int k=0; k<4-i; k++){
				System.out.print(" ");
			}
			for(int j=0; j<i; j++) {				
				System.out.print("*");
				}									
			}
			System.out.println();
		} 
		
//		
		// 별찍기3
//	    ******
//		****
//		***
//		**
//		*
		
		
		
		
	}//main

}//class
