package handlecookies;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkOnPopup {
	public static void main(String[] args) {
		/*
		 * ChromeOptions options = new ChromeOptions();
		 * options.addArguments("incognito");
		 */
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.cleartrip.com/");
		WebElement closeButton = driver.findElement(By.xpath("//div[@class='px-1   flex flex-middle nmx-1 pb-1']"));
		closeButton.click();
		WebElement homeCalenderButton = driver
				.findElement(By.xpath("//div[contains(@class,' homeCalender')]/button[not(.='Return')]"));
		homeCalenderButton.click();
		Actions actions = new Actions(driver);
		WebElement date = driver.findElement(By.xpath("//div[@aria-label='Sat Apr 29 2023']"));
		actions.scrollByAmount(0, 300).pause(2000).click(date).perform();
	}
}
