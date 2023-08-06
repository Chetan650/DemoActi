package javascriptexecutor;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DynamicScrolling {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/doodles");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		for (;;) {
			try {
				WebElement birthDay = driver.findElement(By.xpath("//a[text()='Celebrating Didi Kempot']"));
				birthDay.click();
				break;
			} catch (NoSuchElementException e) {
				jse.executeScript("window.ScrollBy(0,500)");
			}
		}
	}
}
