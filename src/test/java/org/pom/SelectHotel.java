package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.BaseClass;

public class SelectHotel extends BaseClass{
   public SelectHotel() {
	 PageFactory.initElements(driver, this);
	}
  

@FindBy(id = "radiobutton_0")
   private WebElement btnclick;
@FindBy(id="continue")
private WebElement btnsubmit;

public WebElement getBtnsubmit() {
	return btnsubmit;
}

public WebElement getBtnclick() {
	return btnclick;
}}
