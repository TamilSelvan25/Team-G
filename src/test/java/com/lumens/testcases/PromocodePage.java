package com.lumens.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.lumens.pageobjects.OrderPagePOM;

import HCL.Hackaton_Demo2.BaseClass;

public class PromocodePage extends BaseClass {

	public String path = "C:\\Users\\admin\\Tamil_wrkspc\\Hackaton_Demo2\\ScreenShots";
	public OrderPagePOM l;
	/*
	 * public String user = prop.getProperty("username"); public String pass =
	 * prop.getProperty("password"); public String promo =
	 * prop.getProperty("promocode"); public String zip =
	 * prop.getProperty("zipcode");
	 */

	@BeforeTest
	public void bTest() throws Exception {
		launchBrowser();
		driver.get(prop.getProperty("url"));
		max();
		driver.findElement(By.id("ltkpopup-close-button")).click();

	}

	@Test(priority = 1)
	public void login() throws Exception {
		String user = prop.getProperty("username");
		String pass = prop.getProperty("password");
		l = new OrderPagePOM();
		move(l.getAccDrpDwn());
		l.getSigninBtn().click();
		Thread.sleep(5000);
		l.getEmailTxtbox().click();
		fill(l.getEmailTxtbox(), user);
		fill(l.getPassTxtbox(), pass);
		l.getRemembermeCheckbox().click();
		l.getLoginBtn().click();
		Thread.sleep(15000);

	}

	@Test(priority = 2,groups = {"Regression"})
	public void promo() throws Exception {
		// Promocode Validation
		String promo = prop.getProperty("promocode");
		l.getCartBtn().click();
		fill(l.getEnterPromocode(), promo);
		l.getApplyPromocode().click();
		System.out.println("Promocode Entered successfully..");
		screenShot(path + "\\Promocode.jpeg");
	}

	@Test(priority = 3,groups = {"smoke"})
	public void zip() {
		// Zipcode Validation
		String zip = prop.getProperty("zipcode");
		fill(l.getEnterZipcode(), zip);
		l.getApplyZipcode().click();
		String text = l.getZipcodeMesage().getText();
		System.out.println(text);
		try {
			screenShot(path + "\\Zipcode.jpeg");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(enabled = false)
	public void signout() {
		move(l.getAccDrpDwn());
		l.getSignout().click();
		System.out.println("User signed out successfully..");

	}

}
