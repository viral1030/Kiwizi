package com.zinghr.tna.index;

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

	@Test
	public void timeAndAttendanceCalanderFunctionalityOnDashBoard() {

		int numOfFailure = 0;
		log("Testcase Id : , ");
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

		log("Verify Time And Attendance calendar is displayed on Dashboard");

		if (taSetupVerificationPage
				.verifyTimeAndAttendanceCalendarOnDashboardIsDisplayed())

		{
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		log("Verify Time and Attendance Header on Dashboard");

		if (taSetupVerificationPage.verifyTimeAndAttendanceHeaderIsDisplayed())

		{
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		log("Verify Current Month is displayed By default");

		if (taSetupVerificationPage.verifyCurrentMonthOnTNAOnDashboard())

		{
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
	public void forwardAndBackwardArrowFunctionalityOnMyTNA() {
		int numOfFailure = 0;
		log("Testcase Id : , ");
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

		log("Step 6 : Click on Forward Arrow");

		taSetupIndexPage.clickOnForwardArrow();

		log("Verify Next Month is displayed");

		if (taSetupVerificationPage.verifyNextMonthIsDisplayed())

		{
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		log("Step 7 : Click on Backward Arrow");

		taSetupIndexPage.clickOnbackwordArrow();

		taSetupIndexPage.clickOnbackwordArrow();
		log("Verify Previous Month is displayed");

		if (taSetupVerificationPage.verifyPreviousMonthIsDisplayed())

		{
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
	public void holidaytabFunctionality() {

		int numOfFailure = 0;
		log("Testcase Id : TNA_6,TNA_7,TNA_8 ");
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

		log("Verify that Holiday list button is displayed");

		if (taSetupVerificationPage.verifyHolidayListButtonIsDisplayed()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		log("Step 5: Click on HolidayList Button");

		taSetupIndexPage.clickOnHolyDayListTab();

		log("Verify Holiday List pop is displayed");

		if (taSetupVerificationPage.verifyHolidayListPopupIsDisplayed()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		log("Verify Holiday Details is displayed on pop up");

		if (taSetupVerificationPage.verifyHolidayDetailsisDisplayedOnPopup()) {
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
	public void regularizeButtonFunctionality() {

		int numOfFailure = 0;
		log("Testcase Id : TNA_18, TNA_19");
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

		log("Step 6: Click on Regularize Button");

		taSetupIndexPage.clickRegularizeButton();

		log("Verify Apply Regularization Pop up is displayed");

		if (taSetupVerificationPage.verifyRegularizationPopupIsDisplayed()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		log("Verify Apply Regulatization header is displayed");

		if (taSetupVerificationPage
				.verifyRegularizationPopupHeaderIsDisplayed()) {
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
	public void applyNowButtonFunctionalityOnRefulationPopup() {
		int numOfFailure = 0;
		log("Testcase Id : TNA_18, TNA_19");
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

		log("Step 6: Click on Regularize Button");

		taSetupIndexPage.clickRegularizeButton();

		log("Step 7: Click on Apply Now Button");

		taSetupIndexPage.clickApplyNowButton();

		log("Verify validation message is displayed");

		if (taSetupVerificationPage.verifyBlankActionValidationMessage())

		{
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}

}
