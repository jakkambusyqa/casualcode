package testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	public static void main(String[] args) throws IOException {
		FileInputStream fls = new FileInputStream(".\\excel\\MySheetName (2).xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fls);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		Iterator itr = sheet.iterator();
		while (itr.hasNext()) {
			XSSFRow row = (XSSFRow) itr.next();
			Iterator celliterator = row.cellIterator();
			while (celliterator.hasNext()) {
				XSSFCell cell = (XSSFCell) celliterator.next();
				
				
				
				
				switch (cell.getCellType()) {
				
				case STRING:
					
					System.out.println(cell.getStringCellValue());
					break;
					
				case NUMERIC:
					
					System.out.println(cell.getNumericCellValue());
					break;
					
				case BOOLEAN:
					
					System.out.println(cell.getBooleanCellValue());
					break;
				}
			}

		}
	}
}
