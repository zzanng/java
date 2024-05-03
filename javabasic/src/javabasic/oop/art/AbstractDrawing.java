package javabasic.oop.art;

public abstract class AbstractDrawing implements IDrawing {

	String name;
	
	@Override
	public void create() {
		System.out.println(name+ "창작하다.");
	}

	@Override
	public void sketch() {
		System.out.println(name+ "스케치하다.");

	}

	@Override
	public void coloring() {
		System.out.println(name+ "색칠하다.");

	}

}
