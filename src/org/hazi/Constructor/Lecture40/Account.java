package org.hazi.Constructor.Lecture40;

public class Account {
	private String Name;
	private String phoneNumber;
	private String Email;
	
	public Account(){
		this("hazi", "defaultNumber", "h@hazi.com");
		System.out.println("the default constructor is being called");
	}
	public Account(String Name, String phoneNumber, String Email){
		this.Name = Name;
		this.phoneNumber = phoneNumber;
		this.Email = Email;
		System.out.println("the constructor with paramters is called");
	}
	public String getName() {
		return Name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getEmail() {
		return Email;
	}

	
	


}
