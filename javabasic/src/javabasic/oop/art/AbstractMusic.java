package javabasic.oop.art;

public class AbstractMusic implements IMusic {

	String name;
	
	
	@Override
	public void create() {
		System.out.println(name+ "창작하다.");
	}

	@Override
	public void Play() {
		System.out.println(name+ "연주하다.");
	}

}
