package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingSEREDriver {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		HandlingSERE h = new HandlingSERE(driver);
		h.setLogin("admin1", "manager2");
		Thread.sleep(3000);
		h.setLogin("admin", "manager");
	}
}
