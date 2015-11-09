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

	public boolean loginlandingpageverification() {
		if (companyCode_txt_fld.isDisplayed() && employeeCode_txt_fld.isDisplayed() && password_txt_fld.isDisplayed()
				&& login_btn.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean loginpagewithvalidcredentialverification() {
		Common.pause(1);
		WebElement EmployeeConnect = driver.findElement(By.xpath(".//span[contains(text(),'Employee Connect')]"));
		WebElement timeandattendance = driver
				.findElement(By.xpath(".//div[@id='myTNA']//span[contains(text(),'My Time And Attendance')]"));

		if (timeandattendance.isDisplayed() && EmployeeConnect.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean compnycodeiseditableornotverification() {
		if (companyCode_txt_fld.toString().length() > 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean employeecodeiseditableornotverification() {
		if (employeeCode_txt_fld.toString().length() > 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean blankcompanycodeverification() {
		WebElement Companycode_alert = driver
				.findElement(By.xpath("//div[contains(text(),'Please enter company code')]"));
		if (Companycode_alert.isDisplayed()) {
			return true;
		} else {
			return false;
		}

	}

	public boolean blankemployeecodeverification() {
		WebElement Companycode_alert = driver
				.findElement(By.xpath("//div[contains(text(),'Please enter employee code')]"));
		if (Companycode_alert.isDisplayed()) {
			return true;
		} else {
			return false;
		}

	}

	public boolean enterdatatopasswordverification() {
		if (password_txt_fld.toString().length() > 0) {
			return true;
		} else {
			return false;
		}

	}
	
	public boolean blankpasswordverification() {
		WebElement blank_password = driver.findElement(By.xpath("//div[contains(text(),'Please enter password')]"));
		if (blank_password.isDisplayed()) {
			return true;
		} else {
			return false;
		}

	}
	public boolean invalidcompanycodeverification() {
		WebElement invalid_com_code = driver.findElement(By.xpath("//div[contains(text(),'Please check company code')]"));
		if (invalid_com_code.isDisplayed()) {
			return true;
		} else {
			return false;
		}

	}
	public boolean invalidemployeecodeverification() {
		WebElement invalid_emp_code = driver.findElement(By.xpath("//div[contains(text(),'PLEASE VERIFY THE EMPLOYEE CODE')]"));
		if (invalid_emp_code.isDisplayed()) {
			return true;
		} else {
			return false;
		}

	}
	public boolean invalidpasswordverification() {
		WebElement invalid_pass = driver.findElement(By.xpath("//div[contains(text(),'LOGIN FAILED')]"));
		if (invalid_pass.isDisplayed()) {
			return true;
		} else {
			return false;
		}

	}
	public boolean facebooksocialiconverification() {
		WebElement facebook = driver.findElement(By.xpath(".//span[@itemprop='name']//.[contains(text(),'Zinghr')]"));
		if (facebook.isDisplayed()) {
			return true;
		} else {
			return false;
		}

	}
	public boolean twittersocialiconverification() {
		WebElement twitter = driver.findElement(By.xpath(".//h1/a[contains(text(),'ZingHR')]"));
		if (twitter.isDisplayed()) {
			return true;
		} else {
			return false;
		}

	}
	public boolean youtubesocialiconverification() {
		WebElement youtube = driver.findElement(By.xpath(".//span/a[contains(text(),'ZingHR')]"));
		if (youtube.isDisplayed()) {
			return true;
		} else {
			return false;
		}

	}
	public boolean gplussocialiconverification() {
		WebElement gplus = driver.findElement(By.xpath(".//span[@itemprop='name']//.[contains(text(),'Zinghr')]"));
		if (gplus.isDisplayed()) {
			return true;
		} else {
			return false;
		}

	}
	public boolean linkedinsocialiconverification() {
		WebElement linkedin = driver.findElement(By.xpath(".//span[@itemprop='name']//.[contains(text(),'Zinghr')]"));
		if (linkedin.isDisplayed()) {
			return true;
		} else {
			return false;
		}

	}


}