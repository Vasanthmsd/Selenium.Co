package Selenium_Practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Programme {
	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.get("http://www.greenstechnologys.com/");

driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

WebElement course = driver.findElement(By.xpath("//a[text()='COURSES']"));

Actions a = new Actions(driver);

a.moveToElement(course).build().perform();


	
	}
}
