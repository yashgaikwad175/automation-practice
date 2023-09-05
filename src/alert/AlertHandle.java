package alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\.cache\\selenium\\chromedriver\\win64\\116.0.5845.96\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.manage().window().maximize();

		Thread.sleep(3000);

		WebElement alert = driver.findElement(By.xpath("//input[@id='alertbtn']"));
		alert.click();

		Thread.sleep(2000);

		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

		Thread.sleep(2000);

		driver.close();

	}

}
