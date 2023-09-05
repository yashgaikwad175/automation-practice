package radiobutton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonHandleUsingxpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\.cache\\selenium\\chromedriver\\win64\\116.0.5845.96\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@value='radio1']"));
		checkbox.click();
		System.out.println(checkbox.isDisplayed());
		System.out.println(checkbox.isEnabled());
		System.out.println(checkbox.isSelected());
		
		Thread.sleep(3000);
		
		/**
		 * Validate isSelected and click
		 */

		WebElement checkBoxSelected = driver.findElement(By.xpath("//input[@value='radio2']"));
		boolean isSelected = checkBoxSelected.isSelected();

		// performing click operation if element is not selected 
		if(isSelected == false) {
			checkBoxSelected.click();
		}

		/**
		 * Validate isDisplayed and click
		 */
		WebElement checkBoxDisplayed = driver.findElement(By.xpath("//input[@value='radio2']"));
		boolean isDisplayed = checkBoxDisplayed.isDisplayed();

		// performing click operation if element is displayed
		if (isDisplayed == true) {
			checkBoxDisplayed.click();
		}

		/**
		 * Validate isEnabled and click
		 */
		WebElement checkBoxEnabled = driver.findElement(By.xpath("//input[@value='radio2']"));
		boolean isEnabled = checkBoxEnabled.isEnabled();

		// performing click operation if element is enabled
		if (isEnabled == true) {
			checkBoxEnabled.click();
		}
		
	Thread.sleep(3000);
		
		/**
		 * Validate isSelected and click
		 */

		WebElement checkBoxSelected1 = driver.findElement(By.xpath("//input[@value='radio3']"));
		boolean isSelected1 = checkBoxSelected.isSelected();

		// performing click operation if element is not selected 
		if(isSelected1 == false) {
			checkBoxSelected1.click();
		}

		/**
		 * Validate isDisplayed and click
		 */
		WebElement checkBoxDisplayed1 = driver.findElement(By.xpath("//input[@value='radio3']"));
		boolean isDisplayed1 = checkBoxDisplayed.isDisplayed();

		// performing click operation if element is displayed
		if (isDisplayed1 == true) {
			checkBoxDisplayed1.click();
		}

		/**
		 * Validate isEnabled and click
		 */
		WebElement checkBoxEnabled1 = driver.findElement(By.xpath("//input[@value='radio3']"));
		boolean isEnabled1 = checkBoxEnabled.isEnabled();

		// performing click operation if element is enabled
		if (isEnabled1 == true) {
			checkBoxEnabled1.click();
		}
		
		Thread.sleep(3000);
		
		
		
		driver.quit();

	}

}
