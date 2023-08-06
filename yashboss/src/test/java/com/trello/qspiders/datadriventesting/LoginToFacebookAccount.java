package com.trello.qspiders.datadriventesting;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginToFacebookAccount {
	public static WebDriver driver;

	public static void main(String[] args) throws Throwable {
		FileInputStream fis = new FileInputStream("./src/test/resources/fblogindata.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		String browserName = pobj.getProperty("browsername");
		if (browserName.equals("chrome")) {
			driver = new EdgeDriver();
		} else if (browserName.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.get(pobj.getProperty("url"));
		WebElement userNameTextField = driver.findElement(By.id("email"));
		userNameTextField.sendKeys(pobj.getProperty("username"));
		WebElement passwordTextField = driver.findElement(By.name("pass"));
		passwordTextField.sendKeys(pobj.getProperty("password"));
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();
	}
}
