package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\.cache\\selenium\\chromedriver\\win64\\116.0.5845.96\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		
		List<WebElement> table = driver.findElements(By.xpath("//div[@class='tableFixHead']//td[4]"));
		System.out.println(table.size());
		
		//For each loop
		for(WebElement data : table)
		{
			System.out.println(data.getText());
		}
		System.out.println("\n");
		//For loop for summation of all the table data
		int sum = 0;
		for(int i = 0; i < table.size(); i++)
		{
			String td = table.get(i).getText(); //storing data in string 
			int num = Integer.parseInt(td); //converting string to int
			sum = sum + num; //adding values
		}
		
		System.out.println("Total Amount Collected: " + sum);
		
		WebElement amount = driver.findElement(By.xpath("//div[@class='totalAmount']"));
		
		String expectedAmt = amount.getText();
		String amt = expectedAmt.substring(24);
		int expAmt = Integer.parseInt(amt);
		if(sum == expAmt)
		{
			System.out.println("Amount is matching...");
		}
		else
		{
			System.out.println("Amount is not matching...");
		}
		
		Thread.sleep(2000);
		driver.close();

	}

}
