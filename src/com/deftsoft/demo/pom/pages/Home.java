package com.deftsoft.demo.pom.pages;

//import com.deftsoft.demo.pom.or.HomeOR;
import com.deftsoft.demo.selenium.wrapper.Helper;
import com.deftsoft.demo.selenium.wrapper.Wrapper;
import org.apache.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class Home extends TopNavigation{
	
private WebDriver driver;
	
	final static Logger logger = Logger.getLogger(Home.class);

	public Home(WebDriver driver) {
		super(driver);
		this.driver = driver;		
		Helper.waitForBrowserToLoad(driver);
		

	}
	
	
	/*public void clickLoginButton() {
		try {
			Wrapper.clickElement(driver, HomeOR.LBL_MY_ACCOUNT);
			logger.info("Login button clicked" );
		} catch (NoSuchElementException ex) {
			logger.info("login button does not exist", ex);
			logger.info("Error in clickLoginButton method", ex);
			throw new IllegalArgumentException("login element does not exists");
		} 
	}*/

}
