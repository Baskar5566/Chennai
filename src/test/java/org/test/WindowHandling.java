package org.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\SampleProject1\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
        WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
        element.sendKeys("iphone",Keys.ENTER);
        WebElement element2 = driver.findElement(By.xpath("//span[text()='New Apple iPhone 11 (128GB) - Purple'][1]"));
        element2.click();
        String handle = driver.getWindowHandle();
        System.out.println(handle);
        Set<String> handles = driver.getWindowHandles();
        System.out.println(handles);
        for (String check : handles) {
        	if(!handle.equals(check)) {
        		driver.switchTo().window(check);
        	}}
        WebElement element3 = driver.findElement(By.id("add-to-cart-button"));
        element3.click();
        driver.switchTo().window(handle);
        WebElement element4=driver.findElement(By.xpath("//span[text()='New Apple iPhone 11 (128GB) - Purple'][2]"));
        element4.click();
        //find child window
        List<String> l = new ArrayList<String>();
        l.addAll(handles);
        driver.switchTo().window(l.get(1));
        
        
        
        
       	
        }}
        
        
        
        
        
        
        
        
        
        
        
        
	
