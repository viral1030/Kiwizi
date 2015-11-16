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
		
		log("To verify Activation page is open or not with Successfully SignUp.");	
		
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
public void companynameField1() throws Exception
{
	int numOfFailure = 0;		
	
	log("Test Case Id : SU_03 ");
	log("Testcase Discription : Field validation for 'Company name' field");
	log("Step 1 : Open url:<a>"+testUrl+"</a>");
	log("Step 2: Enter Alphanumeric value in company Name: "+TestData.rndmString(4));
		
	signupVerification = signupIndexpage.alphanumCompanyName();
	
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
public void companynameField2() throws Exception
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
public void companynameField3() throws Exception
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
public void companynameField4() throws Exception
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
	
	log("To verify that appropriate alert message 'Please Enter company name' is displayed when user sign ups with empty Company Name field");	
	
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

@Test(priority=7)
public void displaynameField1() throws Exception
{
	int numOfFailure = 0;		

	log("Test Case Id : SU_08 ");
	log("Testcase Discription : Field validation for 'Display name' field");
	log("Step 1 : Open url:<a>"+testUrl+"</a>");
	log("Step 2: Enter 'Company Name':"+TestData.rndmString(4));
	log("Step 3: Enter alphabet in 'Display  Admin Name': "+TestData.rndmString(6));
	/*log("Step 4: Enter Email id: "+TestData.rndmemail(3));
	log("Step 5: Select any country");
	log("Step 6: Enter Contact no: "+TestData.contactno_s);
	*/
	
	signupVerification = signupIndexpage.alphabetDisplayname();
	
	log("To verify that user is able to enter alphabets in 'Display Name' field");	
	
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

@Test(priority=8)
public void displaynameField2() throws Exception
{
	int numOfFailure = 0;		

	log("Test Case Id : SU_09 ");
	log("Testcase Discription : Field validation for 'Display name' field");
	log("Step 1 : Open url:<a>"+testUrl+"</a>");
	log("Step 2: Enter 'Company Name':"+TestData.rndmString(4));
	log("Step 3: Enter invalid data in 'Display Admin Name': "+TestData.invalid);
	/*log("Step 4: Enter Email id: "+TestData.rndmemail(3));
	log("Step 5: Select any country");
	log("Step 6: Enter Contact no: "+TestData.contactno_s);*/
	
	
	signupVerification = signupIndexpage.invalidDisplayAdminName();
	
	log("To verify that appropriate error message is displayed if user enters less than three characters in 'Company Name' field");	
	
	if(signupVerification.verifyInvalidDisplayAdminName())
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


@Test(priority=9)
public void displaynameField3() throws Exception
{
	int numOfFailure = 0;		

	log("Test Case Id : SU_11 ");
	log("Testcase Discription : Field validation for 'Display Name' field");
	log("Step 1: Open url:<a>"+testUrl+"</a>");
	log("Step 2: Enter Blank space in 'Display AdminName': "+TestData.blank);
		
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

@Test(priority=10)
public void emailidField1() throws Exception
{
	int numOfFailure = 0;		

	log("Test Case Id : SU_12 ");
	log("Testcase Discription : Field validation for 'Email ID' field");
	log("Step 1 : Open url:<a>"+testUrl+"</a>");
	log("Step 2: Enter valid 'Email Id': "+TestData.rndmemail(3));
		
	signupVerification = signupIndexpage.validEmailId();
	
	log("To verify that Email id field accepts valid email id format.");	
	
	if(signupVerification.verifyValidEmailId())
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


@Test(priority=11)
public void emailidField2() throws Exception
{
	int numOfFailure = 0;		

	log("Test Case Id : SU_13 ");
	log("Testcase Discription : Field validation for 'Email ID' field");
	log("Step 1 : Open url:<a>"+testUrl+"</a>");
	log("Step 2: Enter invalid 'Email Id': "+TestData.rndm_invalid_email(2));
		
	signupVerification = signupIndexpage.invalidEmailId();
	
	log("To verify that appropriate error message is displayed when user enter invalid email format in Email field.");	
	
	if(signupVerification.verifyInvalidEmailId())
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


@Test(priority=12)
public void emailidField3() throws Exception
{
	int numOfFailure = 0;		

	log("Test Case Id : SU_14 ");
	log("Testcase Discription : Field validation for 'Email ID' field");
	log("Step 1 : Open url:<a>"+testUrl+"</a>");
	log("Step 2: Enter blank data in 'Email Id': "+TestData.blank);
		
	signupVerification = signupIndexpage.blankEmailId();
	
	log("To verify that Email id field do not accept blank data");	
	
	if(signupVerification.verifyblankEmailId())
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

@Test(priority=13)
public void selectCountry() throws Exception
{
	int numOfFailure = 0;		

	log("Test Case Id : SU_15 ");
	log("Testcase Discription : Select other country from country list.");
	log("Step 1 : Open url:<a>"+testUrl+"</a>");
	log("Step 2: Enter company Name: "+TestData.rndmString(4));
	log("Step 3: Display Employee Name: "+TestData.rndmString(6));
	log("Step 4: Enter Email id: "+TestData.rndmemail(3));
	log("Step 5: Select any country");
	log("Step 6: Enter Contact no: "+TestData.contactno_s);
		
	signupVerification = signupIndexpage.selectOtherCountries();
	
	log("To verify that user is able to select other country name");	
	
	if(signupVerification.verifyCountrySelection())
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


@Test(priority=14)
public void selectNoCountry() throws Exception
{
	int numOfFailure = 0;		

	log("Test Case Id : SU_16 ");
	log("Testcase Discription : Select 'Select Country ' country list.");
	log("Step 1 : Open url:<a>"+testUrl+"</a>");
	log("Step 2: Enter company Name: "+TestData.rndmString(4));
	log("Step 3: Display Employee Name: "+TestData.rndmString(6));
	log("Step 4: Enter Email id: "+TestData.rndmemail(3));
	log("Step 5: Select 'Select Country' option from country name field");
	/*log("Step 6: Enter Contact no: "+TestData.contactno_s);*/
		
	signupVerification = signupIndexpage.selectNoCountry();
	
	log("To verify that appropriate error message is displayed when user selects 'Select Country' option from Country Name field");	
	
	if(signupVerification.verifynoCountry())
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

@Test(priority=15)
public void contactNumField1() throws Exception
{
	int numOfFailure = 0;		

	log("Test Case Id : SU_17 ");
	log("Testcase Discription : Enter numeric value into Contact Number' field.");
	log("Step 1 : Open url:<a>"+testUrl+"</a>");
	log("Step 2: Enter company Name: "+TestData.rndmString(4));
	log("Step 3: Display Employee Name: "+TestData.rndmString(6));
	log("Step 4: Enter Email id: "+TestData.rndmemail(3));
	log("Step 5: Select any country");
	log("Step 6: Enter Contact no: "+TestData.contactno_s);
		
	signupVerification = signupIndexpage.validContactnum();
	
	log("To verify that user is able to enter numeric values in Contact Number field");	
	
	if(signupVerification.verifyvalidcontactnum())
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



