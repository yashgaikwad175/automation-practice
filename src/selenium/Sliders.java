package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Sliders {

		public static void main(String[] args) throws InterruptedException {
			WebDriver D2=new ChromeDriver();
			D2.manage().window().maximize();
		
			D2.get("https://jqueryui.com/Slider/");
			Thread.sleep(3000);
			D2.switchTo().frame(0);
			Thread.sleep(3000);
			WebElement e=D2.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
			Thread.sleep(3000);
			Actions q=new Actions(D2);
			Thread.sleep(3000);
			q.clickAndHold(e).moveToElement(e, 100, 0).release().build().perform();
			Thread.sleep(3000);
			D2.quit();
	}
	}


