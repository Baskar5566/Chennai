package org.pom;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.test.BaseClass;

public class FindBysBase extends BaseClass {
	public FindBysBase() {
		PageFactory.initElements(driver, this);
		}
	@FindBys({
		@FindBy(name ="email"),
		@FindBy(xpath="//input[@id='email']")
	})
	private WebElement username;
	@CacheLookup
	@FindBys({
		@FindBy(name ="login"),
		@FindBy(xpath="//button[@name='login']")
	})
	List<WebElement>login;

	public WebElement getUsername() {
		return username;
	}

	public List<WebElement> getPassword() {
		return password;
	}

	public List<WebElement> getLogin() {
		return login;
	}
	@FindAll({
		@FindBy(name ="pass"),
		@FindBy(xpath="//div[@id='pass']")
	})
	private List<WebElement>password;
	
	
	
	
	
}
