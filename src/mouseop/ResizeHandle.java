package mouseop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizeHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\.cache\\selenium\\chromedriver\\win64\\116.0.5845.96\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/resizable/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		Actions action = new Actions(driver);
		WebElement resize = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		action.clickAndHold(resize).build().perform();
		Thread.sleep(2000);
		action.moveToElement(resize, 60, 70).build().perform();
//		action.moveByOffset(200, 300);
		Thread.sleep(2000);
		action.release().build().perform();
		
		Thread.sleep(2000);
		driver.close();

	}

}
