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

	@FindBy(xpath = ".//div[@id='btnDemoData']//a[1]")
	WebElement proccedbtn;
	
	
	public LoginVerificationPage loginlandingpage()
	{
		return new LoginVerificationPage(driver);
	}
	
	
	public LoginVerificationPage enterCompanyCode(String cmpCode) {

		Common.type(companyCode_txt_fld, cmpCode);

		return new LoginVerificationPage(driver);
	}

	public LoginVerificationPage enterEmployeeCode(String empCode) {

		Common.type(employeeCode_txt_fld, empCode);

		return new LoginVerificationPage(driver);
	}

	public LoginVerificationPage enterPassword(String pwd) {

		Common.type(password_txt_fld, pwd);
		return new LoginVerificationPage(driver);
	}

	public LoginVerificationPage clickLoginButton() {

		Common.clickOn(driver, login_btn);

		return new LoginVerificationPage(driver);

	}
	public LoginVerificationPage proccedButton() {

		Common.clickOn(driver, proccedbtn);

		return new LoginVerificationPage(driver);

	}

	public LoginVerificationPage loginSuccessfully() {

		Common.pause(2);
		enterCompanyCode(TestData.company_code);
		enterEmployeeCode(TestData.employe_code);
		enterPassword(TestData.password);
		
		
		
		
		clickLoginButton();
		
		proccedButton();
		return new LoginVerificationPage(driver);
	}

}
