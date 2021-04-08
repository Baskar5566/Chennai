package org.pom;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.test.BaseClass;

public class WorkAdactin extends BaseClass {
	public static void main(String[] args) throws IOException {
		BaseClass base =new BaseClass();
         WebDriver driver = base.getDriver();
         base.loadUrl(driver, "http://adactinhotelapp.com/");
         
         Loginpage login =new Loginpage();
         sendKeys(login.getTxtusername(),getDataFromExcel("C:\\Users\\Dell\\eclipse-workspace\\SampleProject1\\ExcelSheets\\newexcel.xlsx","Sheet1", 0, 1));
         sendKeys(login.getTxtpassword(),getDataFromExcel("C:\\Users\\Dell\\eclipse-workspace\\SampleProject1\\ExcelSheets\\newexcel.xlsx","Sheet1", 1, 1));
		 btnclick(login.getBtnlogin());
		 
		 SearchHotelLogin shl=new SearchHotelLogin();
		 base.selectbyvisibletext(shl.getdDbLocation(),getDataFromExcel("C:\\Users\\Dell\\eclipse-workspace\\SampleProject1\\ExcelSheets\\newexcel.xlsx","Sheet1", 3, 1));
		 base.selectbyvisibletext(shl.getdDnHotel(),getDataFromExcel("C:\\Users\\Dell\\eclipse-workspace\\SampleProject1\\ExcelSheets\\newexcel.xlsx","Sheet1", 4, 1));
		 base.selectbyvisibletext(shl.getdDnRoom(),getDataFromExcel("C:\\Users\\Dell\\eclipse-workspace\\SampleProject1\\ExcelSheets\\newexcel.xlsx","Sheet1", 5, 1));
		 btnclick(shl.getSubmit());
		 
		 SelectHotel sh=new SelectHotel();
		 btnclick(sh.getBtnclick());
		 btnclick(sh.getBtnsubmit());
		
		 
		 
		 
		 BookHotel bh=new BookHotel();
		 sendKeys(bh.getFirstName(),getDataFromExcel("C:\\Users\\Dell\\eclipse-workspace\\SampleProject1\\ExcelSheets\\newexcel.xlsx","Sheet1", 13, 1));
		 sendKeys(bh.getLastName(),getDataFromExcel("C:\\Users\\Dell\\eclipse-workspace\\SampleProject1\\ExcelSheets\\newexcel.xlsx","Sheet1", 14, 1));
		 sendKeys(bh.getAddress(),getDataFromExcel("C:\\Users\\Dell\\eclipse-workspace\\SampleProject1\\ExcelSheets\\newexcel.xlsx","Sheet1", 15, 1));
		 sendKeys(bh.getCreditard(),getDataFromExcel("C:\\Users\\Dell\\eclipse-workspace\\SampleProject1\\ExcelSheets\\newexcel.xlsx","Sheet1", 16, 1));
		 sendKeys(bh.getCreditardType(),getDataFromExcel("C:\\Users\\Dell\\eclipse-workspace\\SampleProject1\\ExcelSheets\\newexcel.xlsx","Sheet1", 17, 1));
		 sendKeys(bh.getdDnMonthExpireDate(),getDataFromExcel("C:\\Users\\Dell\\eclipse-workspace\\SampleProject1\\ExcelSheets\\newexcel.xlsx","Sheet1", 18, 1));
		 sendKeys(bh.getdDnYearExpireDate(),getDataFromExcel("C:\\Users\\Dell\\eclipse-workspace\\SampleProject1\\ExcelSheets\\newexcel.xlsx","Sheet1", 19, 1));
		 sendKeys(bh.getCvvNumber(),getDataFromExcel("C:\\Users\\Dell\\eclipse-workspace\\SampleProject1\\ExcelSheets\\newexcel.xlsx","Sheet1", 20, 1));
		 btnclick(bh.getBtnClick());
		 }

}
