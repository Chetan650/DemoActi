package com.actitime.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.actitime.genericutility.BaseClass;

public class UserIcon extends BaseClass {

	@Test
	public void UserIcon() throws Throwable {

		WebElement icon = driver.findElement(By.xpath("//div[@id='container_users']"));
		icon.click();
		Thread.sleep(3000);
	}
}
