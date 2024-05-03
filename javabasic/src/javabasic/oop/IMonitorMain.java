package javabasic.oop;

public class IMonitorMain {

	public static void main(String[] args) {
		
		IMonitor imonitor = new IMonitorimpl();
		imonitor.powerOn();
		imonitor.brightUp();
		imonitor.brightDown();
		imonitor.powerOff();

		
		
	}

}
