package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataInt {
	public static String[][] IntegrateExcell(String excelfileName) throws IOException {
		//file 
			XSSFWorkbook workbook = new XSSFWorkbook("./src/main/java/utils/learn excell/CreateLead.xlsx");
			//get sheet
			XSSFSheet sheet = workbook.getSheetAt(0);
			//get values
			/*
			 * String stringCellValue = sheet.getRow(1).getCell(1).getStringCellValue();
			 * System.out.println(stringCellValue); String stringCellValue1 =
			 * sheet.getRow(1).getCell(2).getStringCellValue();
			 * System.out.println(stringCellValue1); String stringCellValue2 =
			 * sheet.getRow(2).getCell(1).getStringCellValue();
			 * System.out.println(stringCellValue2); String stringCellValue3 =
			 * sheet.getRow(2).getCell(2).getStringCellValue();
			 * System.out.println(stringCellValue3); String stringCellValue4 =
			 * sheet.getRow(3).getCell(1).getStringCellValue();
			 * System.out.println(stringCellValue4); String stringCellValue5 =
			 * sheet.getRow(3).getCell(3).getStringCellValue();
			 * System.out.println(stringCellValue5);
			 */
			//get col and row
			int rowcount = sheet.getLastRowNum();
			System.out.println(rowcount);
			int colcount = sheet.getRow(0).getLastCellNum();
			System.out.println(colcount);
			String [][] data = new String [rowcount][colcount];
			for (int i = 1; i <=rowcount; i++) {
				for (int j = 0; j <colcount; j++) {
					String value = sheet.getRow(i).getCell(j).getStringCellValue();
					System.out.println(value);
					data[i-1][j]=value;
				}
			}
			//close static String[][] IntegrateExcell
			workbook.close();
			return data;
		
	}
}
