package Task13;



import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileOperations {

	
	public static void main(String[] args) throws IOException {
		
		
		// Get Into the Workbook
		XSSFWorkbook book = new XSSFWorkbook();
		
		//Creating the Sheet
		XSSFSheet Sheet = book.createSheet("Sheet1");
		
		//Storing Details- Name (String) Age (int) Email (String)
		
		Object[][] data = {
			
				{"Name","Age","Email"},
				{"John Doe","30","john@test.com"},
				{"Jane Doe","28","john@test.com"},
				{"Swapnil","37","swapnil@example.com"} 
				
		};
		
		       // Put the data into the sheet
		
				int rowCount = 0;
				
				// for each to get into each row
				
				for(Object[] row1 : data) {
					
					XSSFRow row = Sheet.createRow(rowCount++);
					
					int columnCount=0;
					
					// for each to get the columns
					
					for(Object col:row1) {
						
					 XSSFCell cell = row.createCell(columnCount++);
						
						// Checking the type of data and storing accordingly
						if(col instanceof String) {
							cell.setCellValue((String)col);
						}else if (col instanceof Integer) {
							cell.setCellValue((Integer) col);
						}
					}
					
				}
				
				try {
					FileOutputStream output = new FileOutputStream("C:\\Users\\boopa\\eclipse-workspace\\browser\\src\\main\\java\\Task13\\Details.xlsx");
					book.write(output);
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			book.close();
			
			
			                               //*READ DATA FROM AN EXCEL*
			
			
			// Opening the book
			
			  XSSFWorkbook read = new XSSFWorkbook("C:\\Users\\boopa\\eclipse-workspace\\browser\\src\\main\\java\\Task13\\Details.xlsx");

			// Get to the sheet
			
			  XSSFSheet sheet = book.getSheetAt(0);
			
			// get the no.of rows
			
			int rowCount1 = sheet.getLastRowNum();
			
			// get the no.of columns
			
			int columnCount1 = sheet.getRow(0).getLastCellNum();

                  //Validation

			for(int i=0;i<=rowCount1;i++) {
				
				XSSFRow row1 = sheet.getRow(i);
				
				// get into columns

				
				for(int j=0;j<columnCount1;j++) {
					
				
					  
					  XSSFCell cell = row1.getCell(j);
					System.out.println(cell.getStringCellValue());
					
				}
				
				System.out.println();
			}
	}
}
			
			
