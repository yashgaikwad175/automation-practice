/**
 * 
 */
package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsTechniques {

	

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement e=driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		
		e.click();
		
		Thread.sleep(3000);
		
		System.out.println(e.isDisplayed());  //true       
		
	    System.out.println(e.isEnabled());    //true
	     
	   System.out.println(e.isSelected());   //true
	   
	   List<WebElement> b =driver.findElements(By.xpath("//input[@type='checkbox']"));
		
	   // first approach
	   
	   //for(WebElement k: b)
	   //{
		//   k.click();
	 //  }
	   
	   //2nd approach
	   
	  // for(int i=0; i<b.size(); i++)
	//   {
	//	   b.get(i).click();
	//   }
		

	}



}
