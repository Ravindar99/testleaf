package utils;

import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import base.DriverBase;

public class DataLibrary{

	public static Object [][] getData(String excelfilename) throws IOException{
		XSSFWorkbook workbook = new XSSFWorkbook("./Data/"+excelfilename+".xlsx");
		XSSFSheet sheet = workbook.getSheetAt(0);
		int rowcount = sheet.getLastRowNum();
		int clcount = sheet.getRow(0).getLastCellNum();
		Object [][] data = new Object [rowcount][clcount];
		for (int i = 1; i <= rowcount; i++) {
			for (int j = 0; j < clcount; j++) {
				String value =sheet.getRow(i).getCell(j).getStringCellValue();
				data[i-1][j]=value;
						}
		} 
		workbook.close();
		return data;
	}
}
