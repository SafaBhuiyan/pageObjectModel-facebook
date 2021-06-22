package com.facebook.LinksTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.facebook.BaseTest.BaseTest;
import com.facebook.LinksPages.AboutLinkPage;
import com.facebook.LinksPages.JobsLinkPage;

public class AboutLinkTest extends BaseTest {
	
	
	@Test
	public void aboutLinkTest() {
	//AboutLinkPage aboutLink= new AboutLinkPage(driver);
		AboutLinkPage aboutLink= PageFactory.initElements(driver, AboutLinkPage.class);
	aboutLink.clickAboutLink();
	}
	
	

}
