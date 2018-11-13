package com.qa.extra;

public class account {

	private String firstName;
	private String lastName;
	private String accountNumber;
	
	public account(String firstName, String surname) {
		this.firstName = firstName;
		this.lastName = surname;
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

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

}
