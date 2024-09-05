package Task13;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	
	public static void main(String[] args) throws IOException {
		
		// Opening the book
				XSSFWorkbook book = new XSSFWorkbook("C:\\Users\\boopa\\eclipse-workspace\\browser\\File\\ReadFile.xlsx");

				// Get to the sheet
				
				XSSFSheet sheet = book.getSheetAt(0);
				
				// get the no.of rows
				
				int rowCount = sheet.getLastRowNum();
				
				// get the no.of columns
				
				int columnCount = sheet.getRow(0).getLastCellNum();
				
				// iterate and get the cell value
				
				for(int i=0;i<=rowCount;i++) { 
					
					XSSFRow row = sheet.getRow(i);
					
					// get into columns
					
					for(int j=0;j<columnCount;j++) {
						
						XSSFCell cell = row.getCell(j);
						
						// read/get the value
						
						System.out.println(cell.getStringCellValue());
					
					}
			
				}
			
				book.close();
			}
}

