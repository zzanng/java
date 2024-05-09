package javabasic;

public class WithdrawThread extends Thread {

	Account account;
	int amount;

	WithdrawThread(Account account, int amount) {
		this.account = account;
		this.amount = amount;

	}

	@Override
	public void run() {

		for(int i=0; i<10;i++) {
			if (this.account.getMoney() >= amount) {
				this.account.withdraw(this.amount);
				System.out.println(this.amount + "출금됨");
				System.out.println(account);
			}

			try {
				Thread.sleep(1500);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}

}
