package Selenium_Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_Launch {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\eclipse-workspace\\Selenium.com\\Driver\\geckodriver.exe" );
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.getCurrentUrl();
		driver.getTitle();
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
	
		driver.navigate().forward();
		driver.navigate().refresh();
	}

}
