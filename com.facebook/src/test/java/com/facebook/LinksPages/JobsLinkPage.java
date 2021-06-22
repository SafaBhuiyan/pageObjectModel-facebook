package com.facebook.LinksPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class JobsLinkPage {
	
	 public WebDriver driver;
	
	//      //ul[contains(@class,'uiList pageFooterLink')]/li[15]/a
	
	//      //ul[contains(@class,'uiList pageFooterLink')]/li[23]/a
	
	@FindBy(how=How.XPATH, using=" //ul[contains(@class,'uiList pageFooterLink')]/li[15]/a") WebElement jobLink;
	
	public JobsLinkPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickJobLink() {
		jobLink.click();
	}

}
