package Selenium_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Element {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		WebElement id = driver.findElement(By.id("email"));
		boolean selected = id.isSelected();
		System.out.println("selected");
		id.sendKeys("vasanth@gmail.com");
		
		id.clear();
		id.sendKeys("vasanth5033@gmail.com");
		
		String attribute = id.getAttribute("value");
		System.out.println(attribute);
		
		String attribute2 = id.getAttribute("id");
		System.out.println(attribute2);
		
		boolean displayed = id.isDisplayed();
		System.out.println(displayed);
		
		WebElement txt = driver.findElement(By.xpath("//a[text()='Create a Page']"));
		String text = txt.getText();
		System.out.println(txt);
		
		WebElement btn = driver.findElement(By.xpath("//a[@role='button']"));
		btn.click();
		
		Thread.sleep(3000);
		WebElement gender = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		gender.click();
		
		boolean selected2 = gender.isSelected();
		System.out.println(selected2);
	}

}
