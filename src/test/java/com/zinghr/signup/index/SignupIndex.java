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
		log("Testcase Discription : SignUp page verification. ");
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
		log("Step 3: Display Employee Name: "+s_display_name);
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
	log("Step 3: Display Employee Name: "+s_display_name);
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
	log("Step 3: Enter alphabet in 'Display  Admin Name': "+s_display_name);
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
	log("Step 3: Display Employee Name: "+s_display_name);
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
	log("Step 3: Display Employee Name: "+s_display_name);
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
	log("Step 3: Display Employee Name: "+s_display_name);
	log("Step 4: Enter Email id: "+TestData.rndmemail(3));
	log("Step 5: Select any country");
	log("Step 6: Enter Contact no: "+TestData.contactno_s);
		
	signupVerification = signupIndexpage.validContactNum();
	
	log("To verify that user is able to enter numeric values in Contact Number field");	
	
	if(signupVerification.verifyvalidcontactNum())
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

@Test(priority=16)
public void contactNumField2() throws Exception
{
	int numOfFailure = 0;		

	log("Test Case Id : SU_18 ");
	log("Testcase Discription : Enter alphabets and special characters into Contact Number' field.");
	log("Step 1 : Open url:<a>"+testUrl+"</a>");
	log("Step 2: Enter company Name: "+TestData.rndmString(4));
	log("Step 3: Display Employee Name: "+s_display_name);
	log("Step 4: Enter Email id: "+TestData.rndmemail(3));
	log("Step 5: Select any country");
	log("Step 6: Enter Contact no: "+TestData.invalidContactno);
		
	signupVerification = signupIndexpage.invalidContactNum();
	
	log("To verify that error message is displayed when user enters alphabets and special characters in Contact Number field");	
	
	if(signupVerification.verifyInvalidcontactNum())
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

@Test(priority=17)
public void contactNumField3() throws Exception
{
	int numOfFailure = 0;		

	log("Test Case Id : SU_20 ");
	log("Testcase Discription : Enter more than 10 digits into 'Contact Number' field.");
	log("Step 1 : Open url:<a>"+testUrl+"</a>");
	log("Step 2: Enter company Name: "+TestData.rndmString(4));
	log("Step 3: Display Employee Name: "+s_display_name);
	log("Step 4: Enter Email id: "+TestData.rndmemail(3));
	log("Step 5: Select any country");
	log("Step 6: Enter Contact no: "+TestData.largeContactNum);
		
	signupVerification = signupIndexpage.invalidContactNum1();
	
	log("To verify that Max length of 10 characters is provided to Contact Number field");	
	
	if(signupVerification.verifyInvalidcontactNum1())
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

@Test(priority=18)
public void contactNumField4() throws Exception
{
	int numOfFailure = 0;		

	log("Test Case Id : SU_21 ");
	log("Testcase Discription : Enter more than 10 digits into 'Contact Number' field.");
	log("Step 1 : Open url:<a>"+testUrl+"</a>");
	log("Step 2: Enter company Name: "+TestData.rndmString(4));
	log("Step 3: Display Employee Name: "+s_display_name);
	log("Step 4: Enter Email id: "+TestData.rndmemail(3));
	log("Step 5: Select any country");
	log("Step 6: Enter Contact no: "+TestData.blank);
		
	signupVerification = signupIndexpage.blankContactNum();
	
	log("To verify that Contact Number field do not accept blank data.");	
	
	if(signupVerification.verifyBlankcontactNum())
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

@Test(priority=19)
public void termsAndprivacy() throws Exception
{
	int numOfFailure = 0;		

	log("Test Case Id : SU_22 ");
	log("Testcase Discription : Click on 'Terms of Use' and 'Privacy Policy' link.");
	log("Step 1 : Open url:<a>"+testUrl+"</a>");
	log("Step 2 : Click on 'Terms of Use' link.");
		
	signupVerification = signupIndexpage.termsOfUse();
	
	log("To verify that user is redirected to taregeted page after clicking on 'Terms of Use' hyperlink");	
	String winHandleBefore= driver.getWindowHandle();
	
	for(String winHandle : driver.getWindowHandles()){
		driver.switchTo().window(winHandle);
	}
	
	if(signupVerification.verifyTermsOfUse())
	{
		log("<Strong><font color=#008000>Pass</font></strong>");

	}
	else
	{
		log("Fail");
		numOfFailure++;
	}
	
	log("Step 3 : Click on 'Privacy Policy' link.");
	
	driver.switchTo().window(winHandleBefore);
	
	signupVerification = signupIndexpage.privacyPolicy();
	
	log("To verify that user is redirected to taregeted page after clicking on 'Privacy Policy' hyperlink");	
	String winHandleBefore1= driver.getWindowHandle();
	
	for(String winHandle : driver.getWindowHandles())
	{
		driver.switchTo().window(winHandle);
	}
	
	if(signupVerification.verifyPrivacyPolicy())
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

@Test(priority=20)
public void checkbox() throws Exception
{
	int numOfFailure = 0;		

	log("Test Case Id : SU_23 ");
	log("Testcase Discription : Checkbox Checked-unchecked ");
	log("Step 1 : Open url:<a>"+testUrl+"</a>");
	log("Step 2: Enter company Name: "+TestData.rndmString(4));
	log("Step 3: Display Employee Name: "+s_display_name);
	log("Step 4: Enter Email id: "+TestData.rndmemail(3));
	log("Step 5: Select any country");
	log("Step 6: Enter Contact no: "+TestData.contactno_s);
	log("Step 7: Uncheck checkbox.");
		
	signupVerification = signupIndexpage.checkbox();
	
	log("To verify that Alert message is displayed if user unchecked the Terms and condition checkbox");	
	
	if(signupVerification.verifyCheckbox())
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


@Test(priority=21)
public void activationPage() throws Exception
{
	int numOfFailure = 0;		
	
	log("Test Case Id : A_SU_01 ");
	log("Testcase Discription : SignUp successfully and 'Activation Page' verification.");
	log("Step 1 : Open url:<a>"+testUrl+"</a>");
	log("Step 2: Enter company Name: "+TestData.rndmString(4));
	log("Step 3: Display Employee Name: "+s_display_name);
	log("Step 4: Enter Email id: "+TestData.rndmemail(2));
	log("Step 5: Select any country");
	log("Step 6: Enter Contact no: "+TestData.contactno_s);
	log("Step 7: Click on 'Sign Up for 30 days trial' button.");
		
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


@Test(priority=22)
public void emailverification() throws Exception
{
	int numOfFailure = 0;		
	
	log("Test Case Id : A_SU_02 ");
	log("Testcase Discription : SignUp successfully and email verification.");
	log("Step 1 : Open url:<a>"+testUrl+"</a>");
	log("Step 2: Enter company Name: "+TestData.rndmString(4));
	log("Step 3: Display Employee Name: "+s_display_name);
	log("Step 4: Enter Email id: "+emailt);
	log("Step 5: Select any country");
	log("Step 6: Enter Contact no: "+TestData.contactno_s);
	log("Step 7: Click on 'Sign Up for 30 days trial' button.");
		
	signupVerification = signupIndexpage.emailVerification(emailt);
	
	log("To verify Activation page is open or not with Successfully SignUp.");	
	
	if(signupVerification.verifymail())
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

@Test(priority=23)
public void emailFormat() throws Exception
{
	int numOfFailure = 0;		
	
	log("Test Case Id : A_SU_03 ");
	log("Testcase Discription : Email format verification.");
	log("Step 1 : Open url:<a>"+testUrl+"</a>");
	log("Step 2: Enter company Name: "+TestData.rndmString(4));
	log("Step 3: Display Employee Name: "+s_display_name);
	log("Step 4: Enter Email id: "+emailt);
	log("Step 5: Select any country");
	log("Step 6: Enter Contact no: "+TestData.contactno_s);
	log("Step 7: Click on 'Sign Up for 30 days trial' button.");
		
	signupVerification = signupIndexpage.emailFormat(emailt);
	
	log("To verify that the Email is in Proper format.");	
	
	if(signupVerification.verifymailFormat())
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

@Test(priority=24)
public void emailContents() throws Exception
{
	int numOfFailure = 0;		
	
	log("Test Case Id : A_SU_04 ");
	log("Testcase Discription : Email Contents verification.");
	log("Step 1 : Open url:<a>"+testUrl+"</a>");
	log("Step 2: Enter company Name: "+TestData.rndmString(4));
	log("Step 3: Display Employee Name: "+s_display_name);
	log("Step 4: Enter Email id: "+emailt);
	log("Step 5: Select any country");
	log("Step 6: Enter Contact no: "+TestData.contactno_s);
	log("Step 7: Click on 'Sign Up for 30 days trial' button.");
		
	signupVerification = signupIndexpage.emailFormat(emailt);
	
	log("To verify that user is able to view 'Thank You message' and 'Click Here' button in Email");	
	
	if(signupVerification.verifyEmailContents())
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

@Test(priority=25)
public void emailClickHereBtn() throws Exception
{
	int numOfFailure = 0;		
	
	log("Test Case Id : A_SU_05 ");
	log("Testcase Discription : Click here button in email.");
	log("Step 1 : Open url:<a>"+testUrl+"</a>");
	log("Step 2: Enter company Name: "+TestData.rndmString(4));
	log("Step 3: Display Employee Name: "+s_display_name);
	log("Step 4: Enter Email id: "+emailt);
	log("Step 5: Select any country");
	log("Step 6: Enter Contact no: "+TestData.contactno_s);
	log("Step 7: Click on 'Sign Up for 30 days trial' button.");
		
	signupVerification = signupIndexpage.emailClickbutton(emailt);
	
	log("To verify that user is redirected to Active Sign up page after clicking on 'Click Here' button.");	
	
	for(String winHandle : driver.getWindowHandles())
	{
		driver.switchTo().window(winHandle);
	}
	if(signupVerification.verifyActivationPage())
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

@Test(priority=26)
public void enterPaswd() throws Exception
{
	int numOfFailure = 0;		
	
	log("Test Case Id : A_SU_08 ");
	log("Testcase Discription : Click here button in email.");
	log("Step 1 : Open url:<a>"+testUrl+"</a>");
	log("Step 2: Enter company Name: "+TestData.rndmString(4));
	log("Step 3: Display Employee Name: "+s_display_name);
	log("Step 4: Enter Email id: "+emailt);
	log("Step 5: Select any country");
	log("Step 6: Enter Contact no: "+TestData.contactno_s);
	log("Step 7: Click on 'Sign Up for 30 days trial' button.");
		
	signupVerification = signupIndexpage.enterData(emailt,a_pswd,s_display_name);
	
	log("To verify that user is able to enter alphanumeric characters in Password field.");	
	
	for(String winHandle : driver.getWindowHandles())
	{
		driver.switchTo().window(winHandle);
	}
	if(signupVerification.verifyEnterPsswd())
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



