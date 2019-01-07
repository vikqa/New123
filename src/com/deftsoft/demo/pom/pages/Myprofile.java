package com.deftsoft.demo.pom.pages;

import org.apache.log4j.Logger;
//import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

//import com.deftsoft.demo.pom.or.BookingsOR;
//import com.deftsoft.demo.pom.or.MyprofileOR;
//import com.deftsoft.demo.pom.or.RegisterOR;
//import org.openqa.selenium.NoSuchElementException;
//import com.deftsoft.demo.pom.or.TopNavigationprofileOR;
import com.deftsoft.demo.selenium.wrapper.Helper;
//import com.deftsoft.demo.selenium.wrapper.Wrapper;

//import com.deftsoProfileft.demo.selenium.wrapper.Wrapper;
public class Myprofile {
	final static Logger logger = Logger.getLogger(TopNavigation.class);

	private WebDriver driver;

	public Myprofile(WebDriver driver) {
		// super(driver);
		this.driver = driver;
		Helper.waitForBrowserToLoad(driver);
	}
}