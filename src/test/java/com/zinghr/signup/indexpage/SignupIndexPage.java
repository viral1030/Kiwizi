package com.zinghr.signup.indexpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.zinghr.init.AbstractPage;
import com.zinghr.init.Common;
import com.zinghr.init.TestData;
import com.zinghr.signup.verification.SignupVerificationPage;

public class SignupIndexPage extends AbstractPage {

	public SignupIndexPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath=".//*[@id='btnSignIn']")
	private WebElement signUp_30_day_btn;
	
	@FindBy(xpath=".//*[@id='txtCompanyName']")
	private WebElement compnyname_txt_fld;
	
	@FindBy(xpath=".//*[@id='txtAdminName']")
	private WebElement displayname_txt_fld;
	
	@FindBy(xpath=".//*[@id='txtEmailId']")
	private WebElement email_id_fld;
	
	@FindBy(xpath=".//*[@id='txtContact']")
	private WebElement contactno_fld;
	
	@FindBy(xpath=".//*[@id='btnSignIn']")
	private WebElement signin;
	
	@FindBy(xpath=".//div[@id='countries_msdd']")
	private WebElement countryList;
	
public SignupVerificationPage enterCompanyCode(String cmpCode_s) 
	{
		Common.clickOn(driver, compnyname_txt_fld);
		Common.type(compnyname_txt_fld, cmpCode_s);

		return new SignupVerificationPage(driver);
	}

public SignupVerificationPage enterDisplayName(String displayname_s) 
{
	Common.clickOn(driver, displayname_txt_fld);
	Common.type(displayname_txt_fld, displayname_s);

	return new SignupVerificationPage(driver);
}

public SignupVerificationPage enterEmailid(String email_s) 
{
	Common.clickOn(driver, email_id_fld);
	Common.type(email_id_fld, email_s);

	return new SignupVerificationPage(driver);
}

public SignupVerificationPage selectcountry() 
{
	Common.clickOn(driver, countryList);
		
	return new SignupVerificationPage(driver);
}


public SignupVerificationPage entercontactno(String conct_s) 
{
	Common.clickOn(driver, contactno_fld);
	Common.type(contactno_fld, conct_s);

	return new SignupVerificationPage(driver);
}

public SignupVerificationPage clicksignup30days() 
{
	Common.clickOn(driver, signUp_30_day_btn);
	
	return new SignupVerificationPage(driver);
}
	

	public SignupVerificationPage SignupPage()
		{
				
			return new SignupVerificationPage(driver);
		
		}
	

	public SignupVerificationPage SignUpsuccessfully() 
	{

		Common.pause(2);
		enterCompanyCode(TestData.rndmString(4));
		enterDisplayName(TestData.rndmString(6));
		Common.pause(2);
		enterEmailid(TestData.rndmemail(3));
		selectcountry();
		selectcountry();
		entercontactno(TestData.contactno_s);
		clicksignup30days();
	
		return new SignupVerificationPage(driver);
	}

	public SignupVerificationPage blankCompanyCode()
	{
		Common.pause(2);
		enterCompanyCode(TestData.blank);
		enterDisplayName(TestData.rndmString(6));
		Common.pause(2);
		enterEmailid(TestData.rndmemail(3));
		selectcountry();
		selectcountry();
		entercontactno(TestData.contactno_s);
		clicksignup30days();
		return new SignupVerificationPage(driver);
	}
	
	public SignupVerificationPage lessthan3CompanyCode()
	{
		Common.pause(2);
		enterCompanyCode(TestData.rndmString(2));
		enterDisplayName(TestData.rndmString(6));
		Common.pause(2);
		enterEmailid(TestData.rndmemail(3));
		selectcountry();
		selectcountry();
		entercontactno(TestData.contactno_s);
		clicksignup30days();
		return new SignupVerificationPage(driver);
	}

	public SignupVerificationPage emptyCompanyCode()
	{
		Common.pause(2);
		enterDisplayName(TestData.rndmString(6));
		Common.pause(2);
		enterEmailid(TestData.rndmemail(3));
		selectcountry();
		selectcountry();
		entercontactno(TestData.contactno_s);
		clicksignup30days();
		return new SignupVerificationPage(driver);
	}
}
