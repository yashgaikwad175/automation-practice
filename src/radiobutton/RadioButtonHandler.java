package radiobutton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class RadioButtonHandler {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\.cache\\selenium\\chromedriver\\win64\\116.0.5845.96\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		//identifying male element
		WebElement e = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[4]/div/form/table/tbody/tr[3]/td[2]/input[1]"));
		
		//identifying female element
		WebElement e1 = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[4]/div/form/table/tbody/tr[3]/td[2]/input[2]"));
		
		Thread.sleep(3000);
		
//		//operations on male
//		e.click(); //click on male
//		System.out.println(e.isDisplayed()); //check dispkayed or not
//		System.out.println(e.isEnabled()); //check enabled or not 
//		System.out.println(e.isSelected()); //check selected or not
//		System.out.println(e.getText()); //print text name
//		
//		Thread.sleep(3000);
//		
//		//operations on female
//		e1.click(); //click on female option
//		System.out.println(e1.isDisplayed()); //check dispkayed or not
//		System.out.println(e1.isEnabled()); //check enabled or not
//		System.out.println(e1.isSelected()); //check selected or not
//		System.out.println(e.getText()); //print text name
		
		//operations on male
		System.out.println(e.isDisplayed()); //check dispkayed or not
		System.out.println(e.isEnabled()); //check enabled or not
		System.out.println(e.isSelected()); //check selected or not
		boolean selectState = e.isSelected();
		
		//performing click operation only if element is not selected
		if(selectState == false) {
			e.click();
		}
		
		Thread.sleep(3000);

		//operations on female
		System.out.println(e1.isDisplayed()); //check dispkayed or not
		System.out.println(e1.isEnabled()); //check enabled or not
		System.out.println(e1.isSelected()); //check selected or not
		boolean selectState1 = e1.isSelected();
		
		//performing click operation only if element is not selected
		if(selectState1 == false) {
			e1.click();
		}

		Thread.sleep(3000);
		driver.close();
	}

}
