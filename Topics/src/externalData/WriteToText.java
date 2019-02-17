package externalData;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;



public class WriteToText {


	public static void main(String[] args) throws FileNotFoundException,IOException {
		String path = "C:\\Users\\Stacie\\eclipse-workspace\\myWriteData.txt";		
		File f = new File(path);
		FileWriter fw = new FileWriter (f, true);  //true = appendix= Add-on
		BufferedWriter bw = new BufferedWriter (fw);
		
		bw.write(""
				+ "<html>"
				+ "<head><title>ABC & EFG &ENF</title></head>"
				+ "<body><center>Hello Statcie & Minhbabe</center></body>"
				+ "</html>"); 
		bw.newLine();
		bw.close ();
	} 
}
