package Selenium_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Dropdown {
	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();

		WebElement click_btn = driver.findElement(By.xpath("//a[contains(@class,'_42ft _4jy0 _6lti _4jy6 _4jy2 se')]"));
		click_btn.click();
		Thread.sleep(3000);
		
		WebElement date = driver.findElement(By.xpath("//select[@title='Day']"));
		Select s = new Select(date);
		s.selectByIndex(28);
		
		WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
		Select s1 = new Select(month);
		s1.selectByVisibleText("may");
		
		WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));
		Select s2 = new Select(year);
		s2.selectByValue("14");
	}

}
