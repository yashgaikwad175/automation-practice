package mouseop;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverOperations {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\.cache\\selenium\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println("Launched the browser");

		// Maximizing window
		driver.manage().window().maximize();
		System.out.println("Maximized the window");

		// sleep for 3 seconds
		Thread.sleep(3000);

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("scroll(100,1000)");
		System.out.println("Scrolled scrollar to down");

		Actions action = new Actions(driver);

		WebElement mouse_hover = driver.findElement(By.xpath("//button[@id='mousehover']"));

		action.moveToElement(mouse_hover).build().perform();
		System.out.println("Hovered on button");

		Thread.sleep(2000);

		WebElement top = driver.findElement(By.xpath("//a[normalize-space()='Top']"));
		top.click();
		System.out.println("Moved to top");

		Thread.sleep(3000);

		driver.close();

	}

}
