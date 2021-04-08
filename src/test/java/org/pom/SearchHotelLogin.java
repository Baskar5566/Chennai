package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.BaseClass;


public class SearchHotelLogin extends BaseClass{
	public SearchHotelLogin() {
  PageFactory.initElements(driver,this);
  }
	@FindBy(id ="location")
	private WebElement dDbLocation;
	@FindBy(id="hotels")
    private WebElement dDnHotel;
	@FindBy(id= "room_type")
	private WebElement dDnRoom;
	@FindBy(xpath = "//input[@id='Submit']")
	private WebElement submit;
	
	public WebElement getSubmit() {
		return submit;
	}
	public WebElement getdDbLocation() {
		return dDbLocation;
	}
	public WebElement getdDnHotel() {
		return dDnHotel;
	}
	public WebElement getdDnRoom() {
		return dDnRoom;
	}
	
	

}
