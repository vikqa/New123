package com.deftsoft.demo.pom.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;


import com.deftsoft.demo.pom.or.TopNavigationOR;
import com.deftsoft.demo.selenium.wrapper.Helper;
import com.deftsoft.demo.selenium.wrapper.Wrapper;

public class TopNavigation {
	final static Logger logger = Logger.getLogger(TopNavigation.class);
	private WebDriver driver;

	public TopNavigation(WebDriver driver) {
		this.driver = driver;
	}
	
	public Register navigateToRegister(){
		clickMyAccount();
		Helper.holdon(2);
		clickSubMenuSignUp();
		return new Register(driver);
		
	}
	
	private void clickMyAccount() {
		try {
			Wrapper.clickElement(driver, TopNavigationOR.LBL_MY_ACCOUNT);
			logger.info("MyAccount button clicked" );
		} catch (NoSuchElementException ex) {
			logger.info("MyAccount button does not exist", ex);
			logger.info("Error in clickMyAccount method", ex);
			throw new IllegalArgumentException("MyAccount element does not exists");
		} 
	}
	
	private void clickSubMenuSignUp() {
		try {
			Wrapper.clickElement(driver, TopNavigationOR.SUB_LBLSIGN_UP_MY_ACCOUNT);
			logger.info("Login button clicked" );
		} catch (NoSuchElementException ex) {
			logger.info("login button does not exist", ex);
			logger.info("Error in clickLoginButton method", ex);
			throw new IllegalArgumentException("login element does not exists");
		} 
	}


}

