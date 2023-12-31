package com.trello.qspiders.genericutility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	public void implicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	public boolean waitForCompleteTitle(WebDriver driver, String expectedTitle) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		Boolean validation = wait.until(ExpectedConditions.titleIs(expectedTitle));
		return validation;
	}

	public WebElement elementVisibilityByLocator(WebDriver driver, String elementId) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement visibleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(elementId)));
		return visibleElement;
	}
}
