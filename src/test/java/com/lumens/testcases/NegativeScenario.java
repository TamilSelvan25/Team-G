package com.lumens.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.lumens.pageobjects.OrderPagePOM;

import HCL.Hackaton_Demo2.BaseClass;

public class NegativeScenario extends BaseClass {

	public String path = "C:\\Users\\admin\\Tamil_wrkspc\\Hackaton_Demo2\\ScreenShots";

	@BeforeTest
	//@Parameters("browser")
	public void bTest() throws Exception {
		/*
		 * if (browser.equalsIgnoreCase("ie")) {
		 * System.setProperty("webdriver.ie.driver",
		 * "C:\\Users\\admin\\Downloads\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe"
		 * ); } else if (browser.equalsIgnoreCase("chrome")) {
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\admin\\Downloads\\ChromeDriver\\chromedriver.exe"); driver = new
		 * ChromeDriver(); } else { throw new Exception("Browser is not correct"); }
		 */
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
		String name = prop.getProperty("name");
		String wuser = prop.getProperty("w-email");
		/*
		 * move(l.getAccDrpDwn()); l.getSigninBtn().click(); Thread.sleep(5000);
		 * l.getEmailTxtbox().click(); fill(l.getEmailTxtbox(), user);
		 * fill(l.getPassTxtbox(), pass); l.getRemembermeCheckbox().click();
		 * l.getLoginBtn().click(); Thread.sleep(15000);
		 */
		l.getLivechatBtn().click();
		Thread.sleep(5000);
		fill(l.getLivechatName(), name);
		fill(l.getLivechatEmail(), wuser);
		l.getLivechatSubmit().click();
		String text = l.getErrorMessage().getText();
		if (text.contains("Enter a valid email address")) {

			System.out.println("Please enter a valid email address to continue....");

		}
		screenShot(path + "\\Negative_TC.jpeg");

	}
}
