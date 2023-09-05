package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\.cache\\selenium\\chromedriver\\win64\\116.0.5845.96\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		
//		Thread.sleep(2000); //pause for 2 seconds
		
		//Implicit wait
		//Global wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement un = driver.findElement(By.xpath("//input[@id='username']"));
		un.sendKeys("Prathamesh");
		
		WebElement pwd = driver.findElement(By.xpath("//input[@id='password']"));
		pwd.sendKeys("prat123");
		
		Thread.sleep(2000);
		driver.navigate().refresh(); 
		
		try
		{
			un.sendKeys("navneet");
		}
		catch(Exception e)
		{
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("navneet");
			System.out.println("handle the stale reference exception successfully");
		}
		
		Thread.sleep(2000);
		driver.close();

	}

}
