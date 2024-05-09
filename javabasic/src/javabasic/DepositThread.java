package javabasic;

import java.security.PublicKey;

//입금쓰레드 
public class DepositThread extends Thread {

	Account account;
	int amount;
	
	
	DepositThread(Account account,int amount){
		this.account = account;
		this.amount = amount;
		}
		

	@Override
	public void run() {
		
		for(int i=0; i<10;i++) {
			this.account.deposite(this.amount);
			System.out.println(this.amount+"입금됨");
			System.out.println(account);
			try {
				Thread.sleep(2000);
				}catch(InterruptedException ie) {
					ie.printStackTrace();
				}
		}
	}
	
}