package com.zinghr.signup.verification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.zinghr.init.AbstractPage;
import com.zinghr.init.Common;

public class SignupVerificationPage extends AbstractPage {

	public SignupVerificationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public boolean verifySignupPage() {
		Common.pause(1);
		return driver.findElement(
				By.xpath(".//*[@id='txtCompanyName']")).isDisplayed();
			
	}
	
	
	public boolean verifySignupSuccessfully() {
		Common.pause(2);
		return driver.findElement(
				By.xpath(".//p[@class='font-14']")).isDisplayed();
	}



}