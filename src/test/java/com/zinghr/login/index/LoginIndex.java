package com.zinghr.login.index;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.zinghr.init.Common;
import com.zinghr.init.SeleniumInit;

public class LoginIndex extends SeleniumInit {

	@Test
	public void loginlandingpage() {

		int numOfFailure = 1;
		log("Step 1 : Open url:<a>"+testUrl+"</a>");
		log("Verify that ZingHR login page is open or not.");
		
		loginVerificationPage=loginIndexpage.loginlandingpage();
		
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

}
