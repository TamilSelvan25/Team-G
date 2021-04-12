package com.lumens.testcases;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.lumens.pageobjects.OrderPagePOM;

import HCL.Hackaton_Demo2.BaseClass;


//@Listeners(com.listener.ListenerTest.class)
public class LiveChat extends BaseClass {
	
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
		String name = prop.getProperty("name");
		move(l.getAccDrpDwn());
		l.getSigninBtn().click();
		Thread.sleep(5000);
		l.getEmailTxtbox().click();
		fill(l.getEmailTxtbox(), user);
		fill(l.getPassTxtbox(), pass);
		l.getRemembermeCheckbox().click();
		l.getLoginBtn().click();
		Thread.sleep(15000);
		l.getLivechatBtn().click();
		fill(l.getLivechatName(), name);
		fill(l.getLivechatEmail(), user);
		l.getLivechatSubmit().click();
		Reporter.log("Welcome to livechat");
		screenShot(path +"\\Livechat.jpeg");


	}
}
