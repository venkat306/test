package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import com.hrms.utility.Log;

public class General extends Global {
//Re-usable Fun:
	public void openApplication() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.navigate().to(url);
		System.out.println("Application opened");//java console
		Reporter.log("Application opened");//html Report
		Log.info("Application opened");//Logfile
	}
	public void closeApplication() {
		driver.close();
		System.out.println("Application Closed");
		Log.info("Application closed");
	}
	public void login() {
		driver.findElement(By.name(txt_loginname)).sendKeys(username);
		driver.findElement(By.name(txt_password)).sendKeys(password);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("Log in completed");
		Log.info("Login Completed");
	}
	public void logout() {
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout Completed");
		Log.info("Logout Complted");
	}
	public void addEMp() {
		System.out.println("Adding New EMp");
		Log.info("adding new emp");
	}
	public void delEMp() {
		System.out.println("Delete EMp");
		Log.info("Delete emp");
	}
}
