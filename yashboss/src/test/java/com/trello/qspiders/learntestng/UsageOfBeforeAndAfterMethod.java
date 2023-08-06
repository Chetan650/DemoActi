package com.trello.qspiders.learntestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UsageOfBeforeAndAfterMethod {
	WebDriver driver;

	@AfterMethod
	public void configAfterMmethod() {
		driver.manage().window().minimize();
		driver.quit();
	}

	@BeforeMethod
	public void configBeforeMethod() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
	}

	@Test
	public void login() throws Throwable {
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("admin");
		WebElement password = driver.findElement(By.name("pwd"));
		password.sendKeys("manager");
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		loginButton.click();
		Thread.sleep(3000);
	}
}
