package dropdown;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Passenger {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\.cache\\selenium\\chromedriver\\win64\\116.0.5845.96\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		//dropdown click
		WebElement a = driver.findElement(By.xpath("//div[@id='divpaxinfo']"));
		a.click();
		
		Thread.sleep(3000);
		
		//adult increase
		WebElement a1 = driver.findElement(By.xpath("//span[@id='hrefIncAdt']"));
		a1.click();
		Thread.sleep(2000);
		a1.click();
		Thread.sleep(2000);
		a1.click();
		
		Thread.sleep(2000);
		
		//child increase
		for(int i = 0; i < 2; i++)
		{
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[@id='hrefIncChd']")).click();
		}
		
		Thread.sleep(2000);
		
		//infant increase
		for(int i = 0; i < 2; i++)
		{
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[@id='hrefIncInf']")).click();
		}
		
		Thread.sleep(2000);
		
		
//		//decrease adult
//		for(int i = 0; i < 4; i++)
//		{
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//span[@id='hrefDecAdt']")).click();
//		}
//		
//		Thread.sleep(2000);
		
		WebElement done = driver.findElement(By.cssSelector("input#btnclosepaxoption"));
		done.click();
		
		Thread.sleep(2000);
		
		WebElement suggest = driver.findElement(By.xpath("//input[@placeholder='Type to Select']"));
		suggest.sendKeys("Be");
		String txt;
		
		do
		{
			suggest.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(2000);
			txt = suggest.getAttribute("value");
//			System.out.println(txt);
			if(txt.equalsIgnoreCase("bermuda"))
			{
				suggest.sendKeys(Keys.ENTER);
				System.out.println(txt);
				break;
			}
		}while(!txt.isEmpty());
		
		
//		Thread.sleep(2000);
//		suggest.sendKeys(Keys.ARROW_DOWN);
//		Thread.sleep(2000);
//		suggest.sendKeys(Keys.ARROW_DOWN);
//		Thread.sleep(2000);
//		suggest.sendKeys(Keys.ENTER);
		
//		List<WebElement> t = driver.findElements(By.xpath("(//a[@class='ui-corner-all']"));
//		
//		for(WebElement u : t)
//		{
//			String text = u.getText();
//            System.out.println(text);
//            if (u.equals("Indonesia")) {
//                u.click();
//                break;
//            }
//		}
		
		Thread.sleep(2000);
		
		
		
		driver.close();

	}

}
