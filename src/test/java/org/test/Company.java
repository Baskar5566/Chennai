package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Company {
	public static void main(String[] args) throws IOException {
	File file=new File("C:\\Users\\Dell\\eclipse-workspace\\SampleProject1\\ExcelSheets\\Book1.xlsx"); 
    FileInputStream fileinputstream=new FileInputStream(file); 
    Workbook work=new XSSFWorkbook(fileinputstream);
    Sheet sheet = work.getSheet("Sheet1");
    for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
    	Row row=sheet.getRow(i);
    	for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
    		Cell cell = row.getCell(j);
    		System.out.println(cell);
    int cellType = cell.getCellType();
    if(cellType==1) {
    	String cellValue = cell.getStringCellValue();
    	System.out.println(cellValue);
    	  }
    if(cellType==0) {
    	double d = cell.getNumericCellValue();
    	long l=(long) d;
    	System.out.println(l);
      String valueOf = String.valueOf(l);
      System.out.println(valueOf);}
      
  	}}}}
        
    
    
	
	
	

