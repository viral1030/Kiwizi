package com.zinghr.tna.indexpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.zinghr.init.AbstractPage;
import com.zinghr.init.Common;
import com.zinghr.tna.verification.OASVerificationPage;

public class OASIndexPage extends AbstractPage {

	public OASIndexPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = ".//div[@id='menu']/ul//span[contains(text(),'OAS')]")
	WebElement oas_menu;
	
	public OASVerificationPage oaslandingpage()
	{
		Common.clickOn(driver, oas_menu);
		return new OASVerificationPage(driver);
	}
	
	
}
