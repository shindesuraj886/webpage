package Java_io;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readdatafromexcel {
	public static void main(String[] args) throws IOException {
		
	
	//Write a program to read data from excel
	FileInputStream inputStream = new FileInputStream("data.xlsx");

	XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

//	XSSFWorkbook workbook = new XSSFWorkbook();

	// Example: Read data from a cell

	XSSFSheet sheet = workbook.getSheet("Sheet1");

	XSSFRow row = sheet.getRow(0); // Row 0 is the first row

	XSSFCell cell = row.getCell(0); // Column 0 is the first column

	String value = cell.getStringCellValue();

	System.out.println(value);


}}
