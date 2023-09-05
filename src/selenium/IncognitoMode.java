 package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class IncognitoMode {

	public static void main(String[] args) throws InterruptedException {
	// ctrate object fr ChromeOptions
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\.cache\\selenium\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		
		// add argument
		
		options.addArguments("--incognito");
		options.addArguments("start-maximized");
		
		WebDriver driver=new ChromeDriver(options);
		
		 driver.get("https://login.salesforce.com/?locale=in");
		 
	    //  driver.manage().window().maximize();
	      
	      Thread.sleep(3000);
	      
	      driver.findElement(By.xpath("(//div[@id='username_container']/input)[1]")).sendKeys("sharad");
	      
	      Thread.sleep(3000);
	      
	      driver.findElement(By.xpath("//form[@id='login_form']/input[2]")).sendKeys("sharad1999");
	      

	}

	}


