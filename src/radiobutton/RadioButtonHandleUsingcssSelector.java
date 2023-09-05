package radiobutton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonHandleUsingcssSelector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\.cache\\selenium\\chromedriver\\win64\\116.0.5845.96\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement radio1 = driver.findElement(By.cssSelector("input[value='radio1']"));
		boolean isDisplayed = radio1.isDisplayed();
		if(isDisplayed == true)
		{
			radio1.click();
		}
		System.out.println("Radio1 is displayed or not " +  isDisplayed);
		
		Thread.sleep(2000);
		
		WebElement radio2 = driver.findElement(By.cssSelector("input[value='radio2']"));
		boolean isEnabled = radio2.isEnabled();
		
		if(isEnabled == true)
		{
			radio2.click();
			System.out.println("Radio2 is enabled or not " + isEnabled);
		}
		
		Thread.sleep(2000);
		
		WebElement radio3 = driver.findElement(By.cssSelector("input[value='radio3']"));
		boolean isSelected = radio3.isSelected();
		
		if(isSelected == false)
		{
			radio3.click();
		}
		
		System.out.println("Radio3 is selected or not " + isSelected);
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
