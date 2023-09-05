// DragAndDrop
package selenium;

import java.awt.Desktop.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\.cache\\selenium\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver D1 = new ChromeDriver();
		D1.manage().window().maximize();
		D1.get("https://jqueryui.com/droppable/");
		Thread.sleep(3000);
		D1.switchTo().frame(0);
		Thread.sleep(3000);
		WebElement e = D1.findElement(By.xpath("//div[@id='draggable']"));
		Thread.sleep(3000);
		WebElement e1 = D1.findElement(By.xpath("//div[@id='droppable']"));
		Thread.sleep(3000);
		Actions a = new Actions(D1);
		Thread.sleep(3000);
		//a.clickAndHold(e).moveToElement(e1).release().build().perform();
       a.dragAndDrop(e, e1).build().perform();
       D1.close();
	}
}
