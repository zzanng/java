package javabasic.oop;

public abstract class AbstractIMonitorImpl implements IMonitor {

	@Override
	public void powerOn() {
		System.out.println("전원을 킵니다.");

	}

	@Override
	public void powerOff() {
		System.out.println("전원을 끕니다.");

	}

	@Override
	public abstract void brightUp(); //추상메소드

	@Override
	public void brightDown() {
		System.out.println("밝기를 낮춥니다.");

	}

}
