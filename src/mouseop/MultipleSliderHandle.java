package mouseop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleSliderHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\.cache\\selenium\\chromedriver\\win64\\116.0.5845.96\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/#colorpicker");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		
		WebElement slider1 = driver.findElement(By.xpath("//*[@id=\"red\"]/span"));
		WebElement slider2 = driver.findElement(By.xpath("//*[@id=\"green\"]/span"));
		WebElement slider3 = driver.findElement(By.xpath("//*[@id=\"blue\"]/span"));
		
		Actions action = new Actions(driver);
//		action.clickAndHold(slider1).moveByOffset(-110, 0).release().build().perform();
//		Thread.sleep(2000);
//		action.clickAndHold(slider2).moveByOffset(-40, 0).release().build().perform();
//		Thread.sleep(2000);
//		action.clickAndHold(slider3).moveByOffset(50, 0).release().build().perform();
		
		action.dragAndDropBy(slider1, -120, 0).build().perform();
		Thread.sleep(2000);
		System.out.println("Slide Action performed for slider1.");
		action.dragAndDropBy(slider2, -60, 0).build().perform();
		Thread.sleep(2000);
		System.out.println("Slide Action performed for slider2.");
		action.dragAndDropBy(slider3, 70, 0).build().perform();
		System.out.println("Slide Action performed for slider3.");
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
