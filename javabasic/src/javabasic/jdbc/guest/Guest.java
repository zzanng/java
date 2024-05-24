package javabasic.jdbc.guest;

import java.sql.Date;

public class Guest { 
	
	private int gno;
	private String gName;
	private int gAge; 
	private String gGender; 
	private String gSid; 
	private Date gConndt;
	
	
	public Guest(int gno, String gName, int gAge, String gGender, String gSid, Date gConndt) {
		super();
		this.gno = gno;
		this.gName = gName;
		this.gAge = gAge;
		this.gGender = gGender;
		this.gSid = gSid;
		this.gConndt = gConndt;
	}


	public int getGno() {
		return gno;
	}


	public void setGno(int gno) {
		this.gno = gno;
	}


	public String getgName() {
		return gName;
	}


	public void setgName(String gName) {
		this.gName = gName;
	}


	public int getgAge() {
		return gAge;
	}


	public void setgAge(int gAge) {
		this.gAge = gAge;
	}


	public String getgGender() {
		return gGender;
	}


	public void setgGender(String gGender) {
		this.gGender = gGender;
	}


	public String getgSid() {
		return gSid;
	}


	public void setgSid(String gSid) {
		this.gSid = gSid;
	}


	public Date getgConndt() {
		return gConndt;
	}


	public void setgConndt(Date gConndt) {
		this.gConndt = gConndt;
	}


	@Override
	public String toString() {
		return "Guest [gno=" + gno + ", gName=" + gName + ", gAge=" + gAge + ", gGender=" + gGender + ", gSid=" + gSid
				+ "]";
	}
	
	
	
	
	

}
