package testcases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelsam {
	
	public static void main(String[] args) throws IOException {
		
	
       String file="C:\\Users\\jakkam sairam\\workspace\\Red_bus\\excel\\MySheetName (2).xlsx";

       FileInputStream is=new FileInputStream(file);

     
     XSSFWorkbook workbook = new XSSFWorkbook(is);
     XSSFSheet sheet = workbook.getSheetAt(0);


   int rows=sheet.getLastRowNum();
   int cols=sheet.getRow(1).getLastCellNum();

   
    for(int i=0;i<=rows;i++)
{
	XSSFRow row=sheet.getRow(i);
	
	for(int c=0;c<cols;c++) {
		
		XSSFCell cell=row.getCell(c);
	
	switch(cell.getCellType())
	{
	case STRING: System.out.print(cell.getStringCellValue());
	break;
	case NUMERIC: System.out.print(cell.getNumericCellValue());
	break;
	case BOOLEAN: System.out.print(cell.getBooleanCellValue());
	break;
	default:
	}
	System.out.print(" | ");
	}
	
	System.out.println(" | ");
	
	
}
}
	
}