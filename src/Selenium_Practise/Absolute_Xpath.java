package Selenium_Practise;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Xpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "https://www.flipkart.com/search?q=vivo%20v17&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebElement vivo = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div/div/a/div[1]/div[1]/div/div/img"));
		vivo.click();
	}

}
