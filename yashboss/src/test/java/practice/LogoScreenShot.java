package practice;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoScreenShot {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		String time = LocalDateTime.now().toString().replace(" ", "-").replace(":", "-");
		driver.get("https://www.chennaisuperkings.com/");
		WebElement logo = driver.findElement(By.xpath("//a//img[@class='header-logo']"));
		File src = logo.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/" + time + ".png");
		FileUtils.copyFile(src, dest);
		driver.quit();
	}
}
