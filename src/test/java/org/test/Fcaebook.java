package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Fcaebook {

	public static void main(String[] args) {
		BaseClass base=new BaseClass();
		WebDriver driver = base.getDriver();
		base.loadUrl(driver, "https://www.facebook.com/");
		WebElement element = driver.findElement(By.id("email"));
		base.sendKeys(element, "baskar");
		WebElement element2 = driver.findElement(By.id("pass"));
		base.sendKeys(element2, "@1234");
		WebElement  btnlogin= driver.findElement(By.name("login"));
		base.btnclick(btnlogin);
		
		
		

	}

}
