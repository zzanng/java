package javabasic.oop.animal;

public abstract class AstractPlant implements ILight {

	String name;
	
	@Override
	public void breath() {
		System.out.println(name+ "숨을쉰다.");
	}

	@Override
	public void growth() {
		System.out.println(name+ "성장한다.");
	}

	@Override
	public void light() {
		System.out.println(name+ "광합성한다.");
	}

}
