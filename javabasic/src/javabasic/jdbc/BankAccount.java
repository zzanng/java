package javabasic.jdbc;

public class BankAccount {
	
	private int baid;
	private String baname;
	private int bamoney;
	
	//기본생성자
	public BankAccount() {

	}


	//생성자
	public BankAccount(int baid, String baname, int bamoney) {
		super();
		this.baid = baid;
		this.baname = baname;
		this.bamoney = bamoney;
	}

//겟터세터
	public int getBaid() {
		return baid;
	}


	public void setBaid(int baid) {
		this.baid = baid;
	}


	public String getBaname() {
		return baname;
	}


	public void setBaname(String baname) {
		this.baname = baname;
	}


	public int getBamoney() {
		return bamoney;
	}


	public void setBamoney(int bamoney) {
		this.bamoney = bamoney;
	}

//to string 
	@Override
	public String toString() {
		return "BankAccount [baid=" + baid + ", baname=" + baname + ", bamoney=" + bamoney + "]";
	}
	
	
	
	
	
	

}
