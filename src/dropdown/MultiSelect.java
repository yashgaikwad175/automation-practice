package dropdown;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\.cache\\selenium\\chromedriver\\win64\\116.0.5845.96\\chromedriver.exe");
		// Creating instance of Chrome driver
		WebDriver driver = new ChromeDriver();

		// Navigate to the URL
		driver.get("https://demoqa.com/select-menu");

		// Maximizing window
		driver.manage().window().maximize();

		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", "");

		// Selecting the multi-select element by locating its id
		Select select = new Select(driver.findElement(By.id("cars")));

		// Get the list of all the options
		System.out.println("The dropdown options are -");

		List<WebElement> options = select.getOptions();

		for (WebElement option : options)
			System.out.println(option.getText());

		Thread.sleep(3000);

		// Using isMultiple() method to verify if the element is multi-select, if yes go
		// onto next steps else eit
		if (select.isMultiple()) {

			// Selecting option as 'Opel'-- ByIndex
			System.out.println("Select option Opel by Index");
			select.selectByIndex(2);

			Thread.sleep(3000);

			// Selecting the option as 'Saab'-- ByValue
			System.out.println("Select option saab by Value");
			select.selectByValue("saab");

			Thread.sleep(3000);

			// Selecting the option by text
			System.out.println("Select option Audi by Text");
			select.selectByVisibleText("Audi");

			Thread.sleep(3000);

			// Get the list of selected options
			System.out.println("The selected values in the dropdown options are -");

			List<WebElement> selectedOptions = select.getAllSelectedOptions();

			for (WebElement selectedOption : selectedOptions)
				System.out.println(selectedOption.getText());

			Thread.sleep(3000);

			// Deselect the value "Audi" by Index
			System.out.println("DeSelect option Audi by Index");
			select.deselectByIndex(3);

			Thread.sleep(3000);

			// Deselect the value "Opel" by visible text
			System.out.println("Select option Opel by Text");
			select.deselectByVisibleText("Opel");

			Thread.sleep(3000);

			// Validate that both the values are deselected
			System.out.println("The selected values after deselect in the dropdown options are -");
			List<WebElement> selectedOptionsAfterDeselect = select.getAllSelectedOptions();

			for (WebElement selectedOptionAfterDeselect : selectedOptionsAfterDeselect)
				System.out.println(selectedOptionAfterDeselect.getText());

			Thread.sleep(3000);

			// Step#8- Deselect all values
			select.deselectAll();
		}

		driver.quit();
	}

}