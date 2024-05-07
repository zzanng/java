package javabasic;

import java.awt.geom.Area;

public class AgrRestrictMain {

	public static void main(String[] args) {
		
		int age = 15;
		if (age < 19) {
			try {
			throw new AgeRestrictException(); //사용자 정의 예외
			} catch (AgeRestrictException are) {
				are.printStackTrace();
			}
		}

	}

}
