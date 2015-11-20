package com.zinghr.tna.index;

import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.zinghr.init.Common;
import com.zinghr.init.SeleniumInit;
import com.zinghr.init.TestData;

public class SettingsTimeAttendanceSetupIndex extends SeleniumInit {

	@Test
	public void timeAndAttendancePage() {

		int numOfFailure = 0;

		log("Testcase Ids : Setup_02 , Setup_03 , Setup_04");

		log("Step 1 : Open url:<a>" + testUrl + "</a>");

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

		log("Step 5: Click on Proceed Button");

		log("Step 6: Click on Setting Icon");

		log("Step 7: Click on Time and attendence option from Circle");

		taSetupIndexPage.TimeAndAttendancePageOpen();

		
		Common.pause(100);
		
		
		log("Verify Time and attendence Page is open or not");

		if (taSetupVerificationPage.verifyTimeAndAttendancePageisDisplayed()) {
			Common.logStatus("Pass");
		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		log("Verify Time and attendence Page Header");

		if (taSetupVerificationPage.verifyTimeAndAttendanceHeader()) {
			Common.logStatus("Pass");
		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		log("Verify Following Field :"
				+ "1.Set My Attendance 2. Setup Leave Policy 3. Setup Calender");

		log("Verify Header : Set My Attendance");

		if (taSetupVerificationPage.verifysetMyAttendanceHeader()) {

			Common.logStatus("Pass");
		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		log("Verify Header : Setup Leave Policy");

		if (taSetupVerificationPage.verifySetupLeavePolicyHeader()) {

		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		log("Verify Header : Setup Calender");

		if (taSetupVerificationPage.verifySetupCalendarHeader()) {

		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}

	@Test
	public void addNewAttendanceGroupTapFunctionality() {
		int numOfFailure = 0;

		log("Testcase Id : Setup_05,Setup_06,Setup_07,Setup_09  ");
		log("Testcase Discription :  ");

		log("Step 1 : Open url:<a>" + testUrl + "</a>");

		log("Step 2: Enter Company Code:" + TestData.company_code);
		log("Step 3: Enter Employee Code: " + TestData.employe_code);
		log("Step 4: Enter Password: " + TestData.password);
		log("Step 5: Click on Proceed Button");

		loginVerificationPage = loginIndexpage.loginSuccessfully();
		log("Verify that Home page is open or not");

		if (loginVerificationPage.loginpagewithvalidcredentialverification()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		log("Step 6: Click on Setting Icon");

		log("Step 7: Click on Time and attendence option from Circle");

		taSetupIndexPage.TimeAndAttendancePageOpen();

		log("Verify Add New Attendance Group tab is available");

		if (taSetupVerificationPage.verifyAddNewAttendanceGroupButton()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		log("Step 8: Click on Add New Attendance Group Button");

		taSetupIndexPage.clickAddNewAttendanceGroup();
		log("Verify Add New Group pop up is displayed");

		if (taSetupVerificationPage.verifyNewGroupPopUp()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		log("Verify Group text filed  displayed on Add New Group Pop up ");

		if (taSetupVerificationPage.verifyNewGroupTextFieldIsAvailability()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		log("Verify Add New Group button  displayed on Add New Group Pop up ");

		if (taSetupVerificationPage.verifyNewGroupButtonIsAvailability()) {
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
	public void addedGroupVerifiaction() {
		int numOfFailure = 0;
		log("Testcase Id : Setup_08,Setup_10,Setup_13,Setup_14 ");
		log("Testcase Discription : To test 'Add New Attendance Group' functionality ");

		log("Step 1 : Open url:<a>" + testUrl + "</a>");

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

		log("Step 5: Click on Proceed Button");

		log("Step 6: Click on Setting Icon");

		log("Step 7: Click on Time and attendence option from Circle");

		taSetupIndexPage.TimeAndAttendancePageOpen();

		log("Step 8: Click on Add New Attendance Group Button");

		taSetupIndexPage.clickAddNewAttendanceGroup();
		log("Verify Add New Group pop up is displayed");
		if (taSetupVerificationPage.verifyNewGroupPopUp()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		int avalilableGroupCount = taSetupIndexPage
				.calculateAvailableAttendanceGroup();
		String newGroupName = TestData.rndmString(5);

		log("Available Attendance group : " + avalilableGroupCount);

		log("Step 9 : Enter Group Name :  <b>" + newGroupName + "</b>");

		log("Step 10 : Click on Add button on pop up");
		taSetupIndexPage.enterNewGroupName(newGroupName);

		log("Step 11 : Click on Cancle button pop up");

		taSetupIndexPage.clickCloseButtonOnPopup();

		log("Verify Cancle button functionality");

		if (taSetupVerificationPage.verifyCancleButton()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		log("Verify new created Attendance Group ");
		if (taSetupVerificationPage.verifyCreatedAtteandsGroup(newGroupName,
				avalilableGroupCount)) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		log("Verify Common Group is display");

		if (taSetupVerificationPage.verifyCommonGroup()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}

	public void questionsheaderAvailibility() {

		int numOfFailure = 0;
		log("Testcase Id : Setup_16,Setup_17 ");
		log("Testcase Discription :  ");

		log("Step 1 : Open url:<a>" + testUrl + "</a>");

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

		log("Step 5: Click on Proceed Button");

		log("Step 6: Click on Setting Icon");

		log("Step 7: Click on Time and attendence option from Circle");

		taSetupIndexPage.TimeAndAttendancePageOpen();

		log("Step 8: Click on Add New Attendance Group Button");

		taSetupIndexPage.clickAddNewAttendanceGroup();
		log("Verify Add New Group pop up is displayed");
		if (taSetupVerificationPage.verifyNewGroupPopUp()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		int avalilableGroupCount = taSetupIndexPage
				.calculateAvailableAttendanceGroup();
		String newGroupName = TestData.rndmString(5);

		log("Available Attendance group : " + avalilableGroupCount);

		log("Step 9 : Enter Group Name :  <b>" + newGroupName + "</b>");

		log("Step 10 : Click on Add button on pop up");
		taSetupIndexPage.enterNewGroupName(newGroupName);

		log("Step 11 : Click on Cancle button pop up");

		taSetupIndexPage.clickCloseButtonOnPopup();

		log("Verify Questions header is displayed into common group.");

		if (taSetupVerificationPage.verifyQuestionHeader()) {

			Common.logStatus("pass");
		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		log("Verify Header : Questions (This section can only be changed from Common Group.) is not displyed from common group");

		if (taSetupVerificationPage
				.verifyQuestionChangeFromCommonGroupHeaderAvailibility()) {

			Common.logStatus("pass");
		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		/*
		 * if (taSetupVerificationPage.verifyCancleButton()) {
		 * Common.logStatus("pass"); } else { Common.logStatus("Fail");
		 * numOfFailure++; }
		 */

		/*
		 * log("Verify new created Attendance Group "); if
		 * (taSetupVerificationPage.verifyCreatedAtteandsGroup(newGroupName,
		 * avalilableGroupCount)) { Common.logStatus("pass"); } else {
		 * Common.logStatus("Fail"); numOfFailure++; }
		 */

		/*
		 * log("Verify Common Group is display");
		 * 
		 * if (taSetupVerificationPage.verifyCommonGroup()) {
		 * Common.logStatus("pass"); } else { Common.logStatus("Fail");
		 * numOfFailure++; }
		 */

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}

	@Test
	public void firstBlockOFQuestionSecFunctionality()

	{

		int numOfFailure = 0;
		log("Testcase Id : Setup_18,Setup_19 ");
		log("Testcase Discription :  ");

		log("Step 1 : Open url:<a>" + testUrl + "</a>");

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

		log("Step 5: Click on Proceed Button");

		log("Step 6: Click on Setting Icon");

		log("Step 7: Click on Time and attendence option from Circle");

		taSetupIndexPage.TimeAndAttendancePageOpen();

		log("Verify Following Options are displayed in first block of question section"
				+ "<br> Biometric "
				+ "<br> Swipecards "
				+ "<br> PunchIN "
				+ "<br> Manager Marking " + "<br> Mobile");

		if (taSetupVerificationPage.verifyFirstblockCheckBoxIsDisplayed()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		log("Verify Following options are selected by default"
				+ "<br> Biometric " + "<br> PunchIN " + "<br> Manager Marking ");

		if (taSetupVerificationPage.verifyFirstBlockCheckboxSelectedByDefault()) {
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
	public void secondBlockOfQuestionSecFunctionality() {

		int numOfFailure = 0;
		log("Testcase Id : Setup_24,Setup_25(pending) ");
		log("Testcase Discription :  ");

		log("Step 1 : Open url:<a>" + testUrl + "</a>");

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

		log("Step 5: Click on Proceed Button");

		log("Step 6: Click on Setting Icon");

		log("Step 7: Click on Time and attendence option from Circle");

		taSetupIndexPage.TimeAndAttendancePageOpen();

		log("Verify Following Options are displayed in third block of question section"
				+ "<br> Attendance Cycle starts "
				+ "<br> Attendance Open"
				+ "<br> Attendance Close");

		if (taSetupVerificationPage.verifySecondBlockDropDownIsDisplayed()) {
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
	public void thirdBlockOfQuestionSecFunctionality() {

		int numOfFailure = 0;
		log("Testcase Id : Setup_26 ");
		log("Testcase Discription :  ");

		log("Step 1 : Open url:<a>" + testUrl + "</a>");

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

		log("Step 5: Click on Proceed Button");

		log("Step 6: Click on Setting Icon");

		log("Step 7: Click on Time and attendence option from Circle");

		taSetupIndexPage.TimeAndAttendancePageOpen();

		log("Verify Following Options are displayed in third block of question section"
				+ "<br> Attendance Cycle starts "
				+ "<br> Attendance Open"
				+ "<br> Attendance Close");

		if (taSetupVerificationPage.verifyThirdBlockRadioButtonIsDisplayed()) {
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
	public void shiftRosteringYesButtonFunctionality() {

		int numOfFailure = 0;
		log("Testcase Id : Setup_27,Setup_28,Setup_29,Setup_30,Setup_31,Setup_34,Setup_35,Setup_36,Setup_35,Setup_37,Setup_45,Setup_49,Setup_50 ");
		log("Testcase Discription :  ");

		log("Step 1 : Open url:<a>" + testUrl + "</a>");

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

		log("Step 5: Click on Proceed Button");

		log("Step 6: Click on Setting Icon");

		log("Step 7: Click on Time and attendence option from Circle");

		taSetupIndexPage.TimeAndAttendancePageOpen();

		log("Step 8 : Click on Yes From third block of Question sec");

		taSetupIndexPage.clickShiftRosterYesRadioButton();

		log("Verify Shift Master Link is displayed");

		if (taSetupVerificationPage.verifyShiftMasterLinkIsDisplayed()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		log("Step 9 : Click on Shift Master link");

		taSetupIndexPage.clickShiftMasterLink();

		log("Verify Shift Master Dialog is displayed");

		if (taSetupVerificationPage.verifyShiftMasterPopupIsDisplayed()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		log("Verify Shift Master Dialog title is displayed");

		if (taSetupVerificationPage.verifyShiftMasterPopuptitleIsDisplayed()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		log("Verify Select Shift drop down is displayed on Shift Master Dialog");

		if (taSetupVerificationPage.verifySelectShiftDropdownIsDisplayed()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		log("Verify Shift Name textfield is displayed");

		if (taSetupVerificationPage.verifyShiftNameTextFieldIsDisplayed()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		log("Verify Night Shift Radio button is displayed");

		if (taSetupVerificationPage
				.verifyNightShiftApplicableRadioButtonIsDisplayed()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		log("Verify Is Date Overlapping in shift Radio button is displayed");

		if (taSetupVerificationPage
				.verifyDateOverlappingShiftRadioButtonIsDisplayed()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		log("Verify In Time textfield and Out Time textfield is displayed");

		if (taSetupVerificationPage
				.verifyInTimeAndOutTimeTextfieldIsDisplayed()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		log("Verify Swipe Separator Parameter textfield is displayed");

		if (taSetupVerificationPage
				.verifyswipeSeparatorParameteTextfieldIsDisplayed()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		log("Verify Cancle Button and Submit Button is displayed on Shift Master Dialog ");

		if (taSetupVerificationPage.verifySubmitAndCancleButtonIsDisplayed()) {
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
	public void shiftRosteringManadatoryFieldFunctionality() {

		int numOfFailure = 0;
		log("Testcase Id : Setup_33,Setup_41,Setup_42_Setup_48  ");
		log("Testcase Discription :  ");

		log("Step 1 : Open url:<a>" + testUrl + "</a>");

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

		log("Step 5: Click on Proceed Button");

		log("Step 6: Click on Setting Icon");

		log("Step 7: Click on Time and attendence option from Circle");

		taSetupIndexPage.TimeAndAttendancePageOpen();

		log("Step 8 : Click on Yes From third block of Question sec");

		taSetupIndexPage.clickShiftRosterYesRadioButton();

		log("Verify Shift Master Link is displayed");

		if (taSetupVerificationPage.verifyShiftMasterLinkIsDisplayed()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		log("Step 9 : Click on Shift Master link");

		taSetupIndexPage.clickShiftMasterLink();

		log("Step 10 : Click on Submit Button");

		taSetupIndexPage.clickSubmitButtonOnShiftMasterDialog();

		log("Verify Validation message is displayed for following mandatory field"
				+ "<br>Shift Name"
				+ "<br>In Time"
				+ "<br>Out Time"
				+ "<br>Swipe Separator Parameter"
				+ "<br>Shift Total Minutes  ");

		if (taSetupVerificationPage.verifyManadatoryFieldOfShiftMasterPage()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * @Test public void oasMenuFunctionality() {
	 * 
	 * int numOfFailure = 0; log("Testcase Id : , ");
	 * log("Testcase Discription :  ");
	 * 
	 * log("Step 1 : Open url:<a>" + testUrl + "</a>");
	 * 
	 * log("Step 2: Enter Company Code:" + TestData.company_code);
	 * log("Step 3: Enter Employee Code: " + TestData.employe_code);
	 * log("Step 4: Enter Password: " + TestData.password);
	 * 
	 * loginVerificationPage = loginIndexpage.loginSuccessfully();
	 * log("Verify that Home page is open or not");
	 * 
	 * if (loginVerificationPage.loginpagewithvalidcredentialverification()) {
	 * Common.logStatus("pass"); } else { Common.logStatus("fail");
	 * numOfFailure++; }
	 * 
	 * log("Step 5: Click on Proceed Button");
	 * 
	 * log("Step 6: Click on OAS Option from Left Menu");
	 * 
	 * taSetupIndexPage.clickOASMenu();
	 * 
	 * if (taSetupVerificationPage.verifyOASPageisDisplayed()) {
	 * 
	 * Common.logStatus("pass"); } else { Common.logStatus("Fail");
	 * numOfFailure++; }
	 * 
	 * if (numOfFailure > 0) { Assert.assertTrue(false); }
	 * 
	 * }
	 */

}
