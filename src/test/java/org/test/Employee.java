package org.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Employee extends BaseClass {


	public static void main(String[] args) throws IOException {
		File file =new File("C:\\Users\\Dell\\eclipse-workspace\\SampleProject1\\ExcelSheets\\adacexcel.xlsx");
		WebDriver driver=getDriver();
		driver.manage().window().maximize();
		loadUrl(driver, "http://adactinhotelapp.com/");
		WebElement username = driver.findElement(By.id("username"));
		sendKeys(username, getDataFromExcel("C:\\Users\\Dell\\eclipse-workspace\\SampleProject1\\ExcelSheets\\adacexcel.xlsx", "Sheet1", 0, 1));
		
		WebElement password = driver.findElement(By.id("password"));
		sendKeys(password, getDataFromExcel("C:\\Users\\Dell\\eclipse-workspace\\SampleProject1\\ExcelSheets\\adacexcel.xlsx", "Sheet1", 1, 1));
		
		WebElement login = driver.findElement(By.id("login"));
		btnclick(login);
		WebElement element4 = driver.findElement(By.xpath("//select[@id='location']"));
		sendKeys(element4,getDataFromExcel("C:\\Users\\Dell\\eclipse-workspace\\SampleProject1\\ExcelSheets\\adacexcel.xlsx", "Sheet1", 3, 1));
	    WebElement hotel = driver.findElement(By.id("hotels"));
		sendKeys(hotel,getDataFromExcel("C:\\Users\\Dell\\eclipse-workspace\\SampleProject1\\ExcelSheets\\adacexcel.xlsx", "Sheet1", 4, 1));
		WebElement room = driver.findElement(By.xpath("//select[@id='room_type']"));
		sendKeys(room,getDataFromExcel("C:\\Users\\Dell\\eclipse-workspace\\SampleProject1\\ExcelSheets\\adacexcel.xlsx", "Sheet1", 5, 1));
	    WebElement room1 = driver.findElement(By.xpath("//select[@id='room_type']"));
	    String attribute = room1.getAttribute("value");
		System.out.println(attribute);
		createNewExcelSheet("C:\\Users\\Dell\\eclipse-workspace\\SampleProject1\\ExcelSheets\\newexcel.xlsx","sheet5", 5, 0, attribute);
		
		
		
		
		/*File file1=new File("C:\\Users\\Dell\\eclipse-workspace\\SampleProject1\\ExcelSheets\\adacexcel.xlsx");
		Workbook w=new XSSFWorkbook();
        Sheet sheet = w.createSheet("Sheet2");
        Row row = sheet.createRow(22);
        Cell cell = row.createCell(3);
        cell.setCellValue(attribute);
        FileOutputStream outstream=new FileOutputStream(file1);
        w.write(outstream);
        System.out.println("done.....");*/
        
       
        
	
	
	}
	
	
	
	

}
