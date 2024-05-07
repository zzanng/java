package javabasic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedList {
	
	public static void main(String[] args) {
		
		List<String>al = new ArrayList<String>();
		List<String>ll = new LinkedList<String>();
		
		long alStartTime = System.currentTimeMillis();
			al.add("ArrayList" + i);
			
			long alStartTime2 = System.currentTimeMillis();
			for (int i =0; i<1000000 ;i++ ) {
		} System.out.println(al.get(i));
		
		long alEndTime = System.currentTimeMillis();
		
		long llStartTime2 = System.currentTimeMillis();
		for (int i =0; i<1000000 ;i++ ) {
			al.add("LinkedList" + i);
		}
		
		long llEndTime = System.currentTimeMillis();
		
		long llStartTime2 = System.currentTimeMillis();
		for (int i =0; i<1000000 ;i++ ) {
			System.out.println(ll.get(i));
		}
		
		long llEndTime2 = System.currentTimeMillis();
				
		
		System.out.println(alEndTime-alStartTime);
		System.out.println(llEndTime-llStartTime);
		
		System.out.println(alEndTime2-alStartTime2);
		System.out.println(llEndTime2-llStartTime2);
		
		
	}

}
