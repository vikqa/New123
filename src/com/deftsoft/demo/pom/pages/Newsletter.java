package com.deftsoft.demo.pom.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
//import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import com.deftsoft.demo.pom.or.NewsletterOR;
import com.deftsoft.demo.selenium.wrapper.Helper;
import com.deftsoft.demo.selenium.wrapper.Wrapper;

public class Newsletter extends Navigation{
	final static Logger logger = Logger.getLogger(Newsletter.class);
	private WebDriver driver;

	public Newsletter(WebDriver driver) {
		 super(driver);
		this.driver = driver;
		Helper.waitForBrowserToLoad(driver);
	}
}