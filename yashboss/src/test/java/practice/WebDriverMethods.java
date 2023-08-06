  package practice;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverMethods {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));  
		driver.get("https://www.facebook.com/");
		int height = driver.manage().window().getSize().getHeight();
		System.out.println(height);
		int width = driver.manage().window().getSize().getWidth();
		System.out.println(width);
		Dimension dim = new Dimension(300, 600);
		driver.manage().window().setSize(dim);
		int x = driver.manage().window().getPosition().getX();
		System.out.println(x);
		int y = driver.manage().window().getPosition().getY();
		System.out.println(y);
		Point pnt = new Point(200, 300);
		driver.manage().window().setPosition(pnt);
		// driver.manage().window().minimize();
		// driver.quit();
	}
}