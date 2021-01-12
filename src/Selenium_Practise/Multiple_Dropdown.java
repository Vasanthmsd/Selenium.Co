package Selenium_Practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Dropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		WebElement multidrop = driver.findElement(By.xpath("//select[@multiple='multiple']"));
		Select s = new Select(multidrop);
		
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		List<WebElement> options = s.getOptions();
		int size = options.size();
		System.out.println("size"+size);
		for (int i = 0; i < size; i++) {
			if (i==1 || i==3 || i==5) {
				s.selectByIndex(i);
				
			}
			
		}
	}

}
