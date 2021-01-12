package Selenium_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id_Attribute {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user+dir") + "Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		username.sendKeys("abc@gmail");

		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("fffvf");

		
	}

}
