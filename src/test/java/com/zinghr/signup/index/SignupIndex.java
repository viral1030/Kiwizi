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
		
		log("Test Case Id : SU_02 ");
		log("Testcase Discription : To test TNA functionality ");
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
		
		log("Step 2: Enter company Name: "+TestData.rndmString(4));
		log("Step 3: Display Employee Name: "+TestData.rndmString(6));
		log("Step 4: Enter Email id: "+TestData.rndmemail(3));
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


@Test(priority=3)
public void SignUpSuccessfully1() throws Exception
{
	int numOfFailure = 0;		
	
	log("Test Case Id : SU_03 ");
	log("Testcase Discription : Field validation for 'Company name' field");
	log("Step 1 : Open url:<a>"+testUrl+"</a>");
	log("Step 2: Enter Alphanumeric value in company Name: "+TestData.rndmString(4));
		
	signupVerification = signupIndexpage.SignUpsuccessfully();
	
	log("To verify that user is able to enter Alphanumeric characters in 'Company Name' field");	
	
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


@Test(priority=4)
public void SignUpSuccessfully2() throws Exception
{
	int numOfFailure = 0;		

	log("Test Case Id : SU_04 ");
	log("Testcase Discription : Field validation for 'Company name' field");
	log("Step 1 : Open url:<a>"+testUrl+"</a>");
	log("Step 2: Enter Blank space in company Name: "+TestData.blank);
		
	signupVerification = signupIndexpage.blankCompanyCode();
	
	log("To verify that the company name field do not accept blank space");	
	
	if(signupVerification.verifyblankCompanycode())
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


@Test(priority=5)
public void SignUpSuccessfully3() throws Exception
{
	int numOfFailure = 0;		

	log("Test Case Id : SU_06 ");
	log("Testcase Discription : Field validation for 'Company name' field");
	log("Step 1 : Open url:<a>"+testUrl+"</a>");
	log("Step 2: Enter less than three characters in company Name: "+TestData.rndmString(2));
		
	signupVerification = signupIndexpage.lessthan3CompanyCode();
	
	log("To verify that appropriate error message is displayed if user enters less than three characters in 'Company Name' field");	
	
	if(signupVerification.verifylessthan3Companycode())
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


@Test(priority=6)
public void SignUpSuccessfully4() throws Exception
{
	int numOfFailure = 0;		

	log("Test Case Id : SU_07 ");
	log("Testcase Discription : Field validation for 'Company name' field");
	log("Step 1 : Open url:<a>"+testUrl+"</a>");
	log("Step 2: Do not enter any data into 'Company Code'.");
	log("Step 3: Display Employee Name: "+TestData.rndmString(6));
	log("Step 4: Enter Email id: "+TestData.rndmemail(3));
	log("Step 5: Select any country");
	log("Step 6: Enter Contact no: "+TestData.contactno_s);
	
	
	signupVerification = signupIndexpage.emptyCompanyCode();
	
	log("To verify that appropriate error message is displayed if user enters less than three characters in 'Company Name' field");	
	
	if(signupVerification.verifyemptyCompanycode())
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



