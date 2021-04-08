package org.testng;


import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TaskOne {
	WebDriver driver;
	
	@BeforeClass
	public void beforeclass() {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\SampleProject1\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
    driver.get("http://adactinhotelapp.com/");	
    driver.manage().window().maximize();
	}
	@AfterClass
	public void afterclass() {
		driver.quit();
		}
	@BeforeMethod
	public void BeforeMethod() {
        Date date =new Date();
        System.out.println(date);
	}
	@AfterMethod
	public void aftermethod() {
		Date date =new Date();
		System.out.println(date);
    }
	@Test
	public void login() {
		WebElement element = driver.findElement(By.id("username"));
		element.sendKeys("green12345");
		WebElement element2 = driver.findElement(By.id("password"));
		element2.sendKeys("green12345");
		WebElement element3 = driver.findElement(By.id("login"));
		element3.click();
}
}
