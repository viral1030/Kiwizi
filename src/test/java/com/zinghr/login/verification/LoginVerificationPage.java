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
		Common.pause(1);
		WebElement EmployeeConnect =driver.findElement(By.xpath(".//span[contains(text(),'Employee Connect')]"));
		WebElement timeandattendance =driver.findElement(By.xpath(".//div[@id='myTNA']//span[contains(text(),'My Time And Attendance')]"));
	
		if( timeandattendance.isDisplayed() && EmployeeConnect.isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean compnycodeiseditableornotverification()
	{
			if(companyCode_txt_fld.toString().length()>0)
			{
				return true;
			}
			else
			{
				return false;
			}
	}
	public boolean employeecodeiseditableornotverification()
	{
			if(employeeCode_txt_fld.toString().length()>0)
			{
				return true;
			}
			else
			{
				return false;
			}
	}
	public boolean blankcompanycodeverification()
	{
		WebElement Companycode_alert =driver.findElement(By.xpath("//div[contains(text(),'Please enter company code')]"));
		if(Companycode_alert.isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	public boolean blankemployeecodeverification()
	{
		WebElement Companycode_alert =driver.findElement(By.xpath("//div[contains(text(),'Please enter employee code')]"));
		if(Companycode_alert.isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	public boolean blankpasswordverification()
	{
		WebElement Companycode_alert =driver.findElement(By.xpath("//div[contains(text(),'Please enter password')]"));
		if(Companycode_alert.isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	
	
}