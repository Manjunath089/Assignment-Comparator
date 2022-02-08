package utils;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class FileReaderForUI {

	static String path = "src/test/resources/global.properties";
	 Properties properties;
	 
	 public FileReaderForUI(){
		
		 BufferedReader reader;
		 try {
		 reader = new BufferedReader(new FileReader(path));
		 properties = new Properties();
		 try {
		 properties.load(reader);
		 reader.close();
		 } catch (IOException e) {
		 e.printStackTrace();
		 }
		 } catch (FileNotFoundException e) {
		 e.printStackTrace();
		 throw new RuntimeException("Configuration.properties not found at " + path);
		 } 
		 }
	
	 public String getValues(String value) {
			return properties.getProperty(value);
		 }
	
}
