package com.zinghr.tna.verification;

import java.util.Calendar;
import java.util.List;
import java.util.Locale;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.zinghr.init.AbstractPage;

public class SettingsTimeAttendanceSetupVerification extends AbstractPage {

	public SettingsTimeAttendanceSetupVerification(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//h3[contains(.,'Time and Attendance')]")
	WebElement timeandattendance_header;

	public boolean verifyTimeAndAttendancePageisDisplayed() {

		boolean bool = false;

		if (timeandattendance_header.isDisplayed())

		{

			bool = true;

		}

		return bool;
	}

	public boolean verifyTimeAndAttendanceHeader() {
		boolean bool = false;

		if (timeandattendance_header.getText().equals("Time and Attendance"))

		{

			bool = true;

		}

		return bool;
	}

	@FindBy(xpath = "//a[@id='TabTNA']")
	WebElement setMyAttendance_header;

	@FindBy(xpath = "//a[@id='TabLMS']")
	WebElement setupLeavePolicy_header;

	@FindBy(xpath = "//a[@id='TabCal']")
	WebElement setupCalendar_header;

	public boolean verifysetMyAttendanceHeader() {

		boolean bool = false;

		if (setMyAttendance_header.isDisplayed()
				&& setMyAttendance_header.getText().equals("Set My Attendance")) {
			bool = true;
		}

		return bool;
	}

	public boolean verifySetupLeavePolicyHeader() {

		boolean bool = false;

		if (setupLeavePolicy_header.isDisplayed()
				&& setupLeavePolicy_header.getText().equals(
						"Setup Leave Policy")) {
			bool = true;
		}

		return bool;

	}

	public boolean verifySetupCalendarHeader() {

		boolean bool = false;

		if (setupCalendar_header.isDisplayed()
				&& setupCalendar_header.getText().equals("Setup Calendar")) {
			bool = true;
		}

		return bool;

	}

	@FindBy(xpath = "//button[contains(.,'Add New Attendance Group')]")
	WebElement addNewAttendanceGroup_btn;

	public boolean verifyAddNewAttendanceGroupButton() {
		boolean bool = false;

		if (addNewAttendanceGroup_btn.isDisplayed()) {
			bool = true;
		}

		return bool;

	}

	@FindBy(xpath = "//h4[contains(.,'Add New Group')]")
	WebElement addNewGroup_header;

	public boolean verifyNewGroupPopUp() {
		boolean bool = false;
		if (addNewGroup_header.isDisplayed()) {

			bool = true;
		}

		return bool;
	}

	@FindBy(xpath = "//div[@id='box-config']//input")
	WebElement addNewGroup_txtfld;

	public boolean verifyNewGroupTextFieldIsAvailability() {
		boolean bool = false;
		if (addNewGroup_txtfld.isDisplayed()) {

			bool = true;
		}

		return bool;
	}

	@FindBy(xpath = "//div[@id='box-config']//button[contains(.,'Add')]")
	WebElement addNewGroup_btn;

	public boolean verifyNewGroupButtonIsAvailability() {
		boolean bool = false;
		if (addNewGroup_btn.isDisplayed()) {

			bool = true;
		}

		return bool;
	}

	@FindBy(xpath = "//div[@class='tabbable tna_group']//li/a")
	List<WebElement> attendanceGroup_list;

	public boolean verifyCreatedAtteandsGroup(String groupName,
			int totalGroupCount) {
		boolean bool = false;

		for (WebElement e : attendanceGroup_list) {

			if (e.getText().equals(groupName)) {
				bool = true;
				break;
			}

		}

		if ((totalGroupCount + 1) == attendanceGroup_list.size()) {
			bool = true;
		}
		return bool;
	}

	@FindBy(xpath = "//div[@id='box-config']//div[@class='modal-content']")
	WebElement addNewgroup_tab;

	public boolean verifyCancleButton() {

		return !addNewgroup_tab.isDisplayed();
	}

	public boolean verifyCommonGroup() {

		return attendanceGroup_list.get(0).isDisplayed();
	}

	@FindBy(xpath = "//h4[contains(.,'Question')]")
	List<WebElement> questionHeader_list;

	public boolean verifyQuestionHeader() {

		return questionHeader_list.get(0).isDisplayed();
	}

	public boolean verifyQuestionChangeFromCommonGroupHeaderAvailibility() {

		return questionHeader_list.get(1).isDisplayed();
	}

	@FindBy(xpath = "//span[contains(.,'Attendance Marking')]")
	WebElement attendanceMarketing_header;

	public boolean verifyOASPageisDisplayed() {

		return attendanceMarketing_header.isDisplayed();
	}

	@FindBy(xpath = "//div[@id='myTNA']")
	WebElement timeAndAttendanceCalander_sec;

	public boolean verifyTimeAndAttendanceCalendarOnDashboardIsDisplayed() {

		return timeAndAttendanceCalander_sec.isDisplayed();
	}

	@FindBy(xpath = "//span[contains(.,'My Time And Attendance')]")
	WebElement timeAndAttendanceOnDashBoard_header;

	public boolean verifyTimeAndAttendanceHeaderIsDisplayed() {

		return timeAndAttendanceOnDashBoard_header.isDisplayed();
	}

	@FindBy(xpath = "//span[@class='fc-header-title']/h2")
	WebElement monthName_header;

	public boolean verifyCurrentMonthOnTNAOnDashboard() {

		boolean bool = false;
		Calendar c = Calendar.getInstance();

		String currentMonth = c.getDisplayName(Calendar.MONTH, Calendar.LONG,
				Locale.ENGLISH) + " " + c.get(Calendar.YEAR);

		System.out.println(currentMonth);

		System.out.println(monthName_header.getText());

		if (monthName_header.getText().equalsIgnoreCase(currentMonth)) {

			bool = true;

		}

		return bool;
	}

	public boolean verifyNextMonthIsDisplayed() {

		boolean bool = false;

		Calendar c = Calendar.getInstance();
		c.add(Calendar.MONTH, 1);

		String nextMonth = c.getDisplayName(Calendar.MONTH, Calendar.LONG,
				Locale.ENGLISH) + " " + c.get(Calendar.YEAR);

		if (monthName_header.getText().equalsIgnoreCase(nextMonth)) {

			bool = true;

		}

		return bool;
	}

	public boolean verifyPreviousMonthIsDisplayed() {

		boolean bool = false;

		Calendar c = Calendar.getInstance();
		c.add(Calendar.MONTH, -1);

		String previousMonth = c.getDisplayName(Calendar.MONTH, Calendar.LONG,
				Locale.ENGLISH) + " " + c.get(Calendar.YEAR);

		if (monthName_header.getText().equalsIgnoreCase(previousMonth)) {

			bool = true;

		}

		return bool;
	}

	@FindBy(xpath = "//a[contains(.,'Holiday List')]")
	WebElement holidayList_button;

	public boolean verifyHolidayListButtonIsDisplayed() {

		return holidayList_button.isDisplayed();
	}

	@FindBy(xpath = "//div[@id='dialogParent']")
	WebElement holidayList_popup;

	public boolean verifyHolidayListPopupIsDisplayed() {
		return holidayList_popup.isDisplayed();
	}

	@FindBy(xpath = "//div[contains(@class,'holidayList')]")
	WebElement holidayDetails_popup;

	public boolean verifyHolidayDetailsisDisplayedOnPopup() {
		return holidayDetails_popup.isDisplayed();
	}

	@FindBy(xpath = "//div[contains(@id,'RegularizationPopup')]")
	WebElement regularize_popup;

	public boolean verifyRegularizationPopupIsDisplayed() {
		return regularize_popup.isDisplayed();
	}

	@FindBy(xpath = "//span[contains(.,'Apply Regularization')]")
	WebElement applyRegularize_header;

	public boolean verifyRegularizationPopupHeaderIsDisplayed() {
		return applyRegularize_header.isDisplayed();
	}

	@FindBy(xpath = "//div[@class='modal-body']//div[contains(.,'Please select an action')]")
	WebElement selectActionMessage_alert;

	public boolean verifyBlankActionValidationMessage() {
		return selectActionMessage_alert.isDisplayed();
	}

}
