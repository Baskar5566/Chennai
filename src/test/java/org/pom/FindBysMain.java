package org.pom;

import org.openqa.selenium.WebDriver;
import org.test.BaseClass;

public class FindBysMain extends BaseClass {
	public static void main(String[] args) {
	 BaseClass base=new BaseClass();
       WebDriver driver2 = getDriver();
       loadUrl(driver2, "https://www.facebook.com/");
       
       FindBysBase b=new FindBysBase();
       sendKeys(b.getUsername(),"baskar");
        sendKeys(b.getPassword().get(0),"baskau3");
        btnclick(b.getLogin().get(0));
      
      
}}
