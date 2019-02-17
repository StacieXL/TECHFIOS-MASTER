package externalData;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadFromProperties {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		String path = "C:\\Users\\Stacie\\eclipse-workspace\\Topics\\src\\externalData\\Data.properties";		
		FileInputStream fs = new FileInputStream(path);
		Properties myObj = new Properties();
		myObj.load(fs);
		
		
		// 1 way
		System.out.println(myObj.getProperty("name"));
		System.out.println(myObj.getProperty("grade"));
		System.out.println(myObj.getProperty("course"));
		System.out.println(myObj.getProperty("course"));
		System.out.println();

	// 2 way		
	int mark =Integer.parseInt(myObj.getProperty("grade"));
	student(myObj.getProperty("name"),mark,myObj.getProperty("course"));
		
	// 3 way		
	student(myObj.getProperty("name"),myObj.getProperty("grade"),myObj.getProperty("course"));
	}
		
	//2 way
	public static void student(String namex, int gradex, String coursex) {
		System.out.println(namex);
		System.out.println(gradex);
		System.out.println(coursex);
	}
	
	//3way
	public static void student(String namex, String gradex, String coursex) {
		System.out.println(namex);
		System.out.println(gradex);
		System.out.println(coursex);
	}
}
	
