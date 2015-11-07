package com.zinghr.login.indexpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.zinghr.init.AbstractPage;
import com.zinghr.init.Common;
import com.zinghr.init.TestData;
import com.zinghr.login.verification.LoginVerificationPage;

public class LoginIndexPage extends AbstractPage {

	public LoginIndexPage(WebDriver driver) {
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

	public LoginVerificationPage loginlandingpage()
	{
		return new LoginVerificationPage(driver);
	}
	
	
	public LoginVerificationPage enterCompanyCode(String cmpCode) {

		companyCode_txt_fld.sendKeys(cmpCode);

		return new LoginVerificationPage(driver);
	}

	public LoginVerificationPage enterEmployeeCode(String empCode) {

		employeeCode_txt_fld.sendKeys(empCode);

		return new LoginVerificationPage(driver);
	}

	public LoginVerificationPage enterPassword(String pwd) {

		password_txt_fld.sendKeys(pwd);

		return new LoginVerificationPage(driver);
	}

	public LoginVerificationPage clickLoginButton() {

		login_btn.click();

		return new LoginVerificationPage(driver);

	}

	public LoginVerificationPage loginSuccessfully() {

		Common.pause(2);
		enterCompanyCode(TestData.company_code);
		enterEmployeeCode(TestData.employe_code);
		enterPassword(TestData.password);
		clickLoginButton();

		return new LoginVerificationPage(driver);
	}

}
