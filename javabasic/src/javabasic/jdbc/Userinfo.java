package javabasic.jdbc;

public class Userinfo {

	private String userName;
	private int identifier;
	private String firstName;
	private String lastName;
	
	public Userinfo() {
		
	}

	public Userinfo(String userName, int identifier, String firstName, String lastName) {
		super();
		this.userName = userName;
		this.identifier = identifier;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getIdentifier() {
		return identifier;
	}

	public void setIdentifier(int identifier) {
		this.identifier = identifier;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Userinfo [userName=" + userName + ", identifier=" + identifier + ", firstName=" + firstName
				+ ", lastName=" + lastName + "]";
	}
	
	
	
}
