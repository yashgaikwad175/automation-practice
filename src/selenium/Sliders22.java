package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sliders22 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver D2=new ChromeDriver();
		D2.manage().window().maximize();
	
		D2.get("https://jqueryui.com/slider/#colorpicker");
		Thread.sleep(3000);
		D2.switchTo().frame(0);
		Thread.sleep(3000);
		
		WebElement e=D2.findElement(By.xpath("//div[@id='red']"));
		Thread.sleep(3000);
		
		WebElement e1=D2.findElement(By.xpath("//div[@id='green']"));
		Thread.sleep(3000);
		
		
		WebElement e2=D2.findElement(By.xpath("//div[@id='blue']"));
		Thread.sleep(3000);
		Actions q=new Actions(D2);
		Thread.sleep(3000);
		q.clickAndHold(e).moveToElement(e, -100, 0).release().build().perform();
		Thread.sleep(3000);
		q.clickAndHold(e1).moveToElement(e1, -80, 0).release().build().perform();
		Thread.sleep(3000);
		q.clickAndHold(e2).moveToElement(e2, -60, 0).release().build().perform();
		Thread.sleep(3000);
		D2.quit();
}

}
