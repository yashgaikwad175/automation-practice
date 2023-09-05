package mouseop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropOperations {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\.cache\\selenium\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");

		// Maximizing window
		driver.manage().window().maximize();

		// sleep for 3 seconds
		Thread.sleep(3000);

		driver.switchTo().frame(0);

		Thread.sleep(2000);

		Actions action = new Actions(driver);

		WebElement sourceEl = driver.findElement(By.xpath("//div[@id='draggable']"));

		WebElement targetEl = driver.findElement(By.xpath("//div[@id='droppable']"));

//		action.clickAndHold(sourceEl).build().perform();
//		Thread.sleep(2000);
//		action.moveToElement(targetEl).build().perform();
//		Thread.sleep(2000);
//		action.release(targetEl).build().perform();
//		Thread.sleep(2000);

		action.clickAndHold(sourceEl).moveToElement(targetEl).release(targetEl).build().perform();

		// verify text changed in to 'Drop here' box
		String textTo = targetEl.getText();

		if (textTo.equals("Dropped!")) {
			System.out.println("PASS: Source is dropped to target as expected");
		} else {
			System.out.println("FAIL: Source couldn't be dropped to target as expected");
		}

		Thread.sleep(2000);

		driver.close();
	}

}
