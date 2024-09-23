package com.opencsv.OpenCsv;

public class MyUser {
    String name;
    String email;
    long pnoneNumber;
    int age;
	public MyUser(String name, String email, int pnoneNumber, int age) {
		super();
		this.name = name;
		this.email = email;
		this.pnoneNumber = pnoneNumber;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPnoneNumber() {
		return pnoneNumber;
	}
	public void setPnoneNumber(int pnoneNumber) {
		this.pnoneNumber = pnoneNumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
    
}
