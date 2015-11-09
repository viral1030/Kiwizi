package com.zinghr.tna.indexpage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.zinghr.init.AbstractPage;
import com.zinghr.init.Common;
import com.zinghr.init.TestData;
import com.zinghr.tna.verification.SettingsTimeAttendanceSetupVerification;

public class SettingsTimeAttendanceSetupIndexPage extends AbstractPage {

	public SettingsTimeAttendanceSetupIndexPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//div[@id='btnDemoData']//a[@class='btn btn-primary']")
	WebElement ProceedCurrentPlanAndDemoData_btn;

	@FindBy(xpath = "//li[@id='HeaderSetting']")
	WebElement settingIcon_btn;

	@FindBy(xpath = "//div[@id='dvTNA']/p[1]")
	WebElement timeAndAttendence_btn;

	public SettingsTimeAttendanceSetupVerification clickProceedButtonofCurrentPlanAndDemoData() {

		/* Common.clickOn(driver, ProceedCurrentPlanAndDemoData_btn); */

		ProceedCurrentPlanAndDemoData_btn.click();

		return new SettingsTimeAttendanceSetupVerification(driver);
	}

	public SettingsTimeAttendanceSetupVerification clickSettingsIcon() {

		Common.clickOn(driver, settingIcon_btn);

		/* settingIcon_btn.click(); */

		return new SettingsTimeAttendanceSetupVerification(driver);
	}

	public SettingsTimeAttendanceSetupVerification clickTimeAndAttendenseFromCircle() {

		Common.clickOn(driver, timeAndAttendence_btn);

		return new SettingsTimeAttendanceSetupVerification(driver);

	}

	public SettingsTimeAttendanceSetupVerification TimeAndAttendancePageOpen() {

		Common.pause(1);

		Common.pause(2);
		clickSettingsIcon();
		/*
		 * driver.get(
		 * "http://automation.zinghr.com/2015/pages/Setup/SetupCircle.aspx");
		 */

		Common.pause(4);
		clickTimeAndAttendenseFromCircle();
		Common.pause(2);
		return new SettingsTimeAttendanceSetupVerification(driver);

	}

	@FindBy(xpath = "//button[contains(.,'Add New Attendance Group')]")
	WebElement addNewAttendanceGroup_btn;

	public SettingsTimeAttendanceSetupVerification clickAddNewAttendanceGroup() {

		Common.clickOn(driver, addNewAttendanceGroup_btn);
		return new SettingsTimeAttendanceSetupVerification(driver);

	}

	@FindBy(xpath = "//div[@id='box-config']//input")
	WebElement addNewGroup_textbox;

	public SettingsTimeAttendanceSetupVerification enterNewGroupName(
			String groupName) {

		Common.type(addNewGroup_textbox, groupName);

		return new SettingsTimeAttendanceSetupVerification(driver);
	}

	@FindBy(xpath = "//div[@id='box-config']//button[contains(.,'Add')]")
	WebElement addOnPopup_btn;

	public SettingsTimeAttendanceSetupIndexPage clickAddButtonOnPopup() {

		Common.clickOn(driver, addOnPopup_btn);

		return new SettingsTimeAttendanceSetupIndexPage(driver);
	}

	public SettingsTimeAttendanceSetupVerification addNewGroupFunctionality(
			String groupName) {

		Common.pause(2);
		enterNewGroupName(groupName);
		Common.pause(1);
		clickAddButtonOnPopup();

		Common.pause(2);

		return new SettingsTimeAttendanceSetupVerification(driver);

	}

	@FindBy(xpath = "//div[@id='box-config']//button[@class='close']")
	WebElement popupClose_btn;

	public SettingsTimeAttendanceSetupVerification clickCloseButtonOnPopup() {

		Common.clickOn(driver, popupClose_btn);

		return new SettingsTimeAttendanceSetupVerification(driver);
	}

	@FindBy(xpath = "//div[@class='tabbable tna_group']//li/a")
	List<WebElement> attendanceGroup_list;

	public int calculateAvailableAttendanceGroup() {

		return attendanceGroup_list.size();

	}

}
