package com.zinghr.login.verification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.zinghr.init.AbstractPage;
import com.zinghr.init.Common;
import com.zinghr.init.TestData;

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

	@FindBy(xpath = ".//input[@id='txtAccountName']")
	WebElement fp_companyCode_txt_fld;
	
	@FindBy(xpath = ".//input[@id='txtEmpCode']")
	WebElement fp_employee_txt_fld;
	
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
		WebElement blank_password_alert = driver.findElement(By.xpath("//div[contains(text(),'Please enter password')]"));
		if (blank_password_alert.isDisplayed()) {
			return true;
		} else {
			return false;
		}

	}

	public boolean invalidcompanycodeverification() {
		WebElement invalid_com_code_alert = driver
				.findElement(By.xpath("//div[contains(text(),'Please check company code')]"));
		if (invalid_com_code_alert.isDisplayed()) {
			return true;
		} else {
			return false;
		}

	}

	public boolean invalidemployeecodeverification() {
		WebElement invalid_emp_code_alert = driver
				.findElement(By.xpath("//div[contains(text(),'PLEASE VERIFY THE EMPLOYEE CODE')]"));
		if (invalid_emp_code_alert.isDisplayed()) {
			return true;
		} else {
			return false;
		}

	}

	public boolean invalidpasswordverification() {
		WebElement invalid_pass_alert = driver.findElement(By.xpath("//div[contains(text(),'LOGIN FAILED')]"));
		if (invalid_pass_alert.isDisplayed()) {
			return true;
		} else {
			return false;
		}

	}
	
	public boolean account_block_verification() {
		WebElement block_acc_alert = driver.findElement(By.xpath("//div[contains(text(),'LOGIN FAILED')]"));
		if (block_acc_alert.isDisplayed()) {
			return true;
		} else {
			return false;
		}

	}
	
	public boolean after_account_block_verification() {
		WebElement block_acc_alert = driver.findElement(By.xpath("//div[contains(text(),'YOUR LOGIN ID LOCKED')]"));
		if (block_acc_alert.isDisplayed()) {
			return true;
		} else {
			return false;
		}

	}


	public boolean facebooksocialiconverification() {
		Common.pause(3);
		System.out.println(driver.getCurrentUrl().toString());
		System.out.println(TestData.facebook);
		if (driver.getCurrentUrl().toString().equalsIgnoreCase(TestData.facebook)) {
			return true;
		} else {
			return false;
		}

	}

	public boolean twittersocialiconverification() {
		Common.pause(3);

		if (driver.getCurrentUrl().toString().equalsIgnoreCase(TestData.twitter)) {
			return true;
		} else {
			return false;
		}

	}

	public boolean youtubesocialiconverification() {
		Common.pause(3);

		
		if (driver.getCurrentUrl().toString().contains(TestData.youtube)) {
			return true;
		} else {
			return false;
		}

	}

	public boolean gplussocialiconverification() {
		Common.pause(3);

		
		if (driver.getCurrentUrl().toString().contains(TestData.gplus)) {
			return true;
		} else {
			return false;
		}

	}

	public boolean linkedinsocialiconverification() {
		Common.pause(3);

		
		if (driver.getCurrentUrl().toString().contains(TestData.linkedin)) {
			return true;
		} else {
			return false;
		}

	}

	public boolean click_punchin_button_without_enter_data_verification() {
		WebElement punchin_alert = driver.findElement(By.xpath(".//div[contains(text(),'Please Enter Company Code')]"));
		if (punchin_alert.isDisplayed()) {
			return true;
		} else {
			return false;
		}

	}
	
	public boolean click_punchin_button_with_empty_employee_code_verification() {
		WebElement emepty_employeecode_alert = driver.findElement(By.xpath(".//div[contains(text(),'Please Enter Employee Code')]"));
		if (emepty_employeecode_alert.isDisplayed()) {
			return true;
		} else {
			return false;
		}

	}
	
	public boolean click_punchin_button_with_empty_password_verification() {
		WebElement blank_pass_alert = driver.findElement(By.xpath(".//div[contains(text(),'Please Enter Password')]"));
		if (blank_pass_alert.isDisplayed()) {
			return true;
		} else {
			return false;
		}

	}
	
	public boolean click_punchin_button_with_invalid_company_code_verification() {
		WebElement invalid_company_code_alert = driver.findElement(By.xpath(".//div[contains(text(),'Please check company code')]"));
		if (invalid_company_code_alert.isDisplayed()) {
			return true;
		} else {
			return false;
		}

	}
	
	public boolean click_punchin_button_with_invalid_employee_code_verification() {
		WebElement invalid_employee_code_alert = driver.findElement(By.xpath(".//div[contains(text(),'User Id / Password Is Incorrect.!')]"));
		if (invalid_employee_code_alert.isDisplayed()) {
			return true;
		} else {
			return false;
		}

	}
	
	public boolean click_punchin_button_with_invalid_password_verification() {
		WebElement password_alert = driver.findElement(By.xpath("//div[contains(text(),'User Id / Password Is Incorrect.!')]"));
		if (password_alert.isDisplayed()) {
			return true;
		} else {
			return false;
		}

	}
	
	public boolean click_punchin_button_with_valid_data_verification() {
		WebElement punchin_alert = driver.findElement(By.xpath("//div[contains(text(),'User Id / Password Is Incorrect.!')]"));
		if (punchin_alert.isDisplayed()) {
			return true;
		} else {
			return false;
		}

	}
	
	public boolean click_punchin_button_with_valid_data_credential_not_store_in_db_verification() {
		WebElement punchin_alert = driver.findElement(By.xpath(".//div[contains(text(),'Punch-In/Out Is Not Mapped To You')]"));
		if (punchin_alert.isDisplayed()) {
			return true;
		} else {
			return false;
		}

	}
	
	public boolean click_punchout_button_without_punchin_procedure_verification() {
		WebElement punchout_alert = driver.findElement(By.xpath("//div[contains(text(),'User Id / Password Is Incorrect.!')]"));
		if (punchout_alert.isDisplayed()) {
			return true;
		} else {
			return false;
		}

	}
	
	public boolean Forgot_password_landing_page_verification() {
		WebElement forgotpass_lbl = driver.findElement(By.xpath(".//h1[contains(text(),'Forgot Password')]"));
		if (forgotpass_lbl.isDisplayed()) {
			return true;
		} else {
			return false;
		}

	}
	public boolean Forgot_password_enter_data_in_company_employee_code_verification() {
		if (fp_companyCode_txt_fld.toString().length() > 0 && fp_employee_txt_fld.toString().length() > 0) {
			return true;
		} else {
			return false;
		}

	}
	public boolean Forgot_password_enter_blank_data_in_company_employee_code_verification() {
		if (fp_companyCode_txt_fld.toString().length() > 0 && fp_employee_txt_fld.toString().length() > 0) {
			return true;
		} else {
			return false;
		}

	}
	public boolean Forgot_password_enter_invalid_data_in_company_employee_code_verification() {
		WebElement forgotpass_lbl = driver.findElement(By.xpath(".//span[contains(text(),'Company Code Incorrect')]"));
		if (forgotpass_lbl.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}
	public boolean Forgot_password_enter_valid_data_in_company_employee_code_verification() {
		WebElement forgotpass_lbl = driver.findElement(By.xpath(".//span[contains(text(),'Company Code Incorrect')]"));
		if (forgotpass_lbl.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}
	public boolean back_to_login_button_verification() {
		if (companyCode_txt_fld.isDisplayed() && employeeCode_txt_fld.isDisplayed() && password_txt_fld.isDisplayed()
				&& login_btn.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}
}