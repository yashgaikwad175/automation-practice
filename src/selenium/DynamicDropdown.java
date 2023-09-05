package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {
public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\.cache\\selenium\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		d.manage().window().maximize();
		
		//Thread.sleep(3000);
		
		d.findElement(By.xpath("//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']")).click();
        
		Thread.sleep(3000);
		
		WebElement e=d.findElement(By.xpath("//a[@value='IXB']"));
		
		e.click();
		
		System.out.println(e.getText());
		
		Thread.sleep(3000);
		
		WebElement e1=d.findElement(By.xpath("(//a[@text='Pune (PNQ)'])[2]"));
		                                     
		Thread.sleep(3000);
	
		e1.click();
		Thread.sleep(3000);
		
		System.out.println(e1.getText());
		Thread.sleep(3000);
		d.close();
		
	}

}
