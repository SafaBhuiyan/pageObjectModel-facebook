package com.facebook.LoginPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AccountLoginPage{
	
	public WebDriver driver;

	@FindBy(how=How.XPATH, using = "//input[@id='email']") WebElement email;
	@FindBy(how=How.XPATH, using = "//input[@id='pass']") WebElement password;
	@FindBy(how=How.XPATH, using="//button[starts-with(@id,'u_0')]") WebElement submit;
	
	
	
//	public AccountLoginPage(WebDriver driver) {
//		this.driver= driver;
//		
//	}
	
	public AccountLoginPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	public void userName(String userEmail) {
		email.sendKeys(userEmail);
	}
	public void userPassword(String userPassword) {
		password.sendKeys(userPassword);
	}
	
	public void submit() {
		submit.click();
	}
	
	
	
}
