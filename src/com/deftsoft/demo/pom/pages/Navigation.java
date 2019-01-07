package com.deftsoft.demo.pom.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import com.deftsoft.demo.pom.or.BookingsOR;
import com.deftsoft.demo.pom.or.MyprofileOR;
import com.deftsoft.demo.pom.or.NewsletterOR;
import com.deftsoft.demo.pom.or.WishlistOR;
import com.deftsoft.demo.selenium.wrapper.Helper;
import com.deftsoft.demo.selenium.wrapper.Wrapper;

public class Navigation  extends TopNavigationprofile{
private WebDriver driver;
	public Navigation(WebDriver driver) {
		super(driver);
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}
	
	public void navigateToMyProfile(){
		clickprofileButton();
	}
	
		
private void clickprofileButton(){
		
		try {
			Wrapper.clickElement(driver,MyprofileOR.Btn_Edit_Profile);
			logger.info("button clicked" );
		} catch (NoSuchElementException ex) {
			logger.info("not clicked button", ex);
			logger.info("Error in clickbutton  method", ex);
			throw new IllegalArgumentException("button clicked element does not exists");
		}
	}
public void navigatetoNewsletter()

{
	Helper.waitForBrowserToLoad(driver);
	clicknewsletter();

}

private void clicknewsletter() {

	try {
		Wrapper.clickElement(driver, NewsletterOR.BUTN_NEWSLETTER);
		logger.info("Submit button clicked");
	} catch (NoSuchElementException ex) {
		logger.info("Submit sbutton does not exist", ex);
		logger.info("Error in clickSubmitButton method", ex);
		throw new IllegalArgumentException("SubmitButton element does not exists");
	}
}
public void navigatetoWishlist()
{
	Helper.waitForBrowserToLoad(driver);
	clickwishlist();

}

private void clickwishlist() {

	try {
		Wrapper.clickElement(driver, WishlistOR.BUTN_Wishlist);
		logger.info("wishlist button clicked");
	} catch (NoSuchElementException ex) {
		logger.info("wishlist does not exist", ex);
		logger.info("Error in wishlist method", ex);
		throw new IllegalArgumentException("wishlist element does not exists");
	}
}

public void navigatetoBookings()
{
	Helper.waitForBrowserToLoad(driver);
	clickBooking();
	
}

private void clickBooking() {

	try {
		Wrapper.clickElement(driver, BookingsOR.Booking_butn);
		logger.info("Bookings button clicked");
	} catch (NoSuchElementException ex) {
		logger.info("Bookings does not exist", ex);
		logger.info("Error in Bookings method", ex);
		throw new IllegalArgumentException("Bookings element does not exists");
	}
}

}

