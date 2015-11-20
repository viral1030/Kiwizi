package com.zinghr.tna.index;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.zinghr.init.Common;
import com.zinghr.init.SeleniumInit;
import com.zinghr.init.TestData;

public class OASIndex extends SeleniumInit {
	
	
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
	
	public void OASlandingpage()
	{
		int numOfFailure = 0;

		loginwithvalidcredential();
		log("Step 5: Click OAS menu");
	
		oasVerificationPage=oasIndexPage.oaslandingpage();
		log("Verify that Home page is open or not");
		if(oasVerificationPage.oaslandingpageverification())
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
	public void To_verify_the_contents_of_the_title()
	{
		int numOfFailure = 0;
		
		OASlandingpage();
		
		log("To verify that OAS page contains Attendance Marking label");
		if(oasVerificationPage.attendance_marking_verification())
		{
			Common.logStatus("pass");
		}
		else
		{
			Common.logStatus("fail");
			numOfFailure++;
		}
		
		log("To verify that OAS page contains current open cycle label");
		if(oasVerificationPage.Current_open_cycle_verification())
		{
			Common.logStatus("pass");
		}
		else
		{
			Common.logStatus("fail");
			numOfFailure++;
		}
		
		log("To verify that OAS page contains Current Month & Previous Month tabs");
		if(oasVerificationPage.previous_next_month_verification())
		{
			Common.logStatus("pass");
		}
		else
		{
			Common.logStatus("fail");
			numOfFailure++;
		}
		
		log("To verify that OAS page contains Status Indicator label");
		if(oasVerificationPage.previous_next_month_verification())
		{
			Common.logStatus("pass");
		}
		else
		{
			Common.logStatus("fail");
			numOfFailure++;
		}
		
		log("To verify that OAS page contains Raw Data & Processed Data tabs");
		if(oasVerificationPage.previous_next_month_verification())
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

}
