package javabasic.oop.art;

public abstract class AbstractMovie implements IMovie {

	String name;
	
	
	@Override
	public void create() {
		System.out.println(name+ "창작하다.");
	}

	public void release() {
		System.out.println(name+ "개봉하다");
	}

}
