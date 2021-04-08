package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.BaseClass;

public class BookHotel extends BaseClass{
	public BookHotel() {
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath = "//input[@id='first_name']")
	private WebElement firstName;
	
	@FindBy(xpath = "//input[@id='last_name']")
	private WebElement lastName;
	
	@FindBy(id ="address")
	private WebElement address;
	
	@FindBy(xpath = "//input[@id='cc_num']")
	private WebElement creditard;	
	@FindBy(id = "cc_type")
	private WebElement creditardType;	
	@FindBy(id ="cc_exp_month")
	private WebElement dDnMonthExpireDate ;
	@FindBy(id ="cc_exp_year")
	private WebElement dDnYearExpireDate ;
	@FindBy(xpath = "//input[@id='cc_cvv']")
	private WebElement cvvNumber;
	@FindBy(id ="book_now")
	private WebElement btnClick  ;
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCreditard() {
		return creditard;
	}
	public WebElement getCreditardType() {
		return creditardType;
	}
	public WebElement getdDnMonthExpireDate() {
		return dDnMonthExpireDate;
	}
	public WebElement getdDnYearExpireDate() {
		return dDnYearExpireDate;
	}
	public WebElement getCvvNumber() {
		return cvvNumber;
	}
	public WebElement getBtnClick() {
		return btnClick;
	}
}