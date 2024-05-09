package javabasic;

public class ThreadExer2 {

	public static void main(String[] args) {

		Thread ht = new HelloTread();
		Thread gt = new GoodByeThread();

		ht.start();
//		ht.yield(); //양보 

//		try {
//			ht.join();  //싱행 다하고 나서 ㄱㄱ  
//		} catch (InterruptedException ie) {
//			ie.printStackTrace();
//		}

		gt.start();
		
//		
//		 -activeCount() : 실행중인 쓰레드의 수 
//		 -currentThread() : 현재 실행중인 쓰레드
//		 -getId() :쓰레드의 아이디 
//		 -getName() :쓰레드의 이름
//		 -getPriority() : 쓰레드의 우선순위 (기본5,1~10)
//		 -setPriority() : 쓰레드의 우선순위설정 
//		 -getState() : 쓰레드의 상태
		
		 System.out.println(Thread.activeCount());
		 System.out.println(Thread.currentThread());
		 System.out.println(ht.getId());
		 ht.setName("hello Thread");
		 System.out.println(ht.getName());
		 gt.setName("Goodbye Thread");
		 System.out.println(gt.getName());
		 System.out.println(ht.getPriority());
		 ht.setPriority(10);
		 System.out.println(ht.getState());
		 gt.setPriority(1);
		 
		 
		 
	}

}
