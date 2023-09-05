package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Openwindow {
public static void main(String[] args) throws InterruptedException {
		
		WebDriver D=new ChromeDriver();
		
		D.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Thread.sleep(3000);
		
		D.findElement(By.xpath("//button[@id='openwindow']")).click();
		
		System.out.println(D.getCurrentUrl());
		
		Thread.sleep(2000);
		
		Set<String> obj=D.getWindowHandles();
		
		Iterator<String> E1=obj.iterator();
		
		String parent_window=E1.next();
		
		String child_window=E1.next();
		
		Thread.sleep(1000);
		
		D.switchTo().window(child_window);
		
		System.out.println(D.getCurrentUrl());
		
		Thread.sleep(2000);
		
		D.findElement(By.xpath("(//a[@href='https://www.udemy.com/user/testing-minds/'])[1]")).click();
		
		Thread.sleep(2000);
		
		D.switchTo().window(parent_window);
		
		System.out.println(D.getCurrentUrl());
		
		D.quit();
		
	}

}