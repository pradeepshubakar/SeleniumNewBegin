package com.actitime.generics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileLib {

	/**
	 * Generic method for reading from property file
	 * @throws IOException 
	 */
	
	public String getPropertyFileData(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./data/commonData.properties.txt");
		Properties p = new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
		
	}
	
	public String getExcelData(String path,String sheetName,int row,int cell) throws InvalidFormatException, IOException {
		
		File f = new File(path);
		XSSFWorkbook wb = new XSSFWorkbook(f);
		 String value = wb.getSheet(sheetName).getRow(row).getCell(cell).toString();
		
		return value;
		
	}
}
