package com.zinghr.signup.index;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.zinghr.init.SeleniumInit;

public class SignupIndex extends SeleniumInit {

	@Test
	public void SignUpPage() throws Exception 
	{

		int numOfFailure = 1;
		
		log("Step 1 : Open url:<a>"+testUrl+"</a>");
		log("Verify that ZingHR login page is open or not.");
			
		//	l_verify = l_index_page.loginPage();
			
			
			if(l_verify.loginPage_verify())
			{
				log("<Strong><font color=#008000>Pass</font></strong>");
		//		Common.makepassScreenshot(driver,"valid_pass");
			}
			else
			{
				log("Fail");
			}
		}	
		
		@Test(priority=2)
		public void loginFunctionality() throws Exception
		{
			
			
			l_verify = l_index_page.login(zingCompany_Code, zingEmployee_Code, zingPassword);
			
			if(l_verify.loginSuccessfully_verify())
			{
				log("<Strong><font color=#008000>Pass</font></strong>");
		//		Common.makepassScreenshot(driver,"valid_pass");
			}
			else
			{
				log("Fail");
			}
			
		
		}

		
		
		
		
		
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}

}


log("Step : Enter Company Name: "+compny);
log("Step : Enter Admin Display Name: "+display);
log("Step : Enter Email Id: "+email);
log("Step : Enter Contact Number: "+no);




