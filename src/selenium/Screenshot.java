package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
	WebDriver D=new ChromeDriver();
	D.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
	Thread.sleep(2000);
	// full screenshot
	File src=((TakesScreenshot)D).getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(src,new File("G:\\YASH\\test.png"));
		Thread.sleep(2000);
	      //partial screenshot
		 WebElement e=D.findElement(By.xpath("//*[@id=\"mainContent\"]/div[4]/div/form/table/tbody/tr[4]/td[1]/strong"));
		File src1=e.getScreenshotAs(OutputType.FILE);
		Thread.sleep(2000);
		FileUtils.copyFile(src1, new File("G:\\YASH\\tseing.jpeg"));
		Thread.sleep(2000);
		 WebElement e1=D.findElement(By.xpath("//div[@class='col-sm-12 col-md-8 col-xl-6 rounded-3 tutorial-content']"));
		File src2=e1.getScreenshotAs(OutputType.FILE);
		Thread.sleep(2000);
		FileUtils.copyFile(src2, new File("G:\\YASH\\test22.jpeg"));
		Thread.sleep(2000);
		
		D.close();
	}

	

}


