package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarHandle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\.cache\\selenium\\chromedriver\\chromedriver-win64\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(2000);
		
		WebElement date = driver.findElement(By.xpath("(//button[@type='button'])[1]"));
		date.click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-circle-triangle-e'])[1]")).click();
		
		Thread.sleep(2000);
		
		List<WebElement> allDates = driver.findElements(By.xpath("//td[@data-month='8']"));
		for(WebElement dates : allDates)
		{	
            // once date is 16 then click and break
			if(dates.getText().equalsIgnoreCase("16"))
			{
				Thread.sleep(2000);
				dates.click();
				break;
			}
		}
		
		Thread.sleep(3000);
		driver.close();
	}

}
