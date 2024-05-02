package javabasic.oop;

public class Monitor extends Device {

	private int xSize; // 가로폭
	private int ySize; // 세로높이

	Monitor() {
	}

	Monitor(int xSize, int ySize) {
		this.xSize = xSize;
		this.ySize = ySize;
	}

	public int getxSize() {
		return xSize;
	}

	public void setxSize(int xSize) {
		this.xSize = xSize;
	}

	public int getySize() {
		return ySize;
	}

	public void setySize(int ySize) {
		this.ySize = ySize;
	}

	
	@Override
	void on() {
		System.out.println("모니터를 켜다");
	}
	
	@Override
	void off() {
		System.out.println("모니터를 끄다");
	}
}
