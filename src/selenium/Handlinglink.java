package selenium;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlinglink {
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\.cache\\selenium\\chromedriver\\chromedriver-win64\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
	 d.manage().window().maximize();
	 Thread.sleep(3000);
	 WebElement male= d.findElement(By.xpath("/html/body/main/div/div/div[2]/div[4]/div/form/table/tbody/tr[3]/td[2]/input[1]"));
	
 
	 WebElement Female= d.findElement(By.xpath("/html/body/main/div/div/div[2]/div[4]/div/form/table/tbody/tr[3]/td[2]/input[2]"));
	 male.click();
	 System.out.println(male.isDisplayed());
     System.out.println(male.isEnabled());
	 System.out.println(male.isSelected());
	 Thread.sleep(10000);
	 Female.click();
      System.out.println(Female.isDisplayed());
     System.out.println(Female.isEnabled());
	 System.out.println(Female.isSelected());
	Thread.sleep(5000);
     d.close();
	}
	
}
