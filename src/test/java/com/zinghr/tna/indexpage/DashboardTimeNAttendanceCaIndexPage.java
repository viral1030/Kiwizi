package com.zinghr.tna.indexpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.zinghr.init.AbstractPage;
import com.zinghr.init.Common;
import com.zinghr.tna.verification.SettingsTimeAttendanceSetupVerification;

public class DashboardTimeNAttendanceCaIndexPage extends AbstractPage {

	public DashboardTimeNAttendanceCaIndexPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//span[contains(@class,'fc-button-next')]")
	WebElement nextMonthArrow_button;

	@FindBy(xpath = "//span[contains(@class,'fc-button-prev')]")
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
		Common.pause(3);
		Common.clickOn(driver, applyNow_button);
		return new SettingsTimeAttendanceSetupVerification(driver);
	}

}
