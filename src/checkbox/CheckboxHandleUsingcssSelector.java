package checkbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxHandleUsingcssSelector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\.cache\\selenium\\chromedriver\\win64\\116.0.5845.96\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.manage().window().maximize();

		Thread.sleep(3000);

		WebElement checkbox = driver.findElement(By.cssSelector("input#checkBoxOption1"));
		checkbox.click();
		System.out.println(checkbox.isDisplayed());
		System.out.println(checkbox.isEnabled());
		System.out.println(checkbox.isSelected());

		Thread.sleep(2000);

		/**
		 * Validate isSelected and click
		 */

		WebElement checkBoxSelected = driver.findElement(By.cssSelector("input#checkBoxOption2"));
		boolean isSelected = checkBoxSelected.isSelected();

		// performing click operation if element is not selected
		if (isSelected == false) {
			checkBoxSelected.click();
		}

		Thread.sleep(2000);

		/**
		 * Validate isDisplayed and click
		 */
		WebElement checkBoxDisplayed = driver.findElement(By.cssSelector("input#checkBoxOption2"));
		boolean isDisplayed = checkBoxDisplayed.isDisplayed();

		// performing click operation if element is displayed
		if (isDisplayed == true) {
			checkBoxDisplayed.click();
		}

		Thread.sleep(2000);

		/**
		 * Validate isEnabled and click
		 */
		WebElement checkBoxEnabled = driver.findElement(By.cssSelector("input#checkBoxOption2"));
		boolean isEnabled = checkBoxEnabled.isEnabled();

		// performing click operation if element is enabled
		if (isEnabled == true) {
			checkBoxEnabled.click();
		}

		Thread.sleep(2000);

		List<WebElement> ch = driver.findElements(By.xpath("//input[@type='checkbox']"));

		for (WebElement k : ch) {
			k.click();
		}

		Thread.sleep(2000);

		for (int i = 0; i < ch.size(); i++) {
			ch.get(i).click();
		}

		Thread.sleep(2000);

		driver.quit();

	}

}
