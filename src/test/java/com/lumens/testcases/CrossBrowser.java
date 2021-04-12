package com.lumens.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {

    WebDriver driver;
    @Test
    @Parameters("browser")
    
    public void verifypagetitle(String browsername) {
        if(browsername.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\\\ChromeDriver\\chromedriver.exe");
             driver = new ChromeDriver();
             driver.manage().window().maximize();
             
        }
        else if(browsername.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver", "C:\\Users\\admin\\Downloads\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
             driver=new InternetExplorerDriver();
             driver.manage().window().maximize();
             
        }
        driver.get("https://www.lumens.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(driver.getTitle());
        driver.quit();
    }
}


