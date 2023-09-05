package assignment2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentTwo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\.cache\\selenium\\chromedriver\\win64\\116.0.5845.96\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.manage().window().maximize();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();

		Thread.sleep(2000);

		WebElement e = driver.findElement(By.xpath("//a[@value='CCU']"));
		e.click();
		System.out.println(e.getText());

		Thread.sleep(2000);

		WebElement e1 = driver.findElement(By.xpath("(//a[@text='Surat (STV)'])[2]"));
		e1.click();
		System.out.println(e1.getText());

//		WebElement date = driver.findElement(By.xpath("(//button[@type='button'])[1]"));
//		date.click();
//		
//		Thread.sleep(2000);

		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-circle-triangle-e'])[1]")).click();

		Thread.sleep(2000);

		List<WebElement> allDates = driver.findElements(By.xpath("//td[@data-month='8']"));
		for (WebElement dates : allDates) {
			// once date is 28 then click and break
			if (dates.getText().equalsIgnoreCase("8")) {
				Thread.sleep(2000);
				dates.click();
				break;
			}
		}

		// dropdown click
		WebElement a = driver.findElement(By.xpath("//div[@id='divpaxinfo']"));
		a.click();

		Thread.sleep(3000);

		// adult increase
		WebElement a1 = driver.findElement(By.xpath("//span[@id='hrefIncAdt']"));
		a1.click();
		Thread.sleep(2000);
		a1.click();
		Thread.sleep(2000);
		a1.click();

		Thread.sleep(2000);

		// child increase
		for (int i = 0; i < 2; i++) {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[@id='hrefIncChd']")).click();
		}

		Thread.sleep(2000);

		// infant increase
		for (int i = 0; i < 2; i++) {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[@id='hrefIncInf']")).click();
		}

		Thread.sleep(2000);

		WebElement done = driver.findElement(By.cssSelector("input#btnclosepaxoption"));
		done.click();

		Thread.sleep(2000);

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
		select.selectByIndex(2);
		currency.click();
		System.out.println("Selected option is: " + select.getFirstSelectedOption().getText());

		Thread.sleep(3000);

		driver.findElement(By.xpath("(//input[@id='ctl00_mainContent_btn_FindFlights'])[1]")).click();

		Thread.sleep(2000);
		driver.quit();
	}

}
