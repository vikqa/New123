package com.deftsoft.demo.pom.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import com.deftsoft.demo.pom.or.BookingsOR;
import com.deftsoft.demo.pom.or.MyprofileOR;
import com.deftsoft.demo.pom.or.NewsletterOR;
import com.deftsoft.demo.selenium.wrapper.ActionBuilder;
//import org.openqa.selenium.NoSuchElementException;
//import com.deftsoft.demo.pom.or.TopNavigationprofileOR;
import com.deftsoft.demo.selenium.wrapper.Helper;
//import com.deftsoft.demo.selenium.wrapper.Wrapper;
import com.deftsoft.demo.selenium.wrapper.Wrapper;

public class MyAccount extends Navigation {
	private WebDriver driver;

	public MyAccount(WebDriver driver) {
		super(driver);
		this.driver = driver;
		Helper.waitForBrowserToLoad(driver);
	}

	public void Myprofile(String email, String pwd, String Phone, String first_name, String last_name) {

		Helper.waitForBrowserToLoad(driver);

		// return new MyAccount(driver);

		enterPhone(Phone);
		enterEmail(email);
		enterPassword(pwd);
		enterConfirmPassword(pwd);
		enteraddress1("hm44 mohali");
		enteraddress2("chandigarh");
		entercity("chandigarh");
		enterstate("punjab");
		enterzipcode("177212");
		selectCountry("India");
		clickSubmitButton();

	}

	private void enterPhone(String anyValue) {

		try {
			Wrapper.enterValueInInputBox(driver, MyprofileOR.Text_Edit_Phone, anyValue);
			logger.info("Edit Phone");
		} catch (NoSuchElementException ex) {
			logger.info("not edit phone textbox", ex);
			logger.info("Error in enterphone  method", ex);
			throw new IllegalArgumentException("phone textbox element does not exists");
		}
	}

	private void enterEmail(String anyValue) {

		try {
			Wrapper.enterValueInInputBox(driver, MyprofileOR.Text_Edit_Email, anyValue);
			logger.info("Edit Email");
		} catch (NoSuchElementException ex) {
			logger.info("not edited Email", ex);
			logger.info("Error in enterEmail method", ex);
			throw new IllegalArgumentException("email element does not exists");
		}
	}

	private void enterPassword(String anyValue) {

		try {
			Wrapper.enterValueInInputBox(driver, MyprofileOR.Text_Edit_Password, anyValue);
			logger.info("edit password");
		} catch (NoSuchElementException ex) {
			logger.info("not edit password", ex);
			logger.info("Error in edit password", ex);
			throw new IllegalArgumentException("edit password element does not exists");
		}
	}

	private void enterConfirmPassword(String anyValue) {

		try {
			Wrapper.enterValueInInputBox(driver, MyprofileOR.Text_Edit_cPassowrd, anyValue);
			logger.info("Entered first name");
		} catch (NoSuchElementException ex) {
			logger.info("not entered first name", ex);
			logger.info("Error in enterFirstName  method", ex);
			throw new IllegalArgumentException("Firstnametextbox element does not exists");
		}
	}

	private void clickSubmitButton() {

		try {
			Wrapper.clickElement(driver, MyprofileOR.profile_submit);
			logger.info("Submit button clicked");
		} catch (NoSuchElementException ex) {
			logger.info("Submit sbutton does not exist", ex);
			logger.info("Error in clickSubmitButton method", ex);
			throw new IllegalArgumentException("SubmitButton element does not exists");
		}
	}

	private void enteraddress2(String anyValue) {

		try {
			Wrapper.clickElement(driver, MyprofileOR.Text_Edit_address2);
			logger.info("Submit button clicked");
		} catch (NoSuchElementException ex) {
			logger.info("Submit sbutton does not exist", ex);
			logger.info("Error in clickSubmitButton method", ex);
			throw new IllegalArgumentException("SubmitButton element does not exists");
		}
	}

	private void selectCountry(String anyValue) {

		try {
			Wrapper.selectDropdownByVisibleText(driver, MyprofileOR.Text_Edit_country, anyValue);
			logger.info("Submit button clicked");
		} catch (NoSuchElementException ex) {
			logger.info("Submit sbutton does not exist", ex);
			logger.info("Error in clickSubmitButton method", ex);
			throw new IllegalArgumentException("SubmitButton element does not exists");
		}
	}

	private void enterzipcode(String anyValue) {

		try {
			Wrapper.enterValueInInputBox(driver, MyprofileOR.Text_Edit_zipcode, anyValue);
			logger.info("Submit button clicked");
		} catch (NoSuchElementException ex) {
			logger.info("Submit sbutton does not exist", ex);
			logger.info("Error in clickSubmitButton method", ex);
			throw new IllegalArgumentException("SubmitButton element does not exists");
		}
	}

	private void enterstate(String anyValue) {

		try {
			Wrapper.enterValueInInputBox(driver, MyprofileOR.Text_Edit_state, anyValue);
			logger.info("Submit button clicked");
		} catch (NoSuchElementException ex) {
			logger.info("Submit sbutton does not exist", ex);
			logger.info("Error in clickSubmitButton method", ex);
			throw new IllegalArgumentException("SubmitButton element does not exists");
		}
	}

	private void entercity(String anyValue) {

		try {
			Wrapper.enterValueInInputBox(driver, MyprofileOR.Text_Edit_city, anyValue);
			logger.info("Submit button clicked");
		} catch (NoSuchElementException ex) {
			logger.info("Submit sbutton does not exist", ex);
			logger.info("Error in clickSubmitButton method", ex);
			throw new IllegalArgumentException("SubmitButton element does not exists");
		}
	}

	private void enteraddress1(String anyValue) {

		try {
			Wrapper.clickElement(driver, MyprofileOR.Text_Edit_address1);
			logger.info("edit profile button clicked");
		} catch (NoSuchElementException ex) {
			logger.info("edit profile sbutton does not exist", ex);
			logger.info("Error in edit profile Button method", ex);
			throw new IllegalArgumentException("edit profile button element does not exists");
		}

	}

	public void Newsletter() {
		Helper.waitForBrowserToLoad(driver);
		clickNewslettertoggle();
	}

	private void clickNewslettertoggle() {

		try {
			Wrapper.clickElement(driver, NewsletterOR.BUTN_NEWSLETTER_toggle);
			logger.info("toggle clicked");
		} catch (NoSuchElementException ex) {
			logger.info("not toggle button", ex);
			logger.info("Error in toggle  method", ex);
			throw new IllegalArgumentException("button toggle element does not exists");
		}

	}

	public void bookings() {
		Helper.waitForBrowserToLoad(driver);
		book_car();
		car_details();
		enter_pick_up();
		clickOption();
		book();
		confirm_Btn_Book();
		pay_on_arrival();
	}

	private void book_car() {

		try {
			Wrapper.clickElement(driver, BookingsOR.car_Detail);
			logger.info("book_car clicked");
		} catch (NoSuchElementException ex) {
			logger.info("not book_car button", ex);
			logger.info("Error in book_car  method", ex);
			throw new IllegalArgumentException("button book_car element does not exists");
		}

	}

	private void car_details() {

		try {
			Wrapper.clickElement(driver, BookingsOR.detail_btn);
			logger.info("car_details clicked");
		} catch (NoSuchElementException ex) {
			logger.info("not car_details button", ex);
			logger.info("Error in car_details  method", ex);
			throw new IllegalArgumentException("button book_car element does not exists");
		}

	}

	private void enter_pick_up() {

		try {
			Wrapper.clickElement(driver, BookingsOR.Pick_up);
			logger.info("enter_pick_up clicked");
		} catch (NoSuchElementException ex) {
			logger.info("not enter_pick_up button", ex);
			logger.info("Error in enter_pick_up  method", ex);
			throw new IllegalArgumentException("button enter_pick_up element does not exists");
		}

	}

	private void book() {

		try {
			Wrapper.clickElement(driver, BookingsOR.Btn_Book);
			logger.info("book clicked");
		} catch (NoSuchElementException ex) {
			logger.info("not book button", ex);
			logger.info("Error in book  method", ex);
			throw new IllegalArgumentException("button book element does not exists");
		}

	}

	private void confirm_Btn_Book() {

		try {
			Wrapper.clickElement(driver, BookingsOR.confirm_Btn_Book);
			logger.info("confirm_Btn_Book clicked");
		} catch (NoSuchElementException ex) {
			logger.info("not confirm_Btn_Book button", ex);
			logger.info("Error in confirm_Btn_Book  method", ex);
			throw new IllegalArgumentException("button confirm_Btn_Book element does not exists");
		}

	}

	private void pay_on_arrival() {

		try {
			Wrapper.clickElement(driver, BookingsOR.confirm_pay);
			logger.info("confirm_pay clicked");
			//Helper.switchToAlertAndAccept(driver);
			Helper.pageSource(driver);

		} catch (NoSuchElementException ex) {
			logger.info("not confirm_pay button", ex);
			logger.info("Error in confirm_pay  method", ex);
			throw new IllegalArgumentException("button confirm_pays element does not exists");
		}

	}

	/*
	 * private void enter_pickup_text(String value) {
	 * 
	 * try { Wrapper.enterValueInInputBox(driver, BookingsOR.Pick_up_text,
	 * value); logger.info("enter_pickup_text clicked"); } catch
	 * (NoSuchElementException ex) { logger.info("not enter_pickup_text button",
	 * ex); logger.info("Error in enter_pickup_text  method", ex); throw new
	 * IllegalArgumentException(
	 * "button enter_pickup_text element does not exists"); }
	 * 
	 * }
	 */

	private void clickOption() {

		try {
			Wrapper.clickElement(driver, BookingsOR.Pick_up_text);
			logger.info("enter_pickup_text clicked");

		} catch (NoSuchElementException ex) {
			logger.info("not enter_pickup_text button", ex);
			logger.info("Error in enter_pickup_text  method", ex);
			throw new IllegalArgumentException("button enter_pickup_text element does not exists");
		}

	}

}
