package Selenium_Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\Selenium.com\\Driver\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.manage().window().maximize();
		
		
		
		
	}

}
