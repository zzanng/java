package javabasic.oop;

import java.util.ArrayList;
import java.util.List;

public class DeviceMain {

	public static void main(String[] args) {

//		Device device= new Device();
//		device.setName("장비");
//		device.setPrice(0);
//		device.setWeight(0);
		
//		Device 객체생성 
		Device device = new Device("장비",0,0);
		device.on();
		device.off();
		
//		Monitor 객체생성
		Monitor monitor = new Monitor(50,50);
		monitor.on();
		monitor.off();
		
		
//		Keyboard 객체생성
		Keyboard keyboard = new Keyboard(107,"기계식");
		keyboard.on();
		keyboard.off();
		
		
//		Printer 객체생성
		Printer printer = new Printer(20000,"컬러");
		printer.on();
		printer.off();
		
//		List<Device> deviceList = new ArrayList<Device>();
//		deviceList.add(monitor);
//		deviceList.add(keyboard);
//		deviceList.add(printer);
//		
//		
//		for (Device each : deviceList) {
//			each.on();
//			each.off();
//		}
		List<Object> deviceList = new ArrayList<Object>();
		deviceList.add(monitor);
		deviceList.add(keyboard);
		deviceList.add(printer);
		
		
		for (Object each : deviceList) {
			((Device)each).on();   //  (Device)하위형변환.
			((Device)each).off();
		}
		
		Object device2 = new Device("랜카드",20000,500);
		((Device)device2).on(); //  (Device)하위형변환.

		
		
//		키보드하나 Object 타입으로 만들어서 켜고 꺼보세여. 
		
		Object keyboard1 = new Keyboard(128,"멤브래인");
		((Keyboard)keyboard1).on();
		((Keyboard)keyboard1).off();
		
		
		
		
		
		
	}//main

}//class










