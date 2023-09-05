package mouseop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropOp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\.cache\\selenium\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String URL = "https://demoqa.com/droppable/";

		driver.get(URL);

		// It is always advisable to Maximize the window before performing DragNDrop
		// action
		driver.manage().window().maximize();

		// Actions class method to drag and drop
		Actions builder = new Actions(driver);

		WebElement from = driver.findElement(By.id("draggable"));

		WebElement to = driver.findElement(By.id("droppable"));
//		//Perform drag and drop
//		builder.dragAndDropBy(from, 100,200).perform();
//		
//		//verify text changed in to 'Drop here' box 
//		String textTo = to.getText();

		// Here, getting x and y offset to drop source object on target object location
		// First, get x and y offset for from object
		int xOffset1 = from.getLocation().getX();

		int yOffset1 = from.getLocation().getY();

		System.out.println("xOffset1--->" + xOffset1 + " yOffset1--->" + yOffset1);

		// Secondly, get x and y offset for to object
		int xOffset = to.getLocation().getX();

		int yOffset = to.getLocation().getY();

		System.out.println("xOffset--->" + xOffset + " yOffset--->" + yOffset);

		// Find the xOffset and yOffset difference to find x and y offset needed in
		// which from object required to dragged and dropped
		xOffset = (xOffset - xOffset1) + 10;
		yOffset = (yOffset - yOffset1) + 20;

		Thread.sleep(2000);
		// Perform dragAndDropBy
		builder.dragAndDropBy(from, xOffset, yOffset).perform();

		// verify text changed in to 'Drop here' box
		// Get text value of 'to' element
		String textTo = to.getText();

		if (textTo.equals("Dropped!")) {
			System.out.println("PASS: Source is dropped to target as expected");
		} else {
			System.out.println("FAIL: Source couldn't be dropped to target as expected");
		}

		Thread.sleep(2000);

		driver.close();

	}

}