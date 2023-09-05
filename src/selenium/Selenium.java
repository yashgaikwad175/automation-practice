package selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
public static void main(String[] args) throws InterruptedException {
	WebDriver Web = new ChromeDriver();
	Web.get("https://google.com/");
	WebElement e=Web.findElement(By.className("gLFyf"));
    e.click();
    Thread.sleep(3000);
    
    e.sendKeys("you tube");
    
  
	Thread.sleep(3000);
    WebElement e1=Web.findElement(By.className("gNO89b"));
    
    e1.click();
    Web.manage().window().maximize();
	// it will maximize the window
	String s=Web.getCurrentUrl();
	System.out.println(s);
	
	System.out.println(Web.getCurrentUrl());
	String s1 = Web.getTitle();
	System.out.println(s1);
	
	Thread.sleep(5000);
	
	Web.navigate().to("https://www.facebook.com/login/");
	//String s2=Web.getCurrentUrl();
	System.out.println(Web.getCurrentUrl());
	System.out.println(Web.getTitle());
	Thread.sleep(10000);
	//Web.manage().window().minimize();
	Web.navigate().back();
	Thread.sleep(5000);
	Web.navigate().forward();
	Thread.sleep(5000);
	Web.navigate().refresh();
	Thread.sleep(5000);
	Web.close();   
	
}
}