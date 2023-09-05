package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdownHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\.cache\\selenium\\chromedriver\\win64\\116.0.5845.96\\chromedriver.exe");
		// Creating instance of chrome driver
		WebDriver driver = new ChromeDriver();

		// Launching the URL
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		// Maximizing window
		driver.manage().window().maximize();

		// sleep for 3 seconds
		Thread.sleep(3000);

		// Locating dropdown by id and click
		WebElement currency = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
		currency.click();

		// Selecting the dropdown element
		Select select = new Select(currency);

		// Printing the options of dropdown
		// Get list of web elements
		List<WebElement> el = select.getOptions();

		// Looping through the options and printing dropdown options
		System.out.println("The Dropdown options are: ");
		for (WebElement k : el) {
			System.out.println(k.getText());
		}

		System.out.println("\n");

		Thread.sleep(3000);

		// Selecting the options by using index
		System.out.println("Select the option by index 0");
		select.selectByIndex(0);
		currency.click();
		System.out.println("Selected option is: " + select.getFirstSelectedOption().getText());

		Thread.sleep(3000);

		// Selecting the options by using value
		System.out.println("Select the option by value AED");
		currency.click();

		Thread.sleep(3000);

		select.selectByValue("AED");
		currency.click();
		System.out.println("Selected option is: " + select.getFirstSelectedOption().getText());

		Thread.sleep(3000);

		// Selecting the options by using visibleText
		System.out.println("Select the option by visible text USD");
		currency.click();

		Thread.sleep(3000);

		select.selectByVisibleText("USD");
		currency.click();
		System.out.println("Selected option is: " + select.getFirstSelectedOption().getText());

		Thread.sleep(3000);

		driver.close();
	}

}
