package com.deftsoft.demo.pom.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import com.deftsoft.demo.pom.or.RegisterOR;
import com.deftsoft.demo.selenium.wrapper.Helper;
import com.deftsoft.demo.selenium.wrapper.Wrapper;

public class Register extends TopNavigation {
	private WebDriver driver;

	public Register(WebDriver driver) {
		super(driver);
		this.driver = driver;
		Helper.waitForBrowserToLoad(driver);
	}
	
	public MyAccount register(String email, String pwd,String first_name,String last_name, String Phone){
		enterFirstName(first_name);
		enterLastName(last_name);
		enterPhone(Phone);
		enterEmaile(email);
		enterPassword(pwd);
		enterConfirmPassword(pwd);
		clickSubmitButton();
		return new MyAccount(driver);
		
	}
	
	private void enterFirstName(String anyValue){
		
		try {
			Wrapper.enterValueInInputBox(driver, RegisterOR.TXT_FIRST_NAME, anyValue);
			logger.info("Entered first name" );
		} catch (NoSuchElementException ex) {
			logger.info("not entered first name", ex);
			logger.info("Error in enterFirstName  method", ex);
			throw new IllegalArgumentException("Firstnametextbox element does not exists");
		}
	}
	
private void enterLastName(String anyValue){
		
		try {
			Wrapper.enterValueInInputBox(driver, RegisterOR.TXT_LAST_NAME, anyValue);
			logger.info("entered enterLastName" );
		} catch (NoSuchElementException ex) {
			logger.info("LastName textbox does not exist", ex);
			logger.info("Error in enterLastName method", ex);
			throw new IllegalArgumentException("enterLastName textbox does not exists");
		}
	}
private void enterPhone(String anyValue){
	
	try {
		Wrapper.enterValueInInputBox(driver, RegisterOR.TXT_PHONE, anyValue);
		logger.info("entered Phone" );
	} catch (NoSuchElementException ex) {
		logger.info("enterPhone textbox does not exist", ex);
		logger.info("Error in enterPhone method", ex);
		throw new IllegalArgumentException("enterPhone textbox does not exists");
	}
}
private void enterEmaile(String anyValue){
	
	try {
		Wrapper.enterValueInInputBox(driver, RegisterOR.TXT_EMAIL, anyValue);
		logger.info("enterEmaile textbox entered" );
	} catch (NoSuchElementException ex) {
		logger.info("Emaile textbox does not exist", ex);
		logger.info("Error in enterEmaile method", ex);
		throw new IllegalArgumentException("enterEmaile element does not exists");
	}
}
private void enterPassword(String anyValue){
	
	try {
		Wrapper.enterValueInInputBox(driver, RegisterOR.TXT_PASSWORD, anyValue);
		logger.info("password entered" );
	} catch (NoSuchElementException ex) {
		logger.info("password field does not exist", ex);
		logger.info("Error in clickMyAccount method", ex);
		throw new IllegalArgumentException("Password textbox does not exists");
	}
}
private void enterConfirmPassword(String anyValue){
	
	try {
		Wrapper.enterValueInInputBox(driver, RegisterOR.TXT_C_PASSWORD, anyValue);
		logger.info("confirmpassword entered" );
	} catch (NoSuchElementException ex) {
		logger.info("cpassowrd textbox does not exist", ex);
		logger.info("Error in enterConfirmPassword method", ex);
		throw new IllegalArgumentException("cpassword field does not exists");
	}
}

private void clickSubmitButton(){
	
	try {
		Wrapper.clickElement(driver, RegisterOR.BTN_SUBMIT);
		logger.info("Submit button clicked" );
	} catch (NoSuchElementException ex) {
		logger.info("Submit sbutton does not exist", ex);
		logger.info("Error in clickSubmitButton method", ex);
		throw new IllegalArgumentException("SubmitButton element does not exists");
	}
}



}
