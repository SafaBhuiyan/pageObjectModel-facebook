package com.facebook.LinksPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class AboutLinkPage {
	
	WebDriver driver;
	
	@FindBy(how=How.XPATH, using="//ul[contains(@class,'uiList pageFooterLink')]/li[23]/a") WebElement aboutLink;
	
	public AboutLinkPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickAboutLink() {
		aboutLink.click();
	}
	

}
