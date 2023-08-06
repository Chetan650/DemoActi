package com.trello.qspiders.datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginToMavaFBAccount {
	public static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fis = new FileInputStream("./src/test/resources/fbmava.properties");
		Properties pro = new Properties();
		pro.load(fis);
		String browserName = pro.getProperty("browser");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		if (browserName.equals("chrome")) {
			driver = new ChromeDriver(options);
		} else if (browserName.equals("edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get(pro.getProperty("url"));
		WebElement userNameTextfield = driver.findElement(By.id("email"));
		userNameTextfield.sendKeys(pro.getProperty("username"));
		WebElement passwordTextfield = driver.findElement(By.id("pass"));
		passwordTextfield.sendKeys(pro.getProperty("password"));
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		Actions actions = new Actions(driver);
		WebElement icon = driver.findElement(By.xpath("//div[@role='navigation']//*[@class='x3ajldb']"));
		actions.moveToElement(icon).click().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Log Out']")).click();
		driver.manage().window().minimize();
		 driver.quit();
	}
}
