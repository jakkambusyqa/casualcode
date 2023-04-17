package testcases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readfromexcel {

	public static void main(String[] args) throws IOException {

		String excelfile=".\\upload\\data.xlsx";
		
		FileInputStream fileInputStream =new FileInputStream(excelfile);
		
		XSSFWorkbook Workbook = new XSSFWorkbook(fileInputStream);
		
		XSSFSheet sheet=Workbook.getSheet("excel");
		
	int rows=sheet.getLastRowNum();
	int cols=sheet.getRow(1).getLastCellNum();
	
	
	for(int i=0;i<=rows;i++){
		XSSFRow row= sheet.getRow(i);
		for(int c=0;c<=cols;c++){
			
		XSSFCell cell=row.getCell(c);
		switch (cell.getCellType())
		{
		
			case STRING : System.out.println(cell.getStringCellValue());
		break;
			case NUMERIC : System.out.println(cell.getNumericCellValue());	
		break;
			case BOOLEAN : System.out.println(cell.getBooleanCellValue());
		break;
		
		
		}
		}
	
	System.out.println();
	
	}
	}

}
