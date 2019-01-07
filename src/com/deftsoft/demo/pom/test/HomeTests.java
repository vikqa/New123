package com.deftsoft.demo.pom.test;


import com.deftsoft.demo.pom.pages.Home;
import com.deftsoft.demo.pom.pages.Login;
import com.deftsoft.demo.pom.pages.MyAccount;
import com.deftsoft.demo.pom.pages.Register;
import com.deftsoft.demo.selenium.web.BrowserDriver;
import com.deftsoft.demo.selenium.wrapper.TestCase;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HomeTests<_logout> extends TestCase 
{
	final static Logger logger = Logger.getLogger(HomeTests.class);
	private WebDriver driver;
	private Home _home;
	private Register _register;
	private MyAccount _account;
	private Login _login;
	//private Myprofile _Myprofile;
	
	
	@Parameters({ "browserVer", "baseURL" })
	@BeforeClass
	public void setup(String browserVer, String baseURL) {
		
//		int z = add(2,3);
//		System.out.println(z);
		driver = BrowserDriver.launchBrowser(browserVer);
		driver.navigate().to(baseURL);		
		_home = new Home(driver);
	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}
	
	@Test(groups = { "Login " },priority = 1,  description = "Default values should visible for each textbox.")
	public void To_verify_default_values_for_textboxes() {
String email = "php@gmail.com";
String password = "P@ssword123";
  String first_name="QAtest";
 String last_name="singh";
        String Phone="1234567890";
		_register = _home.navigateToRegister();
		_account = _register.register(email,password,first_name,last_name,Phone );
		_login=_account.logout();
		_account =_login.login(email,password);
		_account.navigateToMyProfile();
		_account.Myprofile(email, password, Phone, first_name, last_name);
		_account.navigatetoNewsletter();
		_account.Newsletter(); 
		_account.navigatetoWishlist();
		_account.navigatetoBookings();	
		_account.bookings();
     	_account.account();
		System.out.println("sd");
	}
	@Test(groups = { "Login check " },priority = 2,  description = "Default values should invisible for each textbox.")
	public void To_verify_invalid_values_for_textboxes() {
String email = ".com";
String password = "";
  String first_name="QAtest";
 String last_name="singh";
        String Phone="1234567890";
		_register = _home.navigateToRegister();
		_account = _register.register(email,password,first_name,last_name,Phone );
		_login=_account.logout();
		_account =_login.login(email,password);
		_account.navigateToMyProfile();
		_account.Myprofile(email, password, Phone, first_name, last_name);
		_account.navigatetoNewsletter();
		_account.Newsletter(); 
		_account.navigatetoWishlist();
		_account.navigatetoBookings();	
		_account.bookings();
     	_account.account();
		System.out.println("sd");
	}
	
//	private int add (int a , int b){
//		int z = a+b;
////		System.out.println(z);
//		return z;
//		
//	}
}
