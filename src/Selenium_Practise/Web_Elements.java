package Selenium_Practise;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Elements {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Selenium.com\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("vasanth196");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("pass");
		Thread.sleep(2000);
		
		WebElement findElement = driver.findElement(By.name("login"));
		findElement.click();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File Destination = new File("C:\\Users\\admin\\eclipse-workspace\\Selenium.com\\Snap\\vasa.png");
		FileUtils.copyFile(source, Destination);
		driver.quit();
		
		
		
		
	}

}
