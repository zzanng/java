package javabasic;

public class MissException extends Exception {
	
	@Override
	public String getMessage() {
		return "경찰서에 대리전화";
	}

}
