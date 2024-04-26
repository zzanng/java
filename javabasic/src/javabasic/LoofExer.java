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
		
//		for (int i=0; i<5; i++) {
//			for(int k=0; k<4-i; k++){
//				System.out.print(" ");
//			}
//			for(int j=0; j<i; j++) {				
//				System.out.print("*");
//				}									
//			}
//			System.out.println();

		
		//왜 이게 댐?
//		for(int i=0; i<5; i++) {
//			for(int k=0; k<4-i; k++){
//				System.out.print(" ");
//		}
//			for (int j=0; j<=i; j++)
//				if(j<5) {
//				System.out.print("*");
//				}
//
//				System.out.println();
//		}
//
//		
		
		
//		
		// 별찍기3
//	    *****
//		****
//		***
//		**
//		*
//			for (int i=5; i<0; i--) {
//			for(int j=0; j<i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//			}
//			
//			
		

			// 별찍기4
//		    *****
//			*   *
//			*   *
//			*   *
//			*****
//		
//		for(int i=0; i<5; i++) {
//		for (int j=0; j<5; j++)
//			if(i%4==0 || j%4==0 ) {
//			System.out.print("*");
//			}else {
//				System.out.print(" ");
//			}
//
//			System.out.println();
//		}
//		
//		
		
//		별찍기 5
//		*****
//		* * *
//		** **
//		* * *
//		*****
		
		
//		
//		for(int i=0; i<5; i++) {
//		for (int j=0; j<5; j++)
//			if(i%4==0 || j%4==0 || i==j || i+j==4) { // (2,2) 중복이 있음 
//			System.out.print("*");
//			}else {
//				System.out.print(" ");
//			}
//
//			System.out.println();
//		}
//		
//		
//		
//		
//		for(int i=0; i<5; i++) {
//		for (int j=0; j<5; j++)
//			if(i%4==0 || j%4==0 || i==j || j-i==2) {
//			System.out.print("*");
//			}else {
//				System.out.print(" ");
//			}
//
//			System.out.println();
//		}
//		
		
//		별찍기 6
//		*****
//		   *  
//		  * 
//		 *
//		*****
		int keyn = 4;
		for(int i=0; i<keyn+1; i++) {
		for (int j=0; j<keyn+1; j++)
			if(i%keyn==0 || j+i==keyn) {
			System.out.print("*");
			}else {
				System.out.print(" ");
			}

			System.out.println();
		}
		
		
		
		
//		별찍기 7
//		*   *
//		*   *    
//		*****
//		*   *
//		*   *   
		
//		for(int i=0; i<keyn+1; i++) {
//		for (int j=0; j<keyn+1; j++)
//			if(j%keyn==0 || i==2 ) {
//			System.out.print("*");
//			}else {
//				System.out.print(" ");
//			}
//
//			System.out.println();
//		}
		
		
		
		for(int i=0; i<keyn+1; i++) {
		for (int j=0; j<keyn+1; j++)
			if(j%keyn==0 || (keyn/2)==i) {
			System.out.print("*");
			}else {
				System.out.print(" ");
			}

			System.out.println();
		}
		
		
		
		
//		별찍기 8
//		  *
//		 ***    
//		*****
//		 ***
//		  *   
		for(int i=0; i<keyn+1; i++) {
		for (int j=0; j<keyn+1; j++)
			if((keyn/2)==i || (keyn/2)==j   ) {
				
			System.out.print("*");
			}else {
				System.out.print(" ");
			}

			System.out.println();
		}
		
		
		
		
		
	}//main

}//class
