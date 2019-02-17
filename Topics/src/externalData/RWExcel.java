package externalData;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RWExcel {
	public static void main(String[] args) throws IOException   {
		//Create file
		File f = new File ("C:\\Users\\Stacie\\eclipse-workspace\\Topics\\src\\externalData\\ExcelData.xlsx");
		FileOutputStream fo= new FileOutputStream (f);  //imports throws IOException

		//Create Workbook
		XSSFWorkbook Book = new XSSFWorkbook();
		
		
	//Create Worksheet
		
		XSSFSheet Sheet = Book.createSheet("StudentAttendance");  //To make "Sheet" belong to "Book"
		
	//Create First Row . Each steps will need to import its Apache Poi
		Row row0 = Sheet.createRow(0);
		Row row1 = Sheet.createRow(1);
		Row row2 = Sheet.createRow(2);
		Row row3 = Sheet.createRow(3);

	//Create Cell
		Cell cellA1 = row0.createCell(0);
		Cell cellD1 = row0.createCell(3);
		Cell cellA4 = row3.createCell(0);
		
	//Set cell value
		cellA1.setCellValue("StacieXXXX");
		cellD1.setCellValue("StacieBigButt");
		cellA4.setCellValue("StacieBigB");
		
		
		
	//Then connect workbook "Book" with "write"
		Book.write(fo);
		
		
	//After done with writing>>>need to close it
		fo.close();
		
	}

}