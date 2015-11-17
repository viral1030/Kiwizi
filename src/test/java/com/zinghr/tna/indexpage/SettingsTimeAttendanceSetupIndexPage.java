package com.zinghr.tna.indexpage;

import java.util.List;

import org.openqa.selenium.By;
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

	@FindBy(xpath = "//a[contains(.,'OAS')]")
	WebElement oasMenu_button;

	public SettingsTimeAttendanceSetupVerification clickOASMenu() {
		Common.clickOn(driver, oasMenu_button);

		return new SettingsTimeAttendanceSetupVerification(driver);
	}

	@FindBy(xpath = "//span[contains(@class,'fc-button-next')]")
	WebElement nextMonthArrow_button;

	@FindBy(xpath = "//span[contains(@class,'fc-button-next')]")
	WebElement previousMonthArrow_button;

	public SettingsTimeAttendanceSetupVerification clickOnForwardArrow() {
		Common.pause(1);
		Common.clickOn(driver, nextMonthArrow_button);

		return new SettingsTimeAttendanceSetupVerification(driver);
	}

	public SettingsTimeAttendanceSetupVerification clickOnbackwordArrow() {
		Common.pause(1);
		Common.clickOn(driver, previousMonthArrow_button);

		return new SettingsTimeAttendanceSetupVerification(driver);
	}

	@FindBy(xpath = "//a[contains(.,'Holiday List')]")
	WebElement holidayList_button;

	public SettingsTimeAttendanceSetupVerification clickOnHolyDayListTab()

	{

		Common.pause(1);
		Common.clickOn(driver, holidayList_button);

		return new SettingsTimeAttendanceSetupVerification(driver);

	}

	@FindBy(xpath = "//a[contains(.,'Regularize')]")
	WebElement regularize_button;

	public SettingsTimeAttendanceSetupVerification clickRegularizeButton() {
		Common.pause(1);
		Common.clickOn(driver, regularize_button);
		Common.pause(2);

		Common.waitForElement(driver,
				By.xpath("//div[contains(@id,'RegularizationPopup')]"));

		return new SettingsTimeAttendanceSetupVerification(driver);
	}

	@FindBy(xpath = "//button[@id='BtnApplyReg'][contains(.,'Apply Now')]")
	WebElement applyNow_button;

	public SettingsTimeAttendanceSetupVerification clickApplyNowButton() {

		Common.clickOn(driver, applyNow_button);
		return new SettingsTimeAttendanceSetupVerification(driver);
	}

}
