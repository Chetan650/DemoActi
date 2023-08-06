package com.trello.qspiders.learntestng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ProperAutomationScript {
	WebDriver driver;

	@BeforeMethod
	@Parameters({ "browserName", "url" })
	void configBeforeMethod(String browserName, String url) {
		if (browserName.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equals("edge")) {
			driver = new EdgeDriver();
		} else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		Reporter.log("browser launched");
		driver.manage().window().maximize();
		driver.get(url);
		Reporter.log("url triggered");
	}

	@AfterMethod
	void configAfterMethod() {
		driver.manage().window().minimize();
		// driver.quit();
		Reporter.log("browser terminated");
	}

	@Test
	@Parameters({ "username", "password" })
	void loginLogoutOfActiTime() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("username");
		WebElement password = driver.findElement(By.name("pwd"));
		password.sendKeys("password");
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		loginButton.click();
		Reporter.log("loged into app");
		WebElement logoutButton = driver.findElement(By.id("logoutLink"));
		logoutButton.click();
	}
}
