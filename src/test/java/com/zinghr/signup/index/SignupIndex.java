package com.zinghr.signup.index;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.zinghr.init.SeleniumInit;
import com.zinghr.init.TestData;

public class SignupIndex extends SeleniumInit {


@Test(priority=1)
public void SignUpPage() throws Exception 
	{

		int numOfFailure = 0;
		
		log("Step 1 : Open url:<a>"+testUrl+"</a>");
		
		signupVerification = signupIndexpage.SignupPage();
		
		log("Verify that ZingHR SignUp page is open or not.");
		
		if(signupVerification.verifySignupPage())
			{
				log("<Strong><font color=#008000>Pass</font></strong>");
		
			}
		else
			{
				log("Fail");
				numOfFailure++;
			}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
			}
			
	}	
		
	
@Test(priority=2)
public void SignUpSuccessfully() throws Exception
	{
		int numOfFailure = 0;		
		
		SignUpPage();
		
		log("Step 2: Enter company Name: "+TestData.company_code_s);
		log("Step 3: Display Employee Name: "+TestData.dispayname_s);
		log("Step 4: Enter Email id: "+TestData.email_s);
		log("Step 5: Select any country");
		log("Step 6: Enter Contact no: "+TestData.contactno_s);
			
		signupVerification = signupIndexpage.SignUpsuccessfully();
		
		log("To verify Activation page is open or not.");	
		
		if(signupVerification.verifySignupSuccessfully())
			{
				log("<Strong><font color=#008000>Pass</font></strong>");
		
			}
		else
			{
				log("Fail");
				numOfFailure++;
			}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
			}
		
		}

}



