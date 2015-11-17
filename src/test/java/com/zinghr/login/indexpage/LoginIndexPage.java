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
	WebElement facebook_icon;
	
	@FindBy(xpath = ".//i[@class='fa fa-twitter socialicons']/..")
	WebElement twitter_icon;
	
	@FindBy(xpath = ".//i[@class='fa fa-youtube socialicons']/..")
	WebElement youtube_icon;
	
	@FindBy(xpath = ".//i[@class='fa fa-google-plus socialicons']/..")
	WebElement gplus_icon;
	
	@FindBy(xpath = ".//i[@class='fa fa-linkedin socialicons']/..")
	WebElement linkedin_icon;
	
	@FindBy(xpath = "//strong[contains(text(),'View Latest Announcement')]/..")
	WebElement view_latest_annoncement_hyperlink;
	
	@FindBy(xpath = "//strong[contains(text(),'View Support')]/..")
	WebElement view_support_portal_hyperlink;
	
	@FindBy(xpath = "//strong[contains(text(),'Raise a Ticket')]/..")
	WebElement Raise_a_ticket_hyperlink;
	
	@FindBy(xpath = "//button[contains(text(),'OK')]")
	WebElement ok_button;
	
	@FindBy(xpath = ".//input[@id='btnPunchIn']")
	WebElement punch_in_btn;
	
	@FindBy(xpath = ".//input[@id='btnPunchOut']")
	WebElement punch_out_btn;
	
	@FindBy(xpath = ".//a[contains(text(),'Forgot Password')]")
	WebElement forgot_password_hyperlink;
	
	@FindBy(xpath = ".//input[@id='txtAccountName']")
	WebElement fp_companyCode_txt_fld;
	
	@FindBy(xpath = ".//input[@id='txtEmpCode']")
	WebElement fp_employee_txt_fld;
	
	@FindBy(xpath = ".//input[@id='email']/..")
	WebElement email_radio_btn;
	
	@FindBy(xpath = ".//input[@id='mobile']/..")
	WebElement mobile_radio_btn;
	
	@FindBy(xpath = ".//a[@id='btnSubmit']")
	WebElement submit_btn;
	
	@FindBy(xpath = ".//a[contains(text(),'Back To Login')]")
	WebElement back_to_login_link;
	
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

	public LoginVerificationPage clickokButton() {

		Common.clickOn(driver, ok_button);

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
	
	public LoginVerificationPage accountblocked()
	{
		enterCompanyCode(TestData.company_code_se);
		enterEmployeeCode(TestData.employe_code_se);
		enterPassword(TestData.password_se);
		clickLoginButton();
		Common.pause(2);
		clickokButton();
		Common.pause(1);
		enterPassword(TestData.password_se);
		clickLoginButton();
		Common.pause(2);
		clickokButton();
		Common.pause(1);
		enterPassword(TestData.password_se);
		clickLoginButton();
		Common.pause(2);
		clickokButton();
		Common.pause(1);
		enterPassword(TestData.password_se);
		clickLoginButton();
		clickokButton();
		Common.pause(2);
		enterPassword(TestData.password_se);
		clickLoginButton();
		return new LoginVerificationPage(driver);
	}
	public LoginVerificationPage afteraccountblocked()
	{
		enterCompanyCode(TestData.company_code_se);
		enterEmployeeCode(TestData.employe_code_se);
		enterPassword(TestData.password_s);
		clickLoginButton();
		Common.pause(1);
		return new LoginVerificationPage(driver);
	}
	public LoginVerificationPage facebooksocialicon()
	{
		Common.clickOn(driver, facebook_icon);
		return new LoginVerificationPage(driver);
	}
	public LoginVerificationPage twittersocialicon()
	{
		Common.clickOn(driver, twitter_icon);
		return new LoginVerificationPage(driver);
	}
	public LoginVerificationPage youtubesocialicon()
	{
		Common.clickOn(driver, youtube_icon);
		return new LoginVerificationPage(driver);
	}
	public LoginVerificationPage gplussocialicon()
	{
		Common.clickOn(driver, gplus_icon);
		return new LoginVerificationPage(driver);
	}
	public LoginVerificationPage linkedinsocialicon()
	{
		Common.clickOn(driver, linkedin_icon);
		return new LoginVerificationPage(driver);
	}
	public LoginVerificationPage check_latestannouncement()
	{
		Common.clickOn(driver, view_latest_annoncement_hyperlink);
		return new LoginVerificationPage(driver);
	}
	public LoginVerificationPage check_viewsupportportal()
	{
		Common.clickOn(driver, view_support_portal_hyperlink);
		return new LoginVerificationPage(driver);
	}
	public LoginVerificationPage check_Raiseticket()
	{
		Common.clickOn(driver, Raise_a_ticket_hyperlink);
		return new LoginVerificationPage(driver);
	}
	public LoginVerificationPage click_punchin_button_without_enter_data()
	{
		Common.clickOn(driver, punch_in_btn);
		return new LoginVerificationPage(driver);
	}
	public LoginVerificationPage click_punchin_button_with_empty_employee_code()
	{
		enterCompanyCode(TestData.company_code);
		enterPassword(TestData.password);
		Common.clickOn(driver, punch_in_btn);
		return new LoginVerificationPage(driver);
	}
	public LoginVerificationPage click_punchin_button_with_empty_password()
	{
		enterCompanyCode(TestData.company_code);
		enterEmployeeCode(TestData.employe_code);
		Common.clickOn(driver, punch_in_btn);
		return new LoginVerificationPage(driver);
	}
	
	public LoginVerificationPage click_punchin_button_with_invalid_company_code()
	{
		enterCompanyCode(TestData.company_code_dl);
		enterEmployeeCode(TestData.employe_code);
		enterPassword(TestData.password);
		Common.clickOn(driver, punch_in_btn);
		return new LoginVerificationPage(driver);
	}
	
	public LoginVerificationPage click_punchin_button_with_invalid_employee_code()
	{
		enterCompanyCode(TestData.company_code);
		enterEmployeeCode(TestData.employe_code_dl);
		enterPassword(TestData.password);
		Common.clickOn(driver, punch_in_btn);
		return new LoginVerificationPage(driver);
	}
	
	public LoginVerificationPage click_punchin_button_with_invalid_password()
	{
		enterCompanyCode(TestData.company_code);
		enterEmployeeCode(TestData.employe_code);
		enterPassword(TestData.password_dl);
		Common.clickOn(driver, punch_in_btn);
		return new LoginVerificationPage(driver);
	}
	public LoginVerificationPage click_punchin_button_with_valid_data()
	{
		enterCompanyCode(TestData.company_code);
		enterEmployeeCode(TestData.employe_code);
		enterPassword(TestData.password);
		Common.clickOn(driver, punch_in_btn);
		return new LoginVerificationPage(driver);
	}
	public LoginVerificationPage click_punchin_button_with_valid_data_credential_not_store_in_db()
	{
		enterCompanyCode(TestData.company_code);
		enterEmployeeCode(TestData.employe_code);
		enterPassword(TestData.password);
		Common.clickOn(driver, punch_in_btn);
		return new LoginVerificationPage(driver);
	}
	public LoginVerificationPage click_punchout_button_without_punchin_procedure()
	{
		enterCompanyCode(TestData.company_code);
		enterEmployeeCode(TestData.employe_code);
		enterPassword(TestData.password);
		Common.clickOn(driver, punch_in_btn);
		return new LoginVerificationPage(driver);
	}
	public LoginVerificationPage Forgot_password_landing_page()
	{
		enterCompanyCode(TestData.company_code);
		enterEmployeeCode(TestData.employe_code);
		Common.clickOn(driver, forgot_password_hyperlink);
		Common.pause(1);
		return new LoginVerificationPage(driver);
	}
	public LoginVerificationPage Forgot_password_enter_data_in_company_employee_code()
	{	
		Common.pause(1);
		Common.type(fp_companyCode_txt_fld,TestData.company_code);
		Common.type(fp_employee_txt_fld, TestData.employe_code);
		return new LoginVerificationPage(driver);
	}
	public LoginVerificationPage Forgot_password_enter_blank_data_in_company_employee_code()
	{	
		Common.pause(1);
		Common.clickOn(driver, submit_btn);
		return new LoginVerificationPage(driver);
	}
	public LoginVerificationPage Forgot_password_enter_invalid_data_in_company_employee_code()
	{	
		Common.pause(1);
		Common.type(fp_companyCode_txt_fld,TestData.company_code_dl);
		Common.type(fp_employee_txt_fld, TestData.employe_code_dl);
		Common.clickOn(driver, submit_btn);
		return new LoginVerificationPage(driver);
	}
	public LoginVerificationPage Forgot_password_enter_valid_data_in_company_employee_code()
	{	
		Common.pause(1);
		Common.type(fp_companyCode_txt_fld,TestData.company_code);
		Common.type(fp_employee_txt_fld, TestData.employe_code);
		Common.clickOn(driver, submit_btn);
		return new LoginVerificationPage(driver);
	}
	public LoginVerificationPage back_to_login_button()
	{	
		Common.pause(1);
		Common.clickOn(driver, back_to_login_link);
		return new LoginVerificationPage(driver);
	}
}
