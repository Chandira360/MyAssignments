package week6.Assignments;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadSalesXcel {

	public static String[][]salesData(String Sheet) throws InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		//excel file location
		File xcel=new File("./salesData/salesForceName.xlsx");
		//open workbook
		XSSFWorkbook salesBook=new XSSFWorkbook(xcel);
		//locate worksheet
		XSSFSheet sheet=salesBook.getSheet(Sheet);
		//get rows and columns
		int row = sheet.getLastRowNum();
		short col = sheet.getRow(0).getLastCellNum();
		//create a null array to send the value
		String record[][]=new String[row][col];
		//iterate for loop to get values and send it to record
		for(int i=1;i<=row;i++) {
			for(int j=0;j<col;j++) {
				String data=sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(data);
				record[i-1][j]=data;
				
			}
		}
		salesBook.close();
		return record;
	}

}
