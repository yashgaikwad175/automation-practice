package keyboardop;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardOperations {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\.cache\\selenium\\chromedriver\\win64\\116.0.5845.96\\chromedriver.exe");
		// Creating instance of chrome driver
		WebDriver driver = new ChromeDriver();

		// Launching the URL
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");

		// Maximizing window
		driver.manage().window().maximize();

		// sleep for 3 seconds
		Thread.sleep(3000);

		// Locating Firstname textfield
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));

		// Locating Firstname textfield
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));

		Thread.sleep(2000);
		firstname.sendKeys("Prathamesh");

		Thread.sleep(2000);
		firstname.sendKeys(Keys.CONTROL + "a");

		Thread.sleep(2000);
		firstname.sendKeys(Keys.CONTROL + "c");

		firstname.sendKeys(Keys.TAB);

		lastname.click();
		Thread.sleep(2000);
		lastname.sendKeys(Keys.CONTROL + "v");
		Thread.sleep(2000);

		lastname.sendKeys(Keys.ARROW_LEFT);
		Thread.sleep(2000);
		lastname.sendKeys(Keys.ARROW_LEFT);
		Thread.sleep(2000);
		lastname.sendKeys(Keys.ARROW_LEFT);
		Thread.sleep(2000);
		lastname.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(2000);

		lastname.sendKeys(Keys.ARROW_RIGHT);
		Thread.sleep(2000);
		lastname.sendKeys(Keys.ARROW_RIGHT);
		Thread.sleep(2000);
		lastname.sendKeys(Keys.ARROW_RIGHT);
		Thread.sleep(2000);
		lastname.sendKeys(Keys.ARROW_RIGHT);
		Thread.sleep(2000);

		lastname.sendKeys(Keys.CONTROL + "a", Keys.BACK_SPACE);

		Thread.sleep(2000);

		driver.close();
	}

}
