package com.facebook.LinksTests;

import org.testng.annotations.Test;

import com.facebook.BaseTest.BaseTest;
import com.facebook.LinksPages.JobsLinkPage;

public class JobsLinkTest extends BaseTest {
	
	@Test
	public void jobLinkTest() {
		JobsLinkPage jobLink= new JobsLinkPage(driver);
		jobLink.clickJobLink();
		
	}

}
