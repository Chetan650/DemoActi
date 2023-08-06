package com.trello.qspiders.datadriventesting;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReadFBData {
	public static void main(String[] args) {
		List<String> dayOptions = new ArrayList<String>();
		List<String> monthOptions = new ArrayList<String>();
		List<String> yearOptions = new ArrayList<String>();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/signup");
		List<WebElement> allDropdowns = driver.findElements(By.tagName("select"));
		for (WebElement dropdown : allDropdowns) {
			if (dropdown.isDisplayed()) {
				Select dropdownSelect = new Select(dropdown);
				if (dropdown.getAttribute("id").equals("day")) {
					List<WebElement> dayDropdownoptions = dropdownSelect.getOptions();
					for (WebElement option : dayDropdownoptions) {
						dayOptions.add(option.getText());
					}
				} else if (dropdown.getAttribute("id").equals("month")) {
					List<WebElement> monthDropdownOptions = dropdownSelect.getOptions();
					for (WebElement option : monthDropdownOptions) {
						monthOptions.add(option.getText());
					}
				} else if (dropdown.getAttribute("id").equals("year")) {
					List<WebElement> yeardropdownOptions = dropdownSelect.getOptions();
					for (WebElement option : yeardropdownOptions) {
						yearOptions.add(option.getText());
					}
				}
			} else {
				System.out.println("Dropdown is not visible");
			}
		}
		System.out.println(dayOptions);
		System.out.println(monthOptions);
		System.out.println(yearOptions);
		driver.quit();
	}
}