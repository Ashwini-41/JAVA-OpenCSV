package com.opencsv.OpenCsv;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVWriter;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

public class OpenCsvWriter {

	//private static final String SAMPLE_CSV_FILE_PATH = "./users.csv";
	
	private static final String OBJECT_LIST_SAMPLE = "./object-list-sample.csv";
	
	public static void main(String[] args) throws
		CsvDataTypeMismatchException,
	    CsvRequiredFieldEmptyException, IOException {
		
		try (
			Writer writer = Files.newBufferedWriter(Paths.get(OBJECT_LIST_SAMPLE));
			
		){
			StatefulBeanToCsv<MyUser> beanToCsv = new StatefulBeanToCsvBuilder<MyUser>(writer)
					.withQuotechar(CSVWriter.NO_QUOTE_CHARACTER)
					.build();
			
			List<MyUser> myUsers = new ArrayList<>();
			myUsers.add(new MyUser("Sundar Pichai ","sundar.pichai@gmail.com",123456787,20));
			myUsers.add(new MyUser("Ashwini Garad ","ashwini.garad@gmail.com",321456787,22));
			
			beanToCsv.write(myUsers);

			
		}
		
	}

}
