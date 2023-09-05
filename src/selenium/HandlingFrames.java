package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");

	    Thread.sleep(3000);
	    
	    driver.manage().window().maximize();
	    
	    driver.switchTo().frame("packageListFrame");
	    
	    WebElement e=driver.findElement(By.xpath("//a[@href='org/openqa/selenium/bidi/browsingcontext/package-frame.html']"));
	
	    e.click();
	    Thread.sleep(1000);
	    
	    driver.navigate().refresh();
	    Thread.sleep(1000);
	    
	    driver.switchTo().defaultContent();
	    // // this method responsible navigate to parent 
	    Thread.sleep(1000);
	    
	    driver.switchTo().frame(1);
	    Thread.sleep(1000);
	    
	    WebElement e1=driver.findElement(By.xpath("//a[@href='org/openqa/selenium/support/events/AbstractWebDriverEventListener.html']"));
	    e1.click();
	    
	    driver.navigate().refresh();
	    
	    Thread.sleep(1000);
	    
	    driver.switchTo().defaultContent();
	    Thread.sleep(1000);
	    
	    driver.switchTo().frame(2);
	    
	    driver.findElement(By.xpath("/html/body/header/nav/div[1]/div[1]/ul/li[5]/a")).click();
	    
	    Thread.sleep(2000);
	    
	    driver.close();
	    
	}

}
