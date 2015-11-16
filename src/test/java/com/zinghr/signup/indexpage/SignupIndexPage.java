package com.zinghr.signup.indexpage;

import java.util.List;
import java.util.Random;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ch.qos.logback.core.net.SyslogOutputStream;

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
	private WebElement country_List;
	
	@FindBy(xpath=".//*[@id='countries_title']")
	private WebElement allcountry_List;
	
	@FindBy(xpath=".//div[@id='countries_child']//.[Contains(text(),'Select Country')]")
	private WebElement no_country;
	
	@FindBy(xpath=".//*[@id='countries_msdd']//li[not(contains(.,'Select Country'))]")
	private List<WebElement> country_list ;
	
	
	
	
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
	Common.clickOn(driver, country_List);
		
	return new SignupVerificationPage(driver);
}

public SignupVerificationPage selectOthercountry() 
{
	Common.clickOn(driver, country_List);
	Random rnd = new Random();
	int i = rnd.nextInt(country_list.size());
	country_list.get(i).click();
	
	
	return new SignupVerificationPage(driver);
}

public SignupVerificationPage NoCountry() 
{
	Common.clickOn(driver, country_List);
	Common.clickOn(driver, no_country);
		
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

	public SignupVerificationPage alphanumCompanyName() 
	{

		Common.pause(2);
		enterCompanyCode(TestData.alphanum(7));
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

	public SignupVerificationPage alphabetDisplayname() 
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
	
	public SignupVerificationPage invalidDisplayAdminName()
	{
		Common.pause(2);
		enterCompanyCode(TestData.rndmString(4));
		enterDisplayName(TestData.invalid);
		Common.pause(2);
		enterEmailid(TestData.rndmemail(3));
		selectcountry();
		selectcountry();
		entercontactno(TestData.contactno_s);
		clicksignup30days();
		return new SignupVerificationPage(driver);
	}


	public SignupVerificationPage blankDisplayAdminName()
	{
		Common.pause(2);
		enterCompanyCode(TestData.rndmString(4));
		enterDisplayName(TestData.blank);
		Common.pause(2);
		enterEmailid(TestData.rndmemail(3));
		selectcountry();
		selectcountry();
		entercontactno(TestData.contactno_s);
		clicksignup30days();
		return new SignupVerificationPage(driver);
	}
	
	public SignupVerificationPage validEmailId() 
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
	
	public SignupVerificationPage invalidEmailId() 
	{

		Common.pause(2);
		enterCompanyCode(TestData.rndmString(4));
		enterDisplayName(TestData.rndmString(6));
		Common.pause(2);
		enterEmailid(TestData.rndm_invalid_email(2));
		selectcountry();
		selectcountry();
		entercontactno(TestData.contactno_s);
		clicksignup30days();
	
		return new SignupVerificationPage(driver);
	}
	
	public SignupVerificationPage blankEmailId() 
	{

		Common.pause(2);
		enterCompanyCode(TestData.rndmString(4));
		enterDisplayName(TestData.rndmString(6));
		Common.pause(2);
		enterEmailid(TestData.blank);
		selectcountry();
		selectcountry();
		entercontactno(TestData.contactno_s);
		clicksignup30days();
	
		return new SignupVerificationPage(driver);
	}
	
	public SignupVerificationPage selectOtherCountries()
	{

		Common.pause(2);
		enterCompanyCode(TestData.rndmString(4));
		enterDisplayName(TestData.rndmString(6));
		Common.pause(2);
		enterEmailid(TestData.rndmemail(2));
		
		selectOthercountry();
		entercontactno(TestData.contactno_s);
		return new SignupVerificationPage(driver);
	}
	
	public SignupVerificationPage selectNoCountry() 
	{

		Common.pause(2);
		enterCompanyCode(TestData.rndmString(4));
		enterDisplayName(TestData.rndmString(6));
		Common.pause(2);
		enterEmailid(TestData.rndmemail(2));
		
		NoCountry();
		entercontactno(TestData.contactno_s);
		return new SignupVerificationPage(driver);
	}
	
	public SignupVerificationPage validContactnum()
	{

		Common.pause(2);
		enterCompanyCode(TestData.rndmString(4));
		enterDisplayName(TestData.rndmString(6));
		Common.pause(2);
		enterEmailid(TestData.rndmemail(2));
		
		selectOthercountry();
		entercontactno(TestData.contactno_s);
		clicksignup30days();
		return new SignupVerificationPage(driver);
	}
	
}
