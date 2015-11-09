package com.zinghr.login.index;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.zinghr.init.Common;
import com.zinghr.init.SeleniumInit;
import com.zinghr.init.TestData;

public class LoginIndex extends SeleniumInit {

	@Test
	public void loginlandingpage() {

		int numOfFailure = 0;
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
		
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}

	@Test
	public void loginwithvalidcredential()
	{
		int numOfFailure = 0;
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
		loginlandingpage();
		log("Step 2: Enter Employeey Code:"+TestData.employe_code);
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
		loginlandingpage();
		log("Step 2: Enter Employeey Code:"+TestData.employe_code);
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
		loginlandingpage();
		log("Step 2: Enter Company Code:"+TestData.company_code);
		log("Step 3: Enter Employeey Code:"+TestData.employe_code);
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
		loginlandingpage();
		log("Step 2: Enter Company Code:"+TestData.company_code_dl);
		log("Step 3: Enter Employeey Code:"+TestData.employe_code);
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
		loginlandingpage();
		log("Step 2: Enter Company Code:"+TestData.company_code);
		log("Step 3: Enter Employeey Code:"+TestData.employe_code_dl);
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
		loginlandingpage();
		log("Step 2: Enter Company Code:"+TestData.company_code);
		log("Step 3: Enter Employeey Code:"+TestData.employe_code);
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
	public void verifysocialicons()
	{
		int numOfFailure = 0;
		loginlandingpage();
		log("Step 2: Click on facebook icon.");
		loginVerificationPage=loginIndexpage.facebooksocialicon();
		log("To verify facebook is open.");
		if(loginVerificationPage.facebooksocialiconverification())
		{
			Common.logStatus("pass");
		}
		else
		{
			Common.logStatus("fail");
			numOfFailure++;
		}
		Common.closeCurrentTab(driver);
		log("Step 3: Click on twitter icon.");
		loginVerificationPage=loginIndexpage.invalidpassword();
		log("To verify twitter is open.");
		if(loginVerificationPage.invalidpasswordverification())
		{
			Common.logStatus("pass");
		}
		else
		{
			Common.logStatus("fail");
			numOfFailure++;
		}
		Common.closeCurrentTab(driver);
		
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}
}
