 package selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessOperation {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\ADMIN\\.cache\\selenium\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		
		//create an object for Chromeoptions
		
		ChromeOptions options=new ChromeOptions();
		
		// add the headless argument
		
		options.addArguments("headless");
		
		// pass the options parameter inside chromeDriver argument
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://login.salesforce.com/?locale=in");
		
        Thread.sleep(3000);
		
		List<WebElement> a=driver.findElements(By.tagName("a"));
		
		Thread.sleep(1000);
		
		System.out.println(a.size());
		
		for(WebElement k:a)
		{
			System.out.println(k.getText());
		}
		
		//2nd approach
		
		//for(int i=0; i<a.size(); i++)
	//{
	//		System.out.println(a.get(i).getText());
	//	}

	}

}
