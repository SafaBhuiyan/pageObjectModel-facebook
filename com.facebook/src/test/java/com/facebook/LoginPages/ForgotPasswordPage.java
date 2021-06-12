package com.facebook.LoginPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage {
	
	public WebDriver driver;

	@FindBy(how=How.XPATH, using="//a[text()='Forgot Password?']") WebElement forgotPassword;
	@FindBy(how= How.XPATH, using="//input[@id='identify_email']") WebElement mobileNumber;
	
	@FindBy(how= How.XPATH, using="//button[@id='did_submit']") WebElement searchButton;
	
	
//	public ForgotPasswordPage(WebDriver driver) {
//		this.driver= driver;
//		PageFactory.initElements(driver, this);
//	}
	
	public ForgotPasswordPage(WebDriver driver) {
		this.driver= driver;
	}
	
	
	public void clickForgotPassword() {
		forgotPassword.click();
	}
	
	public void insertMobileNumber(String userMobileNumber) {
		mobileNumber.sendKeys(userMobileNumber);
	}
	public void clickSearchButton() {
		searchButton.click();
	}
}
