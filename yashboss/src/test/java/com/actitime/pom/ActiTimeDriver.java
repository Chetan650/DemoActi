 package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ActiTimeDriver {
	WebDriver driver;

	@Test
	public void login() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		ActiTime lp = new ActiTime(driver);
		lp.setLogin("admin", "manager");
		driver.quit();
	}
}
