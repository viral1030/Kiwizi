package com.zinghr.login.index;

import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.zinghr.init.Common;
import com.zinghr.init.SeleniumInit;
import com.zinghr.init.TestData;

public class LoginIndex extends SeleniumInit {

	@Test
	public void loginlandingpage() {

		int numOfFailure = 0;
<<<<<<< HEAD
		log("Step 1 : Open url:<a href=" + testUrl + ">" + testUrl + "</a>");

		loginVerificationPage = loginIndexpage.loginlandingpage();
		log("Verify that ZingHR login page is open or not.");
		if (loginVerificationPage.loginlandingpageverification()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

=======
		log("Step 1 : Open url:<a href="+testUrl+">"+testUrl+"</a>");
		
		
		loginVerificationPage=loginIndexpage.loginlandingpage();
		log("Verify that ZingHR login page is open or not.");
		if(loginVerificationPage.loginlandingpageverification())
		{
				Common.logStatus("pass");
		}
		else				
		{
				Common.logStatus("fail");
				numOfFailure++;
		}
		
>>>>>>> branch 'master' of https://github.com/viral1030/Kiwizi.git
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}

	@Test
<<<<<<< HEAD
	public void loginwithvalidcredential() {
		int numOfFailure = 0;
		loginlandingpage();
		log("Step 2: Enter Company Code:" + TestData.company_code);
		log("Step 3: Enter Employee Code: " + TestData.employe_code);
		log("Step 4: Enter Password: " + TestData.password);

		loginVerificationPage = loginIndexpage.loginSuccessfully();
		log("Verify that Home page is open or not");
		if (loginVerificationPage.loginpagewithvalidcredentialverification()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}

	@Test
	public void compnycodeeditableornot() {
		int numOfFailure = 0;
		loginlandingpage();
		log("Step 2: Enter Company Code:" + TestData.company_code);
		loginVerificationPage = loginIndexpage.compnycodeiseditableornot();
		log("Company code field id editable or not");
		if (loginVerificationPage.compnycodeiseditableornotverification()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}

	@Test
	public void employeecodeeditableornot() {
		int numOfFailure = 0;
		loginlandingpage();
		log("Step 2: Enter Employeey Code:" + TestData.employe_code);
		loginVerificationPage = loginIndexpage.employeecodeiseditableornot();
		log("Employee code field id editable or not");
		if (loginVerificationPage.employeecodeiseditableornotverification()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}

	@Test
	public void blankcomponycode() {
		int numOfFailure = 0;
		loginlandingpage();

		loginVerificationPage = loginIndexpage.blankcomponycode();
		log("To verify that alert message is displayed if user logins with empty Company Code");
		if (loginVerificationPage.blankcompanycodeverification()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}

	@Test
	public void blankemployeecode() {
		int numOfFailure = 0;
		loginlandingpage();
		log("Step 2: Enter Employeey Code:" + TestData.employe_code);
		loginVerificationPage = loginIndexpage.blankemployeecode();
		log("To verify that alert message is displayed if user logins with empty Employee Code");
		if (loginVerificationPage.blankemployeecodeverification()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}

	@Test
	public void blankpassword() {
		int numOfFailure = 0;
		loginlandingpage();
		log("Step 2: Enter Company Code:" + TestData.company_code);
		log("Step 3: Enter Employeey Code:" + TestData.employe_code);
		loginVerificationPage = loginIndexpage.blankpassword();
		log("To verify that alert message is displayed if user logins with empty password");
		if (loginVerificationPage.blankpasswordverification()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

=======
	public void loginwithvalidcredential()
	{
		int numOfFailure = 0;
		log("Test Case Id : L_08 ");
		loginlandingpage();
		log("Step 2: Enter Company Code:"+TestData.company_code);
		log("Step 3: Enter Employee Code: "+TestData.employe_code);
		log("Step 4: Enter Password: "+TestData.password);
		
		loginVerificationPage=loginIndexpage.loginSuccessfully();
		log("Verify that Home page is open or not");
		if(loginVerificationPage.loginpagewithvalidcredentialverification())
		{
			Common.logStatus("pass");
		}
		else
		{
			Common.logStatus("fail");
			numOfFailure++;
		}
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}
	@Test
	public void compnycodeeditableornot()
	{
		int numOfFailure = 0;
		log("Test Case Id : L_02");
		loginlandingpage();
		log("Step 2: Enter Company Code:"+TestData.company_code);
		loginVerificationPage=loginIndexpage.compnycodeiseditableornot();
		log("Company code field id editable or not");
		if(loginVerificationPage.compnycodeiseditableornotverification())
		{
			Common.logStatus("pass");
		}
		else
		{
			Common.logStatus("fail");
			numOfFailure++;
		}
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}
	@Test
	public void employeecodeeditableornot()
	{
		int numOfFailure = 0;
		log("Test Case Id : L_03 ");
		loginlandingpage();
		log("Step 2: Enter Employee Code:"+TestData.employe_code);
		loginVerificationPage=loginIndexpage.employeecodeiseditableornot();
		log("Employee code field id editable or not");
		if(loginVerificationPage.employeecodeiseditableornotverification())
		{
			Common.logStatus("pass");
		}
		else
		{
			Common.logStatus("fail");
			numOfFailure++;
		}
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}
	@Test
	public void blankcomponycode()
	{
		int numOfFailure = 0;
		log("Test Case Id : L_04 ");
		loginlandingpage();
		
		loginVerificationPage=loginIndexpage.blankcomponycode();
		log("To verify that alert message is displayed if user logins with empty Company Code");
		if(loginVerificationPage.blankcompanycodeverification())
		{
			Common.logStatus("pass");
		}
		else
		{
			Common.logStatus("fail");
			numOfFailure++;
		}
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}
	@Test
	public void blankemployeecode()
	{
		int numOfFailure = 0;
		log("Test Case Id : L_05 ");
		loginlandingpage();
		
		log("Step 2: Enter Employee Code:"+TestData.employe_code);
		loginVerificationPage=loginIndexpage.blankemployeecode();
		log("To verify that alert message is displayed if user logins with empty Employee Code");
		if(loginVerificationPage.blankemployeecodeverification())
		{
			Common.logStatus("pass");
		}
		else
		{
			Common.logStatus("fail");
			numOfFailure++;
		}
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}
	
	@Test
	public void enterdatatopassword()
	{
		int numOfFailure = 0;
		log("Test Case Id : L_06 ");
		loginlandingpage();
		log("Step 2: Enter Password: "+TestData.password);
		loginVerificationPage=loginIndexpage.enterdatatopassword();
		log("To verify that user is able to enter data in Password field");
		if(loginVerificationPage.enterdatatopasswordverification())
		{
			Common.logStatus("pass");
		}
		else
		{
			Common.logStatus("fail");
			numOfFailure++;
		}
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}

	
	@Test
	public void blankpassword()
	{
		int numOfFailure = 0;
		log("Test Case Id : L_07 ");
		loginlandingpage();
		log("Step 2: Enter Company Code:"+TestData.company_code);
		log("Step 3: Enter Employee Code:"+TestData.employe_code);
		loginVerificationPage=loginIndexpage.blankpassword();
		log("To verify that alert message is displayed if user logins with empty password");
		if(loginVerificationPage.blankpasswordverification())
		{
			Common.logStatus("pass");
		}
		else
		{
			Common.logStatus("fail");
			numOfFailure++;
		}
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}

	@Test
	public void invalidcompanycode()
	{
		int numOfFailure = 0;
		log("Test Case Id : L_10 ");
		loginlandingpage();
		log("Step 2: Enter Company Code:"+TestData.company_code_dl);
		log("Step 3: Enter Employee Code:"+TestData.employe_code);
		log("Step 4: Enter Password: "+TestData.password);
		loginVerificationPage=loginIndexpage.invalidcompanycode();
		log("To verify that appropriate error message is displayed when user enters invalid company code");
		if(loginVerificationPage.invalidcompanycodeverification())
		{
			Common.logStatus("pass");
		}
		else
		{
			Common.logStatus("fail");
			numOfFailure++;
		}
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}
	
	@Test
	public void invalidemployeecode()
	{
		int numOfFailure = 0;
		log("Test Case Id : L_11 ");
		loginlandingpage();
		log("Step 2: Enter Company Code:"+TestData.company_code);
		log("Step 3: Enter Employee Code:"+TestData.employe_code_dl);
		log("Step 4: Enter Password: "+TestData.password);
		loginVerificationPage=loginIndexpage.invalidemployeecode();
		log("To verify that appropriate error message is displayed when user enters invalid company code");
		if(loginVerificationPage.invalidemployeecodeverification())
		{
			Common.logStatus("pass");
		}
		else
		{
			Common.logStatus("fail");
			numOfFailure++;
		}
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}
	
	@Test
	public void invalidpassword()
	{
		int numOfFailure = 0;
		log("Test Case Id : L_12 ");
		loginlandingpage();
		log("Step 2: Enter Company Code:"+TestData.company_code);
		log("Step 3: Enter Employee Code:"+TestData.employe_code);
		log("Step 4: Enter Password: "+TestData.password_dl);
		loginVerificationPage=loginIndexpage.invalidpassword();
		log("To verify that appropriate error message is displayed when user enters invalid company code");
		if(loginVerificationPage.invalidpasswordverification())
		{
			Common.logStatus("pass");
		}
		else
		{
			Common.logStatus("fail");
			numOfFailure++;
		}
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}
		

	}
	
	@Test
	public void account_is_blocked()
	{
		int numOfFailure = 0;
		log("Test Case Id : L_13 ");
		loginlandingpage();
		log("Step 2: Enter Company Code:"+TestData.company_code_se);
		log("Step 3: Enter Employee Code:"+TestData.employe_code_se);
		log("Step 4: Enter Password: "+TestData.password_se);
		loginVerificationPage=loginIndexpage.accountblocked();
		log("To verify that after the 4 wrong attempts user's account is blocked");
		if(loginVerificationPage.account_block_verification())
		{
			Common.logStatus("pass");
		}
		else
		{
			Common.logStatus("fail");
			numOfFailure++;
		}
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}
		

	}
	
	@Test
	public void after_account_is_blocked()
	{
		int numOfFailure = 0;
		log("Test Case Id : L_14 ");
		loginlandingpage();
		log("Step 2: Enter Company Code:"+TestData.company_code_se);
		log("Step 3: Enter Employee Code:"+TestData.employe_code_se);
		log("Step 4: Enter Password: "+TestData.password_s);
		loginVerificationPage=loginIndexpage.afteraccountblocked();
		log("To verify that appropriate message is displayed after the user's account is blocked");
		if(loginVerificationPage.after_account_block_verification())
		{
			Common.logStatus("pass");
		}
		else
		{
			Common.logStatus("fail");
			numOfFailure++;
		}
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}
		

	}
	
	@Test
	public void verifysocialicons()
	{
		int numOfFailure = 0;
		log("Test Case Id : L_16 ");
		loginlandingpage();
		log("Step 2: Click on facebook icon.");
		loginVerificationPage=loginIndexpage.facebooksocialicon();
		log("To verify facebook is open.");
		String winHandleBefore = driver.getWindowHandle();

		// Perform the click operation that opens new window

		// Switch to new window opened
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}

		if(loginVerificationPage.facebooksocialiconverification())
		{
			Common.logStatus("pass");
		}
		else
		{
			Common.logStatus("fail");
			numOfFailure++;
		}
		driver.switchTo().window(winHandleBefore);
		
		
		log("Step 3: Click on twitter icon.");
		loginVerificationPage=loginIndexpage.twittersocialicon();
		log("To verify twitter is open.");
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		if(loginVerificationPage.twittersocialiconverification())
		{
			Common.logStatus("pass");
		}
		else
		{
			Common.logStatus("fail");
			numOfFailure++;
		}
		driver.switchTo().window(winHandleBefore);
		
		log("Step 4: Click on youtube icon.");
		loginVerificationPage=loginIndexpage.youtubesocialicon();
		log("To verify youtube is open.");
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		if(loginVerificationPage.youtubesocialiconverification())
		{
			Common.logStatus("pass");
		}
		else
		{
			Common.logStatus("fail");
			numOfFailure++;
		}
		driver.switchTo().window(winHandleBefore);
		
		log("Step 5: Click on Gplus icon.");
		loginVerificationPage=loginIndexpage.gplussocialicon();
		log("To verify Gplus is open.");
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		if(loginVerificationPage.gplussocialiconverification())
		{
			Common.logStatus("pass");
		}
		else
		{
			Common.logStatus("fail");
			numOfFailure++;
		}
		driver.switchTo().window(winHandleBefore);
		
		log("Step 6: Click on linkedin icon.");
		loginVerificationPage=loginIndexpage.linkedinsocialicon();
		log("To verify linkedin is open.");
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		if(loginVerificationPage.linkedinsocialiconverification())
		{
			Common.logStatus("pass");
		}
		else
		{
			Common.logStatus("fail");
			numOfFailure++;
		}
		driver.switchTo().window(winHandleBefore);
		
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}
	//hyperlink is not working for now.
/*	@Test
	public void check_latestannouncement_viewsupportportal_Raiseticket()
	{
		int numOfFailure = 0;
		loginlandingpage();
		log("Step 2: Click on View Latest Announcements hyperlink ");
		loginVerificationPage=loginIndexpage.check_viewsupportportal();
		
		
		log("Step 3: Click on View Support Portal hyperlink");
		log("Step 4: Click on Raise a ticket hyperlink");
		log("To verify that appropriate error message is displayed when user enters invalid company code");
		if(loginVerificationPage.invalidpasswordverification())
		{
			Common.logStatus("pass");
		}
		else
		{
			Common.logStatus("fail");
			numOfFailure++;
		}
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}
		

	}*/
	
	@Test
	public void click_punchin_button_without_enter_data()
	{
		int numOfFailure = 0;
		log("Test Case Id : L_18 ");
		loginlandingpage();
		log("Step 2: Click on Punch In button.");
		loginVerificationPage=loginIndexpage.click_punchin_button_without_enter_data();
		log("To verify that alert message is displayed if user directly clicks on 'Punch In' button");
		if(loginVerificationPage.click_punchin_button_without_enter_data_verification())
		{
			Common.logStatus("pass");
		}
		else
		{
			Common.logStatus("fail");
			numOfFailure++;
		}
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}
		

	}
	
	@Test
	public void click_punchin_button_with_empty_employee_code()
	{
		int numOfFailure = 0;
		log("Test Case Id : L_19 ");
		loginlandingpage();
		log("Step 2: Enter Company Code:"+TestData.company_code);
		log("Step 3: Enter Password: "+TestData.password);
		log("Step 4: Click on Punch In button");
		loginVerificationPage=loginIndexpage.click_punchin_button_with_empty_employee_code();
		log("To verify that alert message is displayed if user directly clicks on 'Punch In' button");
		if(loginVerificationPage.click_punchin_button_with_empty_employee_code_verification())
		{
			Common.logStatus("pass");
		}
		else
		{
			Common.logStatus("fail");
			numOfFailure++;
		}
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}
		

	}
	@Test
	public void click_punchin_button_with_empty_password()
	{
		int numOfFailure = 0;
		log("Test Case Id : L_20 ");
		loginlandingpage();
		log("Step 2: Enter Company Code:"+TestData.company_code);
		log("Step 3: Enter Employee Code:"+TestData.employe_code);
		log("Step 4: Click on Punch In button");
		loginVerificationPage=loginIndexpage.click_punchin_button_with_empty_password();
		log("To verify that alert message is displayed if user directly clicks on 'Punch In' button");
		if(loginVerificationPage.click_punchin_button_with_empty_password_verification())
		{
			Common.logStatus("pass");
		}
		else
		{
			Common.logStatus("fail");
			numOfFailure++;
		}
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}
		

	}
	
	@Test
	public void click_punchin_button_with_invalid_company_code()
	{
		int numOfFailure = 0;
		log("Test Case Id : L_21 ");
		loginlandingpage();
		log("Step 2: Enter invalid Company Code:"+TestData.company_code_dl);
		log("Step 3: Enter Employee Code:"+TestData.employe_code);
		log("Step 4: Enter Password: "+TestData.password);
		log("Step 5: Click on Punch In button");
		loginVerificationPage=loginIndexpage.click_punchin_button_with_invalid_company_code();
		log("To verify that appropriate error message is displayed if user enter invalid company code");
		if(loginVerificationPage.click_punchin_button_with_invalid_company_code_verification())
		{
			Common.logStatus("pass");
		}
		else
		{
			Common.logStatus("fail");
			numOfFailure++;
		}
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}
		

	}
	
	@Test
	public void click_punchin_button_with_invalid_employee_code()
	{
		int numOfFailure = 0;
		log("Test Case Id : L_22 ");
		loginlandingpage();
		log("Step 2: Enter Company Code:"+TestData.company_code);
		log("Step 3: Enter invalid Employee Code:"+TestData.employe_code_dl);
		log("Step 3: Enter password:"+TestData.password);
		log("Step 4: Click on Punch In button");
		loginVerificationPage=loginIndexpage.click_punchin_button_with_invalid_employee_code();
		log("To verify that appropriate error message is displayed when user enters invalid employee code");
		if(loginVerificationPage.click_punchin_button_with_invalid_employee_code_verification())
		{
			Common.logStatus("pass");
		}
		else
		{
			Common.logStatus("fail");
			numOfFailure++;
		}
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}
		

	}
	
	@Test
	public void click_punchin_button_with_invalid_password()
	{
		int numOfFailure = 0;
		log("Test Case Id : L_23 ");
		loginlandingpage();
		log("Step 2: Enter Company Code:"+TestData.company_code);
		log("Step 3: Enter Employee Code:"+TestData.employe_code);
		log("Step 4: Enter invalid password:"+TestData.password_s);
		log("Step 5: Click on Punch In button");
		loginVerificationPage=loginIndexpage.click_punchin_button_with_invalid_password();
		log("To verify that appropriate error message is displayed when user Punch Ins with invalid password");
		if(loginVerificationPage.click_punchin_button_with_invalid_password_verification())
		{
			Common.logStatus("pass");
		}
		else
		{
			Common.logStatus("fail");
			numOfFailure++;
		}
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}
		

	}
	
	@Test
	public void click_punchin_button_with_valid_data()
	{
		int numOfFailure = 0;
		log("Test Case Id : L_24 ");
		loginlandingpage();
		log("Step 2: Enter Company Code:"+TestData.company_code);
		log("Step 3: Enter Employee Code:"+TestData.employe_code);
		log("Step 4: Enter invalid password:"+TestData.password);
		log("Step 5: Click on Punch In button");
		loginVerificationPage=loginIndexpage.click_punchin_button_with_valid_data();
		log("To verify that successful message is displayed when user Punch Ins with valid credentials");
		if(loginVerificationPage.click_punchin_button_with_valid_data_verification())
		{
			Common.logStatus("pass");
		}
		else
		{
			Common.logStatus("fail");
			numOfFailure++;
		}
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}
		

	}
	@Test
	public void click_punchin_button_with_valid_data_credential_not_store_in_db()
	{
		int numOfFailure = 0;
		log("Test Case Id : L_25 ");
		loginlandingpage();
		log("Step 2: Enter Company Code:"+TestData.company_code);
		log("Step 3: Enter Employee Code:"+TestData.employe_code);
		log("Step 4: Enter invalid password:"+TestData.password);
		log("Step 5: Click on Punch In button");
		loginVerificationPage=loginIndexpage.click_punchin_button_with_valid_data_credential_not_store_in_db();
		log("To verify that appropiate error message is displayed if the users account in not configured in DB");
		if(loginVerificationPage.click_punchin_button_with_valid_data_credential_not_store_in_db_verification())
		{
			Common.logStatus("pass");
		}
		else
		{
			Common.logStatus("fail");
			numOfFailure++;
		}
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}
		

	}
	@Test
	public void click_punchout_button_without_punchin_procedure()
	{
		int numOfFailure = 0;
		log("Test Case Id : L_26 ");
		loginlandingpage();
		log("Step 2: Enter Company Code:"+TestData.company_code);
		log("Step 3: Enter Employee Code:"+TestData.employe_code);
		log("Step 4: Enter invalid password:"+TestData.password);
		log("Step 5: Click on Punch In button");
		loginVerificationPage=loginIndexpage.click_punchout_button_without_punchin_procedure();
		log("To verify that appropriate alert message is displayed when user directly clicks on Punch out button without doing Punch in");
		if(loginVerificationPage.click_punchout_button_without_punchin_procedure_verification())
		{
			Common.logStatus("pass");
		}
		else
		{
			Common.logStatus("fail");
			numOfFailure++;
		}
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}
		

	}
	
	@Test
	public void Forgot_password_landing_page()
	{
		int numOfFailure = 0;
		loginlandingpage();
		log("Step 2: Enter Company Code:"+TestData.company_code);
		log("Step 3: Enter Employee Code:"+TestData.employe_code);
		log("Step 4: Click Forgot Password hyperlink.");
		loginVerificationPage=loginIndexpage.Forgot_password_landing_page();
		log("To verify that user is redirected to Forgot password page after clicking on Forgot Password hyperlink");
		if(loginVerificationPage.Forgot_password_landing_page_verification())
		{
			Common.logStatus("pass");
		}
		else
		{
			Common.logStatus("fail");
			numOfFailure++;
		}
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}
	}
	
	@Test
	public void Fargot_password_enter_data_in_company_employee_code()
	{
		int numOfFailure = 0;
		log("Test Case Id : FP_02 ");
		Forgot_password_landing_page();
		log("Step 5: Enter Company Code:"+TestData.company_code);
		log("Step 6: Enter Employee Code:"+TestData.employe_code);
		loginVerificationPage=loginIndexpage.Forgot_password_enter_data_in_company_employee_code();
		log("To verify that user is able to enter data in Company and Employee code field");
		if(loginVerificationPage.Forgot_password_enter_data_in_company_employee_code_verification())
		{
			Common.logStatus("pass");
		}
		else
		{
			Common.logStatus("fail");
			numOfFailure++;
		}
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}
	}
	
	@Test
	public void Fargot_password_enter_blank_data_in_company_employee_code()
	{
		int numOfFailure = 0;
		log("Test Case Id : FP_03 ");
		Forgot_password_landing_page();
		log("Step 5: Click on submit button");
		
		loginVerificationPage=loginIndexpage.Forgot_password_enter_blank_data_in_company_employee_code();
		log("To verify that appropriate alert message is displayed when user submit empty company and employee code");
		if(loginVerificationPage.Forgot_password_enter_blank_data_in_company_employee_code_verification())
		{
			Common.logStatus("pass");
		}
		else
		{
			Common.logStatus("fail");
			numOfFailure++;
		}
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}
	}
	
	@Test
	public void Fargot_password_enter_invalid_data_in_company_employee_code()
	{
		int numOfFailure = 0;
		log("Test Case Id : FP_04 ");
		Forgot_password_landing_page();
		log("Step 5: Enter invalid Company Code:"+TestData.company_code_dl);
		log("Step 6: Enter invalid Employee Code:"+TestData.employe_code_dl);
		log("Step 7: Click on submit button");
		loginVerificationPage=loginIndexpage.Forgot_password_enter_invalid_data_in_company_employee_code();
		log("To verify that appropriate error messages is displayed when user enters invalid Company code and Employee code");
		if(loginVerificationPage.Forgot_password_enter_invalid_data_in_company_employee_code_verification())
		{
			Common.logStatus("pass");
		}
		else
		{
			Common.logStatus("fail");
			numOfFailure++;
		}
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}
	}
	
	@Test
	public void Fargot_password_enter_valid_data_in_company_employee_code()
	{
		int numOfFailure = 0;
		log("Test Case Id : FP_05 ");
		Forgot_password_landing_page();
		log("Step 5: Enter invalid Company Code:"+TestData.company_code);
		log("Step 6: Enter invalid Employee Code:"+TestData.employe_code);
		log("Step 7: Click on submit button");
		loginVerificationPage=loginIndexpage.Forgot_password_enter_valid_data_in_company_employee_code();
		log("To verify that successful message is displayed after clicking on Submit button (For both Mobile and email)");
		if(loginVerificationPage.Forgot_password_enter_valid_data_in_company_employee_code_verification())
		{
			Common.logStatus("pass");
		}
		else
		{
			Common.logStatus("fail");
			numOfFailure++;
		}
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}
	}
	
	@Test
	public void back_to_login_button()
	{
		int numOfFailure = 0;
		log("Test Case Id : FP_06 ");
		Forgot_password_landing_page();
		log("Step 5: Click on 'back to login' button");
		loginVerificationPage=loginIndexpage.back_to_login_button();
		log("To verify that user is redirected to Login page after clicking on 'Back to login' hyperlink");
		if(loginVerificationPage.back_to_login_button_verification())
		{
			Common.logStatus("pass");
		}
		else
		{
			Common.logStatus("fail");
			numOfFailure++;
		}
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}
>>>>>>> branch 'master' of https://github.com/viral1030/Kiwizi.git
	}
}
	




