package org.nag;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigtion {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\SampleProject1\\driver\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://www.youtube.com/watch?v=-GAsbyGE_5o");
	     System.out.println(driver.getTitle());
	     driver.navigate().back();
	     driver.navigate().to("https://www.facebook.com/");
	     driver.navigate().refresh();
	     TakesScreenshot x=(TakesScreenshot)driver;
	     File screenshotAs = x.getScreenshotAs(OutputType.FILE);
	     
	     System.out.println(screenshotAs);
	     File desFile=new File(".//screenshot/screen.png");
	     FileUtils.copyFile(screenshotAs, desFile);
	     
	     
	
	
	}
	
	
	

}
