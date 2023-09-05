package selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\.cache\\selenium\\chromedriver\\win64\\116.0.5845.96\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//navigate you on particular page
		driver.get("https://www.facebook.com");
		
		//stop for some time
		Thread.sleep(3000);
		
		//maximize the window
		driver.manage().window().maximize();
		
		//getting current url
		String s = driver.getCurrentUrl();
		System.out.println(s);
		
		//to get title of current webpage
//		System.out.println(driver.getTitle());
		String s1 = driver.getTitle();
		System.out.println(s1);
		
		//stop for some time
		Thread.sleep(3000);
		
		//navigate from one page to another
		driver.navigate().to("https://www.youtube.com");
		
		//get the current page url on console window
		String str = driver.getCurrentUrl();
		System.out.println(str);
		
		//get the title of webapage on console window
		String str1 = driver.getTitle();
		System.out.println(str1);
		
		//stop for some time
		Thread.sleep(3000);
		
		//navigate from current webpage to previous page
		driver.navigate().back();
		
		//stop for some time
		Thread.sleep(3000);
		
		//navigate from current webpage to next page
		driver.navigate().forward();
		
		//stop for some time
		Thread.sleep(3000);
		
		//refresh current webpage
		driver.navigate().refresh();
		
		//stop for some time
		Thread.sleep(3000);
		
		//close urrent window
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}

}
