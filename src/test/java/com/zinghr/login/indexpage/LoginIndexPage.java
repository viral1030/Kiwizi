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
	
	@FindBy(xpath = ".//i[@class='fa fa-facebook socialicons']/..")
	WebElement facebook;
	
	@FindBy(xpath = ".//i[@class='fa fa-twitter socialicons']/..")
	WebElement twitter;
	
	@FindBy(xpath = ".//i[@class='fa fa-youtube socialicons']/..")
	WebElement youtube;
	
	@FindBy(xpath = ".//i[@class='fa fa-google-plus socialicons']/..")
	WebElement gplus;
	
	@FindBy(xpath = ".//i[@class='fa fa-linkedin socialicons']/..")
	WebElement likedin;
	
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
	public LoginVerificationPage compnycodeiseditableornot()
	{
		enterCompanyCode(TestData.company_code);
		companyCode_txt_fld.clear();
		enterCompanyCode(TestData.company_code);
		return new LoginVerificationPage(driver);
	}
	
	
	public LoginVerificationPage employeecodeiseditableornot()
	{
		enterEmployeeCode(TestData.employe_code);
		companyCode_txt_fld.clear();
		enterEmployeeCode(TestData.employe_code);
		return new LoginVerificationPage(driver);
	}
	public LoginVerificationPage blankcomponycode()
	{
		clickLoginButton();
		return new LoginVerificationPage(driver);
	}
	public LoginVerificationPage blankemployeecode()
	{
		enterCompanyCode(TestData.company_code);
		clickLoginButton();
		return new LoginVerificationPage(driver);
	}
	public LoginVerificationPage enterdatatopassword()
	{
		enterPassword(TestData.password);
		password_txt_fld.clear();
		enterPassword(TestData.password);
		return new LoginVerificationPage(driver);
	}
	public LoginVerificationPage blankpassword()
	{
		enterCompanyCode(TestData.company_code);
		enterEmployeeCode(TestData.employe_code);
		clickLoginButton();
		return new LoginVerificationPage(driver);
	}
	
	
	public LoginVerificationPage invalidcompanycode()
	{
		enterCompanyCode(TestData.company_code_dl);
		enterEmployeeCode(TestData.employe_code);
		enterPassword(TestData.password);
		clickLoginButton();
		return new LoginVerificationPage(driver);
	}
	
	public LoginVerificationPage invalidemployeecode()
	{
		enterCompanyCode(TestData.company_code);
		enterEmployeeCode(TestData.employe_code_dl);
		enterPassword(TestData.password);
		clickLoginButton();
		return new LoginVerificationPage(driver);
	}
	
	public LoginVerificationPage invalidpassword()
	{
		enterCompanyCode(TestData.company_code);
		enterEmployeeCode(TestData.employe_code);
		enterPassword(TestData.password_dl);
		clickLoginButton();
		return new LoginVerificationPage(driver);
	}
	public LoginVerificationPage facebooksocialicon()
	{
		Common.clickOn(driver, facebook);
		return new LoginVerificationPage(driver);
	}
	public LoginVerificationPage twittersocialicon()
	{
		Common.clickOn(driver, facebook);
		return new LoginVerificationPage(driver);
	}
	public LoginVerificationPage youtubesocialicon()
	{
		Common.clickOn(driver, facebook);
		return new LoginVerificationPage(driver);
	}
	public LoginVerificationPage gplussocialicon()
	{
		Common.clickOn(driver, facebook);
		return new LoginVerificationPage(driver);
	}
	public LoginVerificationPage linkedinsocialicon()
	{
		Common.clickOn(driver, facebook);
		return new LoginVerificationPage(driver);
	}
}
