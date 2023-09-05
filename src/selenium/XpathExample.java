package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\.cache\\selenium\\chromedriver\\win64\\116.0.5845.96\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");

		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		//Absolute xpath
		WebElement username = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/div[1]/div/input[1]"));
		username.sendKeys("hello");
		
		Thread.sleep(3000);
		
		WebElement password = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/input[2]"));
		password.sendKeys("hello123");
		
		Thread.sleep(3000);
		
		WebElement fp = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/div/a[1]"));
		fp.click();
		
//		//Relative xpath
//		WebElement username = driver.findElement(By.xpath("//input[contains(@id,'username')]"));
//		username.sendKeys("pratham");
//		System.out.println("Username sended key that is pratham");
//		
//		Thread.sleep(3000);
//		
//		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
//		password.sendKeys("pratham1999");
//		System.out.println("Password sended key that is pratham1999");
//		
//		Thread.sleep(3000);
//		
//		WebElement forgotPassword = driver.findElement(By.xpath("//a[@id='forgot_password_link']"));
//		System.out.println(forgotPassword.isDisplayed());
//		System.out.println("Forgot Password link is displayed");
//		System.out.println(forgotPassword.isEnabled());
//		System.out.println("Forgot Password link is enabled");
//		forgotPassword.click();
//		System.out.println("Forgot Password link is clicked");
		
		
//		driver.findElement(By.xpath("//div[@id='username_container']/input[1]")).sendKeys("pratham");
//		
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("//form[@id='login_form']/input[2]")).sendKeys("pratham1999");
//		
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("//div[@id='theloginform']/div/a[1]")).click();
		
		Thread.sleep(2000);
		
		driver.quit();
		
		//form[@id='login_form']/input[2]
		
		
	}

}
