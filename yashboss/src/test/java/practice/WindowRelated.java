package practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowRelated {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");

		// GET SIZE
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		int ht = size.height;
		System.out.println(ht);
		int wd = size.width;
		System.out.println(wd);

		// SET SIZE
		Dimension stsz = new Dimension(300, 500);
		driver.manage().window().setSize(stsz);
		Thread.sleep(3000);

		// GET POSITION
		Point getps = driver.manage().window().getPosition();
		System.out.println(getps);
		int posht = getps.getX();
		System.out.println(posht);
		int poswd = getps.getY();
		System.out.println(poswd);
		Thread.sleep(2000);

		// SET POSITION
		Point setPosition = new Point(15, 25);
		driver.manage().window().setPosition(setPosition);
		Thread.sleep(2000);
		driver.quit();   
	}
}
