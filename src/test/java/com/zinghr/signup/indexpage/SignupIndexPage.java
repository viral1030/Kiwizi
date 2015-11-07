package com.zinghr.signup.indexpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.zinghr.init.AbstractPage;
import com.zinghr.init.Common;
import com.zinghr.signup.verification.SignupVerificationPage;

public class SignupIndexPage extends AbstractPage {

	public SignupIndexPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath=".//a[@class='signup']")
	private WebElement signUpbtn_30_day;
	
	@FindBy(xpath=".//*[@id='txtCompanyName']")
	private WebElement compny_name;
	
	@FindBy(xpath=".//*[@id='txtAdminName']")
	private WebElement display_name;
	
	@FindBy(xpath=".//*[@id='txtEmailId']")
	private WebElement email_id;
	
	@FindBy(xpath=".//*[@id='txtContact']")
	private WebElement contactno;
	
	@FindBy(xpath=".//*[@id='btnSignIn']")
	private WebElement signin;
	
public SignupVerificationPage loginPage()
	
	{
				
		return new SignupVerificationPage(driver);
		
	}
	
public SignupVerificationPage SignupValiddata(String compny,String display,String email,String no)

{
	
	Common.clickOn(driver, compny_name);
	log("Step : Enter Company Name: "+compny);
	Common.type(compny_name,compny);
	
	Common.clickOn(driver,display_name);
	log("Step : Enter Admin Display Name: "+display);
	Common.type(display_name, display);
	
	Common.clickOn(driver,email_id);
	log("Step : Enter Email Id: "+email);
	Common.type(email_id, email);
	
	Common.clickOn(driver,contactno);
	log("Step : Enter Contact Number: "+no);
	Common.type(contactno, no);
	
	
	Common.clickOn(driver, signin);
	
	/*jhcvjhchscvjhsgcvyjhsdygcsdyug*/		

	
	return new SignupVerificationPage(driver);
	
}



}
