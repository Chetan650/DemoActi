package com.trello.qspiders.datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginToActiTimeAccount {
	public static WebDriver driver;

	public static void main(String[] args) throws IOException, Throwable {
		FileInputStream fs = new FileInputStream("./src/test/resources/actitimelogin.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String browser = pro.getProperty("browser");
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {
			driver = new EdgeDriver();
		}
		driver.get(pro.getProperty("url"));
		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys(pro.getProperty("username"));
		WebElement password = driver.findElement(By.name("pwd"));
		password.sendKeys(pro.getProperty("password"));
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		loginButton.click();
		Thread.sleep(6000);
		driver.quit();
	}
}
