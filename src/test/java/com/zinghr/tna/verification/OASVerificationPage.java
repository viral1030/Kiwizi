package com.zinghr.tna.verification;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.zinghr.init.AbstractPage;

public class OASVerificationPage extends AbstractPage {

	public OASVerificationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = ".//span[contains(text(),'Attendance Marking')]")
	WebElement Attendance_marking_lbl;
	
	@FindBy(xpath = ".//span[contains(text(),'Current Open Cycle')]")
	WebElement Current_open_cycle_lbl;
	
	@FindBy(xpath = ".//a[contains(text(),'Previous Month')]")
	WebElement previous_month_btn;
	
	@FindBy(xpath = ".//a[contains(text(),'Next Month')]")
	WebElement next_month_btn;
	
	@FindBy(xpath = ".//span[contains(text(),'New Joinee Or Resign')]")
	WebElement New_joinee_lbl;
	
	@FindBy(xpath = ".//span[contains(text(),'Leave Applied')]")
	WebElement leave_applied_lbl;
	
	@FindBy(xpath = ".//a[contains(text(),'Raw Data')]")
	WebElement Raw_data_btn;
	
	@FindBy(xpath = ".//a[contains(text(),'Processed Data')]")
	WebElement Processed_data_btn;
	
	@FindBy(xpath = ".//div[@class='DivPadding weekcolumn1']")
	WebElement Week_coloumn;
	
	public boolean oaslandingpageverification() {
		if (Attendance_marking_lbl.isDisplayed() && Current_open_cycle_lbl.isDisplayed() ) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean attendance_marking_verification() {
		if (Attendance_marking_lbl.isDisplayed() ) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean Current_open_cycle_verification() {
		if (Current_open_cycle_lbl.isDisplayed() ) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean previous_next_month_verification() {
		if (previous_month_btn.isDisplayed() && next_month_btn.isDisplayed() ) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean Status_Indicator_verification() {
		if (New_joinee_lbl.isDisplayed() && leave_applied_lbl.isDisplayed() ) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean Raw_Data_Processed_Data_verification() {
		if (Raw_data_btn.isDisplayed() && Current_open_cycle_lbl.isDisplayed() ) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean Week_column_verification() {
		if (Attendance_marking_lbl.isDisplayed() && Processed_data_btn.isDisplayed() ) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean select_all_verification() {
		if (Week_coloumn.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}
	
	

}
