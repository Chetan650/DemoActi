package com.actitime.genericutility;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public WebDriver driver;

	@BeforeTest
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
	}

	@BeforeMethod
	public void login() {
		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys("admin");
		WebElement passward = driver.findElement(By.name("pwd"));
		passward.sendKeys("manager");
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		loginButton.click();
	}

	@AfterMethod
	public void logout() {
		WebElement logout = driver.findElement(By.linkText("Logout"));
		logout.click();
	}
}
