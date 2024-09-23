package com.opencsv.OpenCsv;
import com.opencsv.bean.CsvBindByName;

public class CSVUser {
   
	@CsvBindByName(column = "NAME")
	private String NAME;
	
	@CsvBindByName(column = "EMAIL" )
	private String EMAIL;
	
	@CsvBindByName(column = "pnoneNumber")
	private long PHONENUMBER;
	
	@CsvBindByName(column = "AGE")
	private int AGE;
	
	
	
	public String getName() {
		return NAME;
	}



	public void setName(String NAME) {
		this.NAME = NAME;
	}



	public String getEmail() {
		return EMAIL;
	}



	public void setEmail(String EMAIL) {
		this.EMAIL = EMAIL;
	}



	public long getPhoneNumber() {
		return PHONENUMBER;
	}



	public void setPhoneNumber(long PHONENUMBER) {
		this.PHONENUMBER = PHONENUMBER;
	}



	public int getAge() {
		return AGE;
	}



	public void setCountry(int AGE) {
		this.AGE = AGE;
	}



	@Override
	public String toString() {
		return "CSVUser[" +
	           "name=' " + NAME + '\'' +
	           "email='" + EMAIL + '\'' +
	           "phoneNumber'" + PHONENUMBER  + '\'' +
	           "age'" + AGE + '\'' +
	           ']';
	           
	}
}
