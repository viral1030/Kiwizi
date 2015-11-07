package com.zinghr.tna.indexpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.zinghr.init.AbstractPage;
import com.zinghr.tna.verification.SettingsTimeAttendanceSetupVerification;

public class SettingsTimeAttendanceSetupIndexPage extends AbstractPage {

	public SettingsTimeAttendanceSetupIndexPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	
	@FindBy(xpath="//div[@id='btnDemoData']//a[@class='btn btn-primary']")
	WebElement ProceedCurrentPlanAndDemoData_btn;
	
	@FindBy(xpath="//li[@id='HeaderSetting']/a")
	WebElement settingIcon_btn;
	
	@FindBy(xpath="//div[@id='dvTNA']/p[1]")
	WebElement timeAndAttendence_btn;
	
	
	public SettingsTimeAttendanceSetupVerification clickProceedButtonofCurrentPlanAndDemoData() {

		return new SettingsTimeAttendanceSetupVerification(driver);
	}

}
