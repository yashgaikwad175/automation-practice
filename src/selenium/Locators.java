package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
		public static void main(String[] args) throws InterruptedException {
			WebDriver Web = new ChromeDriver();
			Web.get("https://google.com/");
			  Web.manage().window().maximize();
			WebElement e=Web.findElement(By.className("gLFyf"));
		    e.click();
		    Thread.sleep(3000);
		    
		    e.sendKeys("www.youtube.com");
		    Thread.sleep(3000);
		    WebElement e1=Web.findElement(By.className("gNO89b"));
		    e1.click();
		   
		    WebElement e2=Web.findElement(By.className("VuuXrf"));
		   e2.click();
		   
		   WebElement e3=Web.findElement(By.xpath("/html/body/ytd-app/div[1]/div/ytd-masthead/div[4]/div[2]/ytd-searchbox/form/div[1]/div[1]/input"));
		   e3.click();
		   Thread.sleep(3000);
		  
		   e3.sendKeys("Ram Siya Ram");
		   
          WebElement e4=Web.findElement(By.id("search-icon-legacy"));
		  e4.click();
		  Thread.sleep(3000);
		    
		  WebElement e5=Web.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-video-renderer[3]/div[1]/div/div[1]/div/h3/a"));
           e5.click();
            
           Thread.sleep(30000);
            Web.close();   
		   
	}

}
