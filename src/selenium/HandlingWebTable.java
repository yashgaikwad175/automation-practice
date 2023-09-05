package selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\.cache\\selenium\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Thread.sleep(2000);
		
		List<WebElement> ab=driver.findElements(By.xpath("//div[@class='tableFixHead']//td[4]"));

		Thread.sleep(1000);
		
		System.out.println(ab.size());
		
		/*for(WebElement k:ab)
		{
			System.out.println(k.getText());
		}*/
		
		//2nd apprach
		
		int sum=0;
		for(int i=0; i<ab.size(); i++)
			
		{
			String myString=ab.get(i).getText();
			sum=sum+Integer.parseInt(myString);
		}
		
		System.out.println(sum);
		
		String exp=driver.findElement(By.xpath("//div[@class='totalAmount']")).getText();
		
		int expAmt=Integer.parseInt(exp.substring(24));
		
		if(sum==expAmt)
		{
			System.out.println(" Amount is matching"); 
		}
		
		else
		{
			System.out.println("amount is not matching");
			System.out.println("daya...kuchh to gadbad hai");
		}
	}


	}


