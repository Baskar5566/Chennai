package org.testng;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TaskPara {
	@Test(dataProvider ="sample")
     private void tc1(String email,String pass) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\SampleProject1\\driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        WebElement username = driver.findElement(By.id("email"));
        username.sendKeys(email);
        WebElement passa = driver.findElement(By.id("pass"));
        passa.sendKeys(pass);
       
    	}
	@DataProvider(name="sample")
	public Object[][] data(){
		return new Object [] [] {
			{"abu","abutest1"},
			{"anu","anutest1"},
		};}}
        
        
        
        
        
        
	
