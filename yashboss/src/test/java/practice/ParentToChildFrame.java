package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentToChildFrame {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.findElement(By.linkText("Iframe with in an Iframe")).click();
		WebElement parentFrame = driver.findElement(By.xpath("//div[@id='Multiple']/iframe"));
		driver.switchTo().frame(parentFrame);
		WebElement childFrame = driver.findElement(By.xpath("//div[@class='iframe-container']/iframe"));
		driver.switchTo().frame(childFrame);
		driver.findElement(By.xpath("//div[@class='container']//input")).sendKeys("Automation ");
		Thread.sleep(3000);
		driver.quit();
	}
}
