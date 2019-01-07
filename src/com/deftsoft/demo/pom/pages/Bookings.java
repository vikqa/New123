package com.deftsoft.demo.pom.pages;
import org.apache.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import com.deftsoft.demo.pom.or.BookingsOR;
import com.deftsoft.demo.selenium.wrapper.Helper;
import com.deftsoft.demo.selenium.wrapper.Wrapper;


public class Bookings  {
	final static Logger logger = Logger.getLogger(Bookings.class);
	private WebDriver driver;

	public Bookings(WebDriver driver) {
		//super(driver);
		this.driver = driver;
		Helper.waitForBrowserToLoad(driver);
	}
	
	public MyAccount Booking()
	{
		clickSubmitButton();

		return new MyAccount(driver);

}
private void clickSubmitButton(){
		
		try {
			//Wrapper.clickElement(driver, BookingsOR.);
			logger.info("button clicked" );
		} catch (NoSuchElementException ex) {
			logger.info("not clicked button", ex);
			logger.info("Error in clickbutton  method", ex);
			throw new IllegalArgumentException("button clicked element does not exists");
		}
	}
	
}
