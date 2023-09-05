//KeyBoardOperation
package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardOperation {
public static void main(String[] args) throws InterruptedException {
	WebDriver D=new ChromeDriver();
D.manage().window().maximize();
D.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
Thread.sleep(3000);
WebElement Firstname=D.findElement(By.xpath("//input[@name='firstname']"));
WebElement Lastname=D.findElement(By.xpath("//input[@name='lastname']"));
Thread.sleep(3000);
Firstname.sendKeys("Ramesh");
Thread.sleep(3000);
Firstname.sendKeys(Keys.CONTROL+"a");
Thread.sleep(3000);
Firstname.sendKeys(Keys.CONTROL+"c");
Thread.sleep(3000);
Firstname.sendKeys(Keys.TAB);
Thread.sleep(3000);
Lastname.sendKeys(Keys.CONTROL +"v");
Thread.sleep(3000);
Lastname.sendKeys(Keys.BACK_SPACE);
Thread.sleep(3000);
Lastname.sendKeys(Keys.BACK_SPACE);
Thread.sleep(3000);
Lastname.sendKeys(Keys.BACK_SPACE);
Thread.sleep(3000);
Lastname.sendKeys(Keys.ARROW_LEFT);
Thread.sleep(3000);
Lastname.sendKeys(Keys.ARROW_LEFT);
Thread.sleep(3000);
Lastname.sendKeys(Keys.ARROW_RIGHT);
Thread.sleep(3000);
Lastname.sendKeys(Keys.ARROW_RIGHT);
Thread.sleep(3000);
Firstname.sendKeys(Keys.CONTROL+"a");
Lastname.sendKeys(Keys.DELETE);
Thread.sleep(1000);
D.close();

}

}
