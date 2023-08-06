package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DynamicWebpageHeightAndWidth {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/doodles");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		long scrollHeight1 = (long) jse.executeScript("return document.body.scrollHeight");
		System.out.println(scrollHeight1);
		// long scrollWidth = (long) jse.executeScript("document.body.scrollWidth");
		// System.out.println(scrollWidth);
		driver.navigate().refresh();
		Thread.sleep(7000);
		long scrollHeight2 = (long) jse.executeScript("return document.body.scrollHeight");
		System.out.println(scrollHeight2);
		driver.quit();
	}
}
