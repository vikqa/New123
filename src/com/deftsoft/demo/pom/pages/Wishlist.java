package com.deftsoft.demo.pom.pages;
import org.apache.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
//import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import com.deftsoft.demo.pom.or.WishlistOR;
import com.deftsoft.demo.selenium.wrapper.Helper;
import com.deftsoft.demo.selenium.wrapper.Wrapper;

public class Wishlist {
	final static Logger logger = Logger.getLogger(Wishlist.class);
	private WebDriver driver;

	public Wishlist(WebDriver driver) {
		// super(driver);
		this.driver = driver;
		Helper.waitForBrowserToLoad(driver);
	}

public Wishlist(){
	clickbuttonwhishlist();
	Helper.holdon(2);
	return;
	
}
private void clickbuttonwhishlist() {
	try {
		Wrapper.clickElement(driver, WishlistOR.BUTN_Wishlist);
		logger.info("clickbuttonwhishlist button clicked" );
	} catch (NoSuchElementException ex) {
		logger.info("clickbuttonwhishlist button does not exist", ex);
		logger.info("Error in clickbuttonwhishlist method", ex);
		throw new IllegalArgumentException("clickbuttonwhishlist element does not exists");
	} 
}

}