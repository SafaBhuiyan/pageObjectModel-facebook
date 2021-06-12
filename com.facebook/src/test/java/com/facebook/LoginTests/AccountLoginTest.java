package com.facebook.LoginTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.facebook.BaseTest.BaseTest;
import com.facebook.LoginPages.AccountLoginPage;

public class AccountLoginTest extends BaseTest {
	
	
	
	@Test 
	public void accountLogin() {
		
		//Following code will work without creating constructor in side page object class 

				// ForgotPasswordPage forgotPass = new ForgotPasswordPage();
				// PageFactory.initElements(driver, forgotPass);

		// Following line will work with PageFactory created inside the Constructor of Page object Class

				// ForgotPasswordPage forgotPass = new ForgotPasswordPage(driver);

	//Following code will work with PageFactory created in the Test class 
		
		//AccountLoginPage login = PageFactory.initElements(driver, AccountLoginPage.class);
		
		
		AccountLoginPage login = new AccountLoginPage(driver);
		login.userName("safa@gmail.com");
		login.userPassword("123456");
		login.submit();
		
	}

}
