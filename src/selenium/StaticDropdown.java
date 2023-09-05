package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

public static void main(String[] args) throws InterruptedException {
		
	    WebDriver d=new ChromeDriver();
	    
	    d.get("https://rahulshettyacademy.com/dropdownsPractise/");
	    
	    d.manage().window().maximize();
	    
	    Thread.sleep(3000);
	    
	    WebElement e=d.findElement(By.xpath("(//select[@id='ctl00_mainContent_DropDownListCurrency'])[1]"));
	    
	    e.click();
	    
	    // create an select class
	    
	    Select s=new Select(e);
	    
	    s.selectByIndex(1);
	    
	    Thread.sleep(3000);
	    
	    s.selectByValue("AED");
	
	    Thread.sleep(3000);
	    
	    s.selectByVisibleText("USD");
	    
	    Thread.sleep(3000);
	    
	    d.close();
	    
	    // try to create a loop ?

	}
}
