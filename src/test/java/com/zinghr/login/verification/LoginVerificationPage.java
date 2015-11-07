package com.zinghr.login.verification;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.zinghr.init.AbstractPage;

public class LoginVerificationPage extends AbstractPage {

	public LoginVerificationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//input[@id='txtSecureCompanyCode']")
	WebElement companyCode_txt_fld;

	@FindBy(xpath = "//input[@id='txtSecureEmployeeCode']")
	WebElement employeeCode_txt_fld;

	@FindBy(xpath = "//input[@id='txtSecurePassword']")
	WebElement password_txt_fld;

	@FindBy(xpath = "//input[@id='btnSecureLogin']")
	WebElement login_btn;
	
	
	public boolean loginlandingpageverification()
	{
		if(companyCode_txt_fld.isDisplayed() && employeeCode_txt_fld.isDisplayed() && password_txt_fld.isDisplayed() && login_btn.isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}