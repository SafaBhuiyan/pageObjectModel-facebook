package com.facebook.LinksTests;

import org.testng.annotations.Test;

import com.facebook.BaseTest.BaseTest;
import com.facebook.LinksPages.AboutLinkPage;

public class AboutLinkTest extends BaseTest {
	
	
	@Test
	public void aboutLinkTest() {
	AboutLinkPage aboutLink= new AboutLinkPage(driver);
	aboutLink.clickAboutLink();
	}
	
	

}
