package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdownHandle {

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
		
		WebElement a = driver.findElement(By.xpath("(//select[@id='ctl00_mainContent_DropDownListCurrency'])[1]"));
		a.click();
	
		Thread.sleep(2000);
		
		driver.quit();

	}

}
