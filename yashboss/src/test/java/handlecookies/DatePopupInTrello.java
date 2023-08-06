package handlecookies;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatePopupInTrello {
//	static WebDriver driver;

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://trello.com/");

		WebElement loginButton = driver.findElement(By
				.xpath("//div[contains(@class,'BigNavstyles__InnerHeader-sc-1mttgq7-2 kuxyBF')]//a[text()='Log in']"));
		loginButton.click();
		/*
		 * WebElement loginTextField =
		 * driver.findElement(By.xpath("//input[@id='user']"));
		 * loginTextField.sendKeys("andelichetan@gmail.com");
		 * driver.findElement(By.xpath("//input[@value='Continue']")).click();
		 * WebElement passwordTextField =
		 * driver.findElement(By.xpath("//input[@id='password']"));
		 * passwordTextField.sendKeys("8792685004");
		 * driver.findElement(By.xpath("//button[@type='submit']")).click();
		 */

		driver.switchTo().activeElement().sendKeys("andelichetan@gmail.com");
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ENTER).pause(2000).perform();
		driver.switchTo().activeElement().sendKeys("8792685004");
		actions.sendKeys(Keys.ENTER).pause(2000).perform();
		// Trello Home Page
		WebElement createNewBoard = driver.findElement(By.xpath("//div[@class='board-tile mod-add']"));
		createNewBoard.click();
		actions.pause(4000).perform();
		driver.switchTo().activeElement().sendKeys("Sandalwood");
		actions.pause(2000).perform();
		actions.sendKeys(Keys.ENTER).perform();
 
		boardTitle.sendKeys("Sandalwood");
		actions.sendKeys(Keys.ENTER).perform();
		actions.pause(5000).perform();
		driver.switchTo().activeElement().sendKeys("YASH");
		actions.pause(3000).perform();
		actions.sendKeys(Keys.ENTER).perform();
		actions.pause(3000).perform();
		driver.findElement(By.xpath("//div[@class='list-header-extras']")).click();
		actions.pause(3000).perform();
		WebElement addCard = driver.findElement(By.xpath("//a[text()='Add card…']"));
		actions.pause(3000).click(addCard).perform();
		/*
		 * // driver.findElement(By.xpath("//input[@type='submit']")).click();
		 * //WebElement addCard = driver .findElement(By.
		 * xpath("(//span[@class='icon-sm icon-add']/preceding::a[contains(@class,'open')])[3]"
		 * )); //addCard.click();
		 */
		/*
		 * driver.switchTo().activeElement().sendKeys("Rajahuli");
		 * actions.pause(2000).sendKeys(Keys.ENTER).perform();
		 * driver.switchTo().activeElement().sendKeys("Googly");
		 * actions.pause(2000).pause(2000).sendKeys(Keys.ENTER).perform();
		 * driver.switchTo().activeElement().sendKeys("Ramachari");
		 * actions.pause(2000).pause(2000).sendKeys(Keys.ENTER).perform();
		 * driver.switchTo().activeElement().sendKeys("Kirataka");
		 * actions.pause(2000).pause(2000).sendKeys(Keys.ENTER).perform();
		 * driver.switchTo().activeElement().sendKeys("KGF");
		 * actions.pause(2000).pause(2000).sendKeys(Keys.ENTER).perform();
		 * driver.switchTo().activeElement().sendKeys("Lucky");
		 * actions.pause(2000).pause(2000).sendKeys(Keys.ENTER).perform();
		 * driver.switchTo().activeElement().sendKeys("Drama");
		 * actions.pause(2000).pause(2000).sendKeys(Keys.ENTER).perform();
		 */
		// actions.sendKeys(Keys.TAB).pause(300).sendKeys(Keys.TAB).pause(300).sendKeys(Keys.TAB).build().perform();
		// driver.switchTo().activeElement().sendKeys("PAWAN KALYN");
		/*
		 * WebElement secondList =
		 * driver.findElement(By.xpath("//input[@class='list-name-input']"));
		 * secondList.click(); secondList.sendKeys("PAWAN KALYAN");
		 */
		/*
		 * WebElement menu =
		 * driver.findElement(By.xpath("//span[@class='show-sidebar-button-react-root']"
		 * )); menu.click();
		 */

	}
}
