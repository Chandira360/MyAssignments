package marathon3;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static  String[][] readData(String Sheet) throws InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		File xcel=new File("./Data/Account.xlsx");
		XSSFWorkbook xcelBook=new XSSFWorkbook(xcel);
		XSSFSheet sheet=xcelBook.getSheet(Sheet);
		int rows=sheet.getLastRowNum();
		int cols=sheet.getRow(0).getLastCellNum();
		String data[][]=new String[rows][cols];
		for(int i=1;i<=rows;i++) {
			for(int j=0;j<cols;j++) {
				data[i-1][j]=sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(data[i-1][j]);
			}
		}
		
xcelBook.close();
return data;
	}

}
