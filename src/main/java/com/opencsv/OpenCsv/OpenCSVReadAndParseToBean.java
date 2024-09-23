package com.opencsv.OpenCsv;

import java.nio.file.Files;
import java.io.*;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

public class OpenCSVReadAndParseToBean {

	private static final String SAMPLE_CSV_FILE_PATH = "./object-list-sample.csv";
	public static void main(String[] args) throws IOException {
	    try (
	    	Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
	    	){
	    	CsvToBean<CSVUser> csvToBean = new CsvToBeanBuilder<CSVUser>(reader)
	    			.withType(CSVUser.class)
	    			.withIgnoreLeadingWhiteSpace(true)
	    			.build();
	    	
	    	Iterator<CSVUser> csvUserIterator = csvToBean.iterator();
	    	
	    	while(csvUserIterator.hasNext()) {
	    		CSVUser csvUser = csvUserIterator.next();
	    		System.out.println("Name: " + csvUser.getName());
	    		  System.out.println("Email: " + csvUser.getEmail());
	    		  System.out.println("Phone: " + csvUser.getPhoneNumber());
	    		  System.out.println("Age : " + csvUser.getAge());
	    		  System.out.println("=======================");

	    	}
	    	//Reads all CSV contents into memory (Not suitable for largeCSV files)
	    	List<CSVUser> csvUsers = csvToBean.parse();
	    	for(CSVUser csvUser : csvUsers) {
	    		 System.out.println("Name: " + csvUser.getName());
	    		  System.out.println("Email: " + csvUser.getEmail());
	    		  System.out.println("Phone: " + csvUser.getPhoneNumber());
	    		  System.out.println("Age : " + csvUser.getAge());
	    		  System.out.println("=======================");

	    	}
	    }
	}

}
