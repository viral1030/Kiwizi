package com.zinghr.login.verification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.zinghr.init.AbstractPage;
import com.zinghr.init.Common;

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
	
	@FindBy(xpath=".//div[@id='menu']/ul//span[contains(text(),'Home')] ")
	WebElement homeicon;
	
	@FindBy(xpath=".//*[@id='myTNA']//span[contains(text(),'My Time And Attendance')]")
	WebElement timeandattendance;
	
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
	public boolean loginpagewithvalidcredentialverification()
	{
		WebElement homeicon =driver.findElement(By.xpath(".//div[@id='menu']/ul//span[contains(text(),'Home')] "));
		WebElement timeandattendance =driver.findElement(By.xpath(".//div[@id='menu']/ul//span[contains(text(),'Home')] "));
		if(homeicon.isDisplayed() && timeandattendance.isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
}