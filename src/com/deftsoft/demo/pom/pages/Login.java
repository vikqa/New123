package com.deftsoft.demo.pom.pages;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import com.deftsoft.demo.pom.or.LoginOR;
import com.deftsoft.demo.selenium.wrapper.Helper;
import com.deftsoft.demo.selenium.wrapper.Wrapper;

public class Login extends TopNavigation {
	private WebDriver driver;
	public Login(WebDriver driver) {
		super(driver);
		this.driver = driver;
		Helper.waitForBrowserToLoad(driver);
	}
	public MyAccount login (String email, String pwd) {	
		enteremail(email);
		enterPassword(pwd);
		clickSubmitButton();
		return new MyAccount(driver);
		
	}
private void enteremail(String anyValue){
		
		try {
			Wrapper.enterValueInInputBox(driver, LoginOR.TXT_Email, anyValue);
			logger.info("Entered email" );
			
		} catch (NoSuchElementException ex) {
			logger.info("not entered email", ex);
			logger.info("Error in TXT_USER_NAME  method", ex);
			throw new IllegalArgumentException("enteremail element does not exists");
		}
	}
	
private void enterPassword(String anyValue){
		
		try {
			Wrapper.enterValueInInputBox(driver, LoginOR.TXT_PASSWORD, anyValue);
			logger.info("entered enterLastName" );
		} catch (NoSuchElementException ex) {
			logger.info("LastName textbox does not exist", ex);
			logger.info("Error in enterLastName method", ex);
			throw new IllegalArgumentException("enterLastName textbox does not exists");
		}
}
private void clickSubmitButton(){
	
	try {
		Wrapper.clickElement(driver, LoginOR.BTN_SUBMIT);
		logger.info("Submit button clicked" );
	} catch (NoSuchElementException ex) {
		logger.info("Submit sbutton does not exist", ex);
		logger.info("Error in clickSubmitButton method", ex);
		throw new IllegalArgumentException("SubmitButton element does not exists");
	}
}

}
