package com.zinghr.tna.verification;

import java.util.Calendar;
import java.util.Locale;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.zinghr.init.AbstractPage;
import com.zinghr.init.Common;

public class DashboardTimeNAttendanceCaVerification extends AbstractPage {

	public DashboardTimeNAttendanceCaVerification(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
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
		Common.pause(2);
		return selectActionMessage_alert.isDisplayed();
	}

}
