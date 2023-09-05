package checkbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\.cache\\selenium\\chromedriver\\win64\\116.0.5845.96\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.manage().window().maximize();

		Thread.sleep(3000);

		WebElement checkbox = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		checkbox.click();
		System.out.println(checkbox.isDisplayed());
		System.out.println(checkbox.isEnabled());
		System.out.println(checkbox.isSelected());

		Thread.sleep(3000);

//		WebElement checkbox1 = driver.findElement(By.xpath("//input[@id='checkBoxOption2']"));
		/**
		 * Validate isSelected and click
		 */

		WebElement checkBoxSelected = driver.findElement(By.xpath("//input[@id='checkBoxOption2']"));
		boolean isSelected = checkBoxSelected.isSelected();

		// performing click operation if element is not selected
		if (isSelected == false) {
			checkBoxSelected.click();
		}

		/**
		 * Validate isDisplayed and click
		 */
		WebElement checkBoxDisplayed = driver.findElement(By.xpath("//input[@id='checkBoxOption2']"));
		boolean isDisplayed = checkBoxDisplayed.isDisplayed();

		// performing click operation if element is displayed
		if (isDisplayed == true) {
			checkBoxDisplayed.click();
		}

		/**
		 * Validate isEnabled and click
		 */
		WebElement checkBoxEnabled = driver.findElement(By.xpath("//input[@id='checkBoxOption2']"));
		boolean isEnabled = checkBoxEnabled.isEnabled();

		// performing click operation if element is enabled
		if (isEnabled == true) {
			checkBoxEnabled.click();
		}

		Thread.sleep(3000);

		List<WebElement> ch = driver.findElements(By.xpath("//input[@type='checkbox']"));

		for (WebElement k : ch) {
			k.click();
			System.out.println(k.getText());
		}

		for (int i = 0; i < ch.size(); i++) {
			ch.get(i).click();
			System.out.println(ch.get(i).getText());
		}

		driver.quit();
	}

}
