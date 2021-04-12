package com.lumens.testcases;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.lumens.pageobjects.OrderPagePOM;

import HCL.Hackaton_Demo2.BaseClass;

public class CartPage extends BaseClass {

	public String path = "C:\\Users\\admin\\Tamil_wrkspc\\Hackaton_Demo2\\ScreenShots";

	@BeforeTest
	public void bTest() throws Exception {
		launchBrowser();
		driver.get(prop.getProperty("url"));
		max();
		driver.findElement(By.id("ltkpopup-close-button")).click();

	}

	@Test
	public void login() throws Exception {
		OrderPagePOM l = new OrderPagePOM();
		String user = prop.getProperty("username");
		String pass = prop.getProperty("password");
		move(l.getAccDrpDwn());
		l.getSigninBtn().click();
		Thread.sleep(5000);
		l.getEmailTxtbox().click();
		fill(l.getEmailTxtbox(), user);
		fill(l.getPassTxtbox(), pass);
		l.getRemembermeCheckbox().click();
		l.getLoginBtn().click();
		Thread.sleep(15000);
		l.getCartBtn().click();
		l.getRemoveProduct().click();
		Reporter.log("Product Removed Successfully from the cart.");
		System.out.println("Product Removed Successfully from the cart.");
		screenShot(path + "\\cart.jpeg");

	}

}
