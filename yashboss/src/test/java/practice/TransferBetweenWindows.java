   package practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TransferBetweenWindows {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(4000);
		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(4000);
		Set<String> allWindowId = driver.getWindowHandles();
		for (String windowId : allWindowId) {
			System.out.println(driver.switchTo().window(windowId).getCurrentUrl());
		}
	}
}
