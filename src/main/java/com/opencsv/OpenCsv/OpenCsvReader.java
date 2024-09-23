package com.opencsv.OpenCsv;

import java.nio.file.Files;
import java.io.*;
import java.nio.file.Paths;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class OpenCsvReader {
	private static final String SAMPLE_CSV_FILE_PATH ="./object-list-sample.csv"; 

	public static void main(String[] args) throws IOException, CsvException {
      try (
    	  Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
    	  CSVReader csvReader = new CSVReader(reader);
    	){
    	  //Reading records one by one in a String array
    	  String[] nextRecord;
    	  
    	  while((nextRecord = csvReader.readNext()) != null) {
    		  System.out.println("Name: " + nextRecord[2]);
    		  System.out.println("Email: " + nextRecord[1]);
    		  System.out.println("Phone: " + nextRecord[3]);
    		  System.out.println("Age : " + nextRecord[0]);
    		  System.out.println("=======================");


    	  }
    	  
    	  //Reading All Records at once into a List<String[]>
    	  List<String[]> records = csvReader.readAll();
    	  for(String[] record : records) {
    		  System.out.println("Name: " + nextRecord[2]);
    		  System.out.println("Email: " + nextRecord[1]);
    		  System.out.println("Phone: " + nextRecord[3]);
    		  System.out.println("Age : " + nextRecord[0]);
    		  System.out.println("------------------------");
    	  }
      }
	}

}
