package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

	public class CaptureHeightAndWidth {
		public static void main(String[] args) {
			WebDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("https://demo.actitime.com/login.do");
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			long scrollHeight = (long) jse.executeScript("return document.body.scrollHeight");
			System.out.println(scrollHeight);
			long scrollWidth = (long) jse.executeScript("return document.body.scrollWidth");
			System.out.println(scrollWidth);
			driver.manage().window().minimize();
			driver.quit();
		}
	}

