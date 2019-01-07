package com.deftsoft.demo.pom.or;

import org.openqa.selenium.By;

public class BookingsOR {
	public static final By Booking_butn = By.cssSelector("ul.nav.profile-tabs li:nth-of-type(1) a");
	public static final By car_Detail = By.cssSelector("ul.nav.navbar-nav.navbar-left.go-right li:nth-of-type(4)");
	public static final By detail_btn = By.cssSelector("table.bgwhite.table.table-striped tr:nth-of-type(2) .mt15.btn.btn-action.btn-block");
    public static final By Pick_up = By.id("s2id_pickuplocation");
    public static final By Pick_up_text = By.cssSelector("li.select2-results-dept-0.select2-result.select2-result-selectable:nth-of-type(2)");
	public static final By Btn_Book = By.cssSelector(".btn.btn-block.btn-action.btn-lg");
	public static final By confirm_Btn_Book = By.cssSelector(".btn.btn-action.btn-lg.btn-block.completebook");
	public static final By confirm_pay = By.cssSelector(".btn.btn-default.arrivalpay");

	
}
