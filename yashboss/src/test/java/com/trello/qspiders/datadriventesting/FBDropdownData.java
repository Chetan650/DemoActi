package com.trello.qspiders.datadriventesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
  
public class FBDropdownData {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/signup");
		WebElement parentElement = driver.findElement(By.id("birthday_wrapper"));
		List<WebElement> alldbDropdowns = parentElement.findElements(By.tagName("select"));
		System.out.println(alldbDropdowns.size());
		for (WebElement dropdown : alldbDropdowns) {
			if (dropdown.getAttribute("id").equals("day")) {
				Select dayDropdown = new Select(dropdown);
				dayDropdown.selectByVisibleText("10");
			} else if (dropdown.getAttribute("id").equals("month")) {
				Select monthDropdown = new Select(dropdown);
				monthDropdown.selectByIndex(7);
			} else if (dropdown.getAttribute("id").equals("year")) {
				Select yeardropdown = new Select(dropdown);
				yeardropdown.selectByVisibleText("1997");
			}
		}
		Thread.sleep(5000);
		driver.manage().window().minimize();
		driver.quit();
	}
}