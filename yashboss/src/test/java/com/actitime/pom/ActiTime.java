package com.actitime.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActiTime {
	private WebElement untf;
	private WebElement pwtf;
	private WebElement lgn;

	public ActiTime(WebDriver driver) {
		untf = driver.findElement(By.id("username"));
		pwtf = driver.findElement(By.name("pwd"));
		lgn = driver.findElement(By.xpath("//div[text()='Login ']"));
	}

	public void setLogin(String un, String pw) {
		untf.sendKeys(un);
		pwtf.sendKeys(pw);
		lgn.click();
	}
}
