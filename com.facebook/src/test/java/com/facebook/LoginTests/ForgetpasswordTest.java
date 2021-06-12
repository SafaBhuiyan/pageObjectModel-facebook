package com.facebook.LoginTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.facebook.BaseTest.BaseTest;
import com.facebook.LoginPages.ForgotPasswordPage;

public class ForgetpasswordTest extends BaseTest {

	@Test
	public void forgotPassword() {

//Following code will work without creating constructor in side page object class 

		// ForgotPasswordPage forgotPass = new ForgotPasswordPage();
		// PageFactory.initElements(driver, forgotPass);

// Following line will work with PageFactory created inside the Constructor of Page object Class

		// ForgotPasswordPage forgotPass = new ForgotPasswordPage(driver);

//Following code will work with PageFactory created in the Test class 

		ForgotPasswordPage forgotPass = PageFactory.initElements(driver, ForgotPasswordPage.class);

		forgotPass.clickForgotPassword();
		forgotPass.insertMobileNumber("1254");
		forgotPass.clickSearchButton();
	}

}
