package org.test;

import static org.junit.Assert.assertEquals;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class JunitAssert {
	@Test
	public void tc0() {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\SampleProject1\\driver\\chromedriver.exe");		
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	String currentUrl = driver.getCurrentUrl();
	boolean contains = currentUrl.contains("z");
	Assert.assertTrue(contains);
	System.out.println(contains);
	System.out.println(currentUrl);
	WebElement element = driver.findElement(By.id("email"));
	element.sendKeys("baskar");
	String txt= element.getAttribute("value");
	Assert.assertEquals("baskar",txt);
	System.out.println(txt);
	
	
	
    
    
    
	}
     	

}
