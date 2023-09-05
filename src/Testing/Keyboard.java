package Testing;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyboard {
public static void main(String[] args) throws InterruptedException {
	WebDriver D=new ChromeDriver();
	D.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
	
	WebElement e=D.findElement(By.xpath("//input[@name='firstname']"));
	WebElement e1=D.findElement(By.xpath("//input[@name='lastname']"));
	
	Thread.sleep(2000);
	
	e.sendKeys("ramesh");
	Thread.sleep(2000);
	e.sendKeys(Keys.CONTROL +"a");
	Thread.sleep(2000);
	e.sendKeys(Keys.CONTROL +"c");
	Thread.sleep(2000);
	e.sendKeys(Keys.TAB);
	Thread.sleep(2000);
	e1.sendKeys(Keys.CONTROL+ "v");
	Thread.sleep(2000);
	e1.sendKeys(Keys.ARROW_LEFT);
	Thread.sleep(2000);
	e1.sendKeys(Keys.ARROW_LEFT);
	Thread.sleep(2000);
	e1.sendKeys(Keys.ARROW_LEFT);
	Thread.sleep(2000);
	e1.sendKeys(Keys.ARROW_RIGHT);
	Thread.sleep(2000);
	e1.sendKeys(Keys.ARROW_RIGHT);
	Thread.sleep(2000);
	e1.sendKeys(Keys.ARROW_RIGHT);
	Thread.sleep(2000);
	e1.sendKeys(Keys.CONTROL + "a");
	Thread.sleep(2000);
	e1.sendKeys(Keys.DELETE);
	Thread.sleep(2000);
	D.close();
	

	
	
}
	
	

}
