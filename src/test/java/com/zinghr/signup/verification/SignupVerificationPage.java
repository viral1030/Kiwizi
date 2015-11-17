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


	public boolean verifyblankCompanycode() {
		Common.pause(2);
		return driver.findElement(
				By.xpath(".//*[@id='txtCompanyName']//.[@data-content='Please enter company name']")).isDisplayed();
	}

	public boolean verifylessthan3Companycode() {
		Common.pause(2);
		return driver.findElement(
				By.xpath(".//div[@class='bootbox-body']")).isDisplayed();
	}
	
	public boolean verifyemptyCompanycode() {
		Common.pause(2);
		return driver.findElement(
				By.xpath(".//input[@data-content='Please enter company name']")).isDisplayed();
	}

	
	public boolean verifyInvalidDisplayAdminName() {
		Common.pause(2);
		return driver.findElement(
				By.xpath(".//input[@id='txtAdminName']//.[@data-content='Enter characters only.']")).isDisplayed();
	}

	public boolean verifyblankDisplayAdminName() {
		Common.pause(2);
		return driver.findElement(
				By.xpath(".//*[@id='txtAdminName']//.[@data-content='Please enter company name']")).isDisplayed();
	}

	public boolean verifyValidEmailId() {
		Common.pause(2);
		return driver.findElement(
				By.xpath(".//p[@class='font-14']")).isDisplayed();
	}
	
	public boolean verifyInvalidEmailId() {
		Common.pause(2);
		return driver.findElement(
				By.xpath("//div[@class='bootbox-body']")).isDisplayed();
	}
	
	public boolean verifyblankEmailId() {
		Common.pause(2);
		return driver.findElement(
				By.xpath(".//input[@data-content='Please enter email address']")).isDisplayed();
	}
	
	public boolean verifyCountrySelection() {
		Common.pause(2);
		return driver.findElement(
				By.xpath(".//*[@id='countries_title']/img")).isDisplayed();
			
	}
	
	public boolean verifynoCountry() {
		Common.pause(2);
		return driver.findElement(
				By.xpath(".//*[@data-content='Please select country']")).isDisplayed();
			
	}
	
	public boolean verifyvalidcontactNum() {
		Common.pause(2);
		return driver.findElement(
				By.xpath(".//p[@class='font-14']")).isDisplayed();
			
	}
	
	public boolean verifyInvalidcontactNum() {
		Common.pause(2);
		return driver.findElement(
				By.xpath("//div[@class='bootbox-body']")).isDisplayed();
			
	}
	
	public boolean verifyInvalidcontactNum1() {
		Common.pause(2);
		return driver.findElement(
				By.xpath("//div[@class='bootbox-body']")).isDisplayed();
			
	}
	
	public boolean verifyBlankcontactNum() {
		Common.pause(2);
		return driver.findElement(
				By.xpath(".//*[@id='txtContact']//.[@data-content='Please enter contact number']")).isDisplayed();
			
	}
	
	public boolean verifyTermsOfUse() {
		Common.pause(2);
		return driver.findElement(
				By.xpath(".//h1[@class='industries']//.[contains(text(),'Terms')]")).isDisplayed();
			
	}
	
	public boolean verifyPrivacyPolicy() {
		Common.pause(2);
		return driver.findElement(
				By.xpath(".//h1[@class='industries']//.[contains(text(),'Privacy')]")).isDisplayed();
			
	}
	
	public boolean verifyCheckbox() {
		Common.pause(2);
		return driver.findElement(
				By.xpath("//div[@class='bootbox-body']")).isDisplayed();
			
	 }
	
	public boolean verifymail() {
		Common.pause(2);
		return driver.findElement(
				By.xpath(".//*[@id='mailcontainer']//.[contains(text(),'Your')]")).isDisplayed();
			
	 }
	
}