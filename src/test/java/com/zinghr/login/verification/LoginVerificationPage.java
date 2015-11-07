package com.zinghr.login.verification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.zinghr.init.AbstractPage;
import com.zinghr.init.Common;

public class LoginVerificationPage extends AbstractPage {

	public LoginVerificationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	
	public boolean verifyUserRedirectedOnCorseDetailsPage() {
		Common.pause(3);
		return driver.findElement(
				By.xpath("//h3[contains(.,'Course Details')]")).isDisplayed();
	}

	public boolean verifyMySelfButton() {
		Common.pause(3);
		return driver.findElement(By.xpath(".//input[@value='Yourself']"))
				.isDisplayed();
	}

	public boolean verifyUserRedirectedOnReceiptDetailsPage() {

		return driver.findElement(
				By.xpath("//h2[contains(.,'Your Order Receipt')]"))
				.isDisplayed();
	}

	public boolean verifyUserRedirectedOnShoppingCartPage() {
		Common.pause(3);
		return driver.findElement(
				By.xpath("//h3[contains(.,'Your Shopping Cart')]"))
				.isDisplayed();
	}

	public boolean verifyUserRedirectedOnReviewOrderPage() {
		Common.pause(3);
		return driver.findElement(By.xpath("//li[contains(.,'Review Order')]"))
				.isDisplayed();
	}

	public boolean verifyUserRedirectedOnOrderReceiptPage() {
		Common.pause(3);
		return driver.findElement(
				By.xpath("//h2[contains(.,'Your Order Receipt')]"))
				.isDisplayed();
	}

	public boolean verifyUserRedirectedOnNFSCSecureCheckOut() {

		return driver.findElement(
				By.xpath("//h1[contains(.,'NFHS Secure Checkout')]"))
				.isDisplayed();

	}

	public boolean verifyUserRedirectedOnPaymentInformationPage() {

		return driver.findElement(
				By.xpath("//li[contains(.,'Payment Information')]"))
				.isDisplayed();

	}

	public boolean verifyFreeOrPaidCourse() {

		boolean bool = false;

		Common.pause(5);
		try {

			if (driver.findElement(By.xpath("//div[@class='selListWrap']"))
					.isDisplayed()) {
				System.out.println(driver.findElement(
						By.xpath("//div[@class='selListWrap']")).isDisplayed());
				bool = true;
			}
		} catch (Exception e) {
			// e.printStackTrace();
			bool = false;

		}

		return bool;

	}

	public boolean verifyValidationMessageOnPurchaseOrderPage() {

		return driver
				.findElement(
						By.xpath("//label[@class='error'][@for='payment_source_7_po_number']"))
				.isDisplayed()
				&& driver
						.findElement(
								By.xpath("//label[@class='error'][@for='payment_source_7_organization_name']"))
						.isDisplayed();

	}

	public boolean verifyValidationMessageOnBillingInformationPage() {

		return driver
				.findElement(
						By.xpath("//label[@class='error'][@for='order_bill_address_attributes_firstname']"))
				.isDisplayed()
				&& driver
						.findElement(
								By.xpath("//label[@class='error'][@for='order_bill_address_attributes_lastname']"))
						.isDisplayed()

				&& driver
						.findElement(
								By.xpath("//label[@class='error'][@for='order_bill_address_attributes_phone']"))
						.isDisplayed()
				&& driver
						.findElement(
								By.xpath("//label[@class='error'][@for='order_bill_address_attributes_bill_address_email']"))
						.isDisplayed()
				&& driver
						.findElement(
								By.xpath("//label[@class='error'][@for='order_bill_address_attributes_address1']"))
						.isDisplayed()
				&& driver
						.findElement(
								By.xpath("//label[@class='error'][@for='order_bill_address_attributes_city']"))
						.isDisplayed()
				&& driver
						.findElement(
								By.xpath("//label[@class='error'][@for='order_bill_address_attributes_state_id']"))
						.isDisplayed()
				&& driver
						.findElement(
								By.xpath("//label[@class='error'][@for='order_bill_address_attributes_zipcode']"))
						.isDisplayed();
	}

	public boolean verifyValidationMessageForAcceptTerm() {

		return driver.findElement(
				By.xpath("//label[@class='error'][@for='acceptTerm']"))
				.isDisplayed();

	}

	public boolean verifyValidationMessageForCreditCardInformation() {

		return driver.findElement(
				By.xpath("//label[@class='error'][@for='order_card_name']"))
				.isDisplayed()
				&&

				driver.findElement(
						By.xpath("//label[@class='error'][@for='card_number']"))
						.isDisplayed()
				&&

				driver.findElement(
						By.xpath("//label[@class='error'][@for='card_code']"))
						.isDisplayed();
	}

}