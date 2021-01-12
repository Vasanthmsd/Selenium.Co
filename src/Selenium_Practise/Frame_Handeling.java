package Selenium_Practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Handeling {

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", 
			System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://demo.automationtesting.in/Frames.html");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.switchTo().frame("singleframe");
	
	WebElement txtbox = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	txtbox.sendKeys("single");
	
	driver.switchTo().defaultContent();
	
	WebElement multipleclick = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
	multipleclick.click();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	WebElement outerframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
	driver.switchTo().frame(outerframe);
	
	WebElement innerframe = driver.findElement(By.xpath("SingleFrame.html"));
	driver.switchTo().frame(innerframe);
	
	WebElement txt2 = driver.findElement(By.xpath("//input[@type='text']"));
	txt2.sendKeys("multiple");
	
	driver.switchTo().parentFrame();
	driver.switchTo().defaultContent();
	
	WebElement video = driver.findElement(By.xpath("//a[text()='Video']"));
	video.click();
}
}
	