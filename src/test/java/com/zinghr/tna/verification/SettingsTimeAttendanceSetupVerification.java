package com.zinghr.tna.verification;

import java.util.List;

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

}
