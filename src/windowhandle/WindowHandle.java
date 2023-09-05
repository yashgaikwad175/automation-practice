package windowhandle;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\.cache\\selenium\\chromedriver\\win64\\116.0.5845.96\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement open_win = driver.findElement(By.xpath("//button[@id='openwindow']")); 
		open_win.click();
		
		System.out.println(driver.getCurrentUrl());
		
		// It will return the parent window name as a String
		String parent=driver.getWindowHandle();

		Set<String>s=driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1= s.iterator();
		
		String parent_window = I1.next();
		
		String child_window = I1.next();
		
		Thread.sleep(2000);
		
		driver.switchTo().window(child_window);
		
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.xpath("(//a[@href='about.html'])[1]")).click();
		
		Thread.sleep(2000);
		driver.close();
//		while(I1.hasNext())
//		{
//
//		String child_window=I1.next();
//
//
//		if(!parent.equals(child_window))
//		{
//		driver.switchTo().window(child_window);
//
//		System.out.println(driver.switchTo().window(child_window).getTitle());
//
//		driver.close();
//		}
//
//		}
		//switch to the parent window
		driver.switchTo().window(parent);
		
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(2000);
		driver.close();
	}

}
