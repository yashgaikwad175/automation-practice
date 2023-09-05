//MouseOperator
package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOperator {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver D= new ChromeDriver();
		D.manage().window().maximize();
		Thread.sleep(3000);
		D.get("https://rahulshettyacademy.com/AutomationPractice/");
			Thread.sleep(3000);
		WebElement e=D.findElement(By.xpath("//button[@id='openwindow']"));
		Thread.sleep(3000);
		Actions a=new Actions(D);
		Thread.sleep(1000);
         a.contextClick(e).build().perform();
		
		Thread.sleep(1000);
		
		a.doubleClick(e).build().perform();
		
		Thread.sleep(1000);
		
		D.close(); 
		
			
	}

}
