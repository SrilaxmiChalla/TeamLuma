package excelRW;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {
	public static void main(String[] args) throws FileNotFoundException {
		//Initialize the file input
		FileInputStream fis=new FileInputStream("C:\\Users\\prath\\eclipse-Selenium\\ProjectreadingwritingExcel\\data\\companies.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sh=wb.getSheet("Sheet1");
		
		//Identify no. of rows
		int rows=sh.getLastRowNum();
		
		//identify no. of colos
		int cols=sh.getRow(1).getLastCellNum();
		
		System.out.println(rows+" " +cols);
		
		
		

	}

}
