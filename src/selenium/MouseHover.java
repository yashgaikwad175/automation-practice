// MouseHover
package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d1=new ChromeDriver();
		Thread.sleep(2000);
	d1.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Thread.sleep(3000);

		WebElement e=d1.findElement(By.xpath("//button[@id='mousehover']"));

		Thread.sleep(1000);
		
		//create Actions class
		Actions a=new Actions(d1);
		
		a.moveToElement(e).build().perform();
		
		Thread.sleep(1000);
		
		WebElement top=d1.findElement(By.xpath("//a[@href='#top']"));
		Thread.sleep(1000);
		
		top.click();
		Thread.sleep(1000);
		
		d1.quit();
		
	}

		
	}


