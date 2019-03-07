package org.automation.mccormick.datagenerator;

import java.io.FileInputStream;
import java.lang.reflect.Method;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataGenerator {

	/*
	 * this is for static dada provider without the excel file.
	 * 
	 * @DataProvider(name="Static") public Object[][] datagenrator() {
	 * 
	 * String [][] data= {{"uname1", "pass1"}, {"uname2", "pass2"}}; return data;
	 * 
	 * }
	 */

	// Below code is for dynamic data through excel file.

	@DataProvider(name = "Excel")
	public static Object[][] testDataGenrator(Method met) throws Exception {
		if (met.getName().equals("tc_001_loginfunctinality")) {
			FileInputStream file = new FileInputStream("./TestData/DataSheet.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet loginsheet = workbook.getSheet("Login");
			int numberofrows = loginsheet.getPhysicalNumberOfRows();
			int numberofcells = 0;
			Object[][] testdata= new Object[numberofrows-1][];
			int count=0;
			
			for (int i = 1; i < numberofrows; i++) {

				XSSFRow row = loginsheet.getRow(i);
				numberofcells = row.getPhysicalNumberOfCells();
				if(count==0)
				{
				for (int test_1 = 0; test_1 < numberofrows-1; test_1++) {
					testdata[test_1] = new Object[numberofcells];
					}
				count++;
				}
				for (int k = 0; k < numberofcells; k++) {
					XSSFCell cell = row.getCell(k);
					testdata[i-1][k] = cell.getStringCellValue();
				}
				
			}
			return testdata;
		}
		
		else if (met.getName().equals("tc_003_ContactUSPage")) {
			FileInputStream file = new FileInputStream("./TestData/DataSheet.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet loginsheet = workbook.getSheet("ContactUS");
			int numberofrows = loginsheet.getPhysicalNumberOfRows();
			int numberofcells = 0;
			Object[][] testdata= new Object[numberofrows-1][];
			int count=0;
			
			for (int i = 1; i < numberofrows; i++) {

				XSSFRow row = loginsheet.getRow(i);
				numberofcells = row.getPhysicalNumberOfCells();
				if(count==0)
				{
				for (int test_1 = 0; test_1 < numberofrows-1; test_1++) {
					testdata[test_1] = new Object[numberofcells];
					}
				count++;
				}
				for (int k = 0; k < numberofcells; k++) {
					XSSFCell cell = row.getCell(k);
					testdata[i-1][k] = cell.getStringCellValue();
				}
				
			}
			return testdata;
		}
		
		/*
		else if (met.getName().equals("tc_003_ContactUSPage")) {
			FileInputStream file = new FileInputStream("./TestData/DataSheet.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet loginsheet = workbook.getSheet("ContactUS");
			int numberofrows = loginsheet.getPhysicalNumberOfRows();
			int numberofcells = 0;
			Object[][] testdata= new Object[numberofrows-1][];
			for (int i = 1; i < numberofrows; i++) {

				XSSFRow row = loginsheet.getRow(i);
				numberofcells = row.getPhysicalNumberOfCells();
			}
			testdata = new Object[numberofrows][numberofcells];

			for (int j = 1; j < numberofrows; j++) {

				XSSFRow row = loginsheet.getRow(j);
				int cells = row.getPhysicalNumberOfCells();
				for (int k = 0; k < cells; k++) {
					XSSFCell cell = row.getCell(k);
					testdata[j][k] = cell.getStringCellValue();
				}
			}

			return testdata;
		} 
		*/
		
		else {
			Object[][] testdata= new Object[2][2];
			//testdata = new Object[2][2];
			return testdata;
		}
	}
}
