package javabasic.jdbc.Student;

public class Subject {
	
	private int sbNo;
	private String subName;
	
	public Subject() {
		
	}

	public Subject(int sbNo, String subName) {
		super();
		this.sbNo = sbNo;
		this.subName = subName;
	}

	public int getSbNo() {
		return sbNo;
	}

	public void setSbNo(int sbNo) {
		this.sbNo = sbNo;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	@Override
	public String toString() {
		return subName + "/";
	}

	
	
	

}
