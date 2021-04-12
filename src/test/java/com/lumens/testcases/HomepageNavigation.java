package com.lumens.testcases;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.lumens.pageobjects.OrderPagePOM;

import HCL.Hackaton_Demo2.BaseClass;

public class HomepageNavigation extends BaseClass {

	@BeforeTest
	public void bTest() throws Exception {
		launchBrowser();
		driver.get(prop.getProperty("url"));
		max();
		driver.findElement(By.id("ltkpopup-close-button")).click();

	}

	@Test
	public void login() throws Throwable {
		OrderPagePOM l = new OrderPagePOM();
		//String user = prop.getProperty("username");
		//String pass = prop.getProperty("password");
		move(l.getAccDrpDwn());
		l.getSigninBtn().click();
		Thread.sleep(5000);
		l.getEmailTxtbox().click();
		fill(l.getEmailTxtbox(), getData(1, 0));
		fill(l.getPassTxtbox(), getData(1, 1));
		l.getRemembermeCheckbox().click();
		l.getLoginBtn().click();
		Thread.sleep(15000);
		move(l.getLightingMover());
		l.getcLights().click();
		driver.navigate().back();
		Reporter.log("Navigated to homepage...");
		
	}
}
