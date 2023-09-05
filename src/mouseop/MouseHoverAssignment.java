package mouseop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\.cache\\selenium\\chromedriver\\win64\\116.0.5845.96\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.unipune.ac.in/");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		WebElement about_the_university = driver.findElement(By.xpath("//span[@id='stUI5_txt']"));
		WebElement academics = driver.findElement(By.xpath("//span[@id='stUI42_txt']"));
		WebElement research = driver.findElement(By.xpath("//span[@id='stUI185_txt']"));
		WebElement administration = driver.findElement(By.xpath("//span[@id='stUI195_txt']"));
		WebElement bod = driver.findElement(By.xpath("//span[@id='stUI216_txt']"));
		WebElement students_corner = driver.findElement(By.xpath("//span[@id='stUI230_txt']"));
		WebElement useful_links = driver.findElement(By.xpath("//span[@id='stUI254_txt']"));
		WebElement elearning = driver.findElement(By.xpath("//span[@id='stUI278_txt']"));

		Actions action = new Actions(driver);

		action.moveToElement(about_the_university).build().perform();
		Thread.sleep(2000);
		System.out.println(about_the_university.getText());
		action.moveToElement(academics).build().perform();
		Thread.sleep(2000);
		System.out.println(academics.getText());
		action.moveToElement(research).build().perform();
		Thread.sleep(2000);
		System.out.println(research.getText());
		action.moveToElement(administration).build().perform();
		Thread.sleep(2000);
		System.out.println(administration.getText());
		action.moveToElement(bod).build().perform();
		Thread.sleep(2000);
		System.out.println(bod.getText());
		action.moveToElement(students_corner).build().perform();
		Thread.sleep(2000);
		System.out.println(students_corner.getText());
		action.moveToElement(useful_links).build().perform();
		Thread.sleep(2000);
		System.out.println(useful_links.getText());
		action.moveToElement(elearning).build().perform();
		Thread.sleep(2000);
		System.out.println(elearning.getText());

		WebElement ebooks = driver.findElement(By.xpath("//span[@id='stUI280_txt']"));
		ebooks.click();

		Thread.sleep(2000);

		driver.quit();

	}

}
