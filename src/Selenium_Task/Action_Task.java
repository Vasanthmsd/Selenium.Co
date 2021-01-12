package Selenium_Task;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Task {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		WebElement giftcard = driver.findElement(By.xpath("//a[text()='Gift Cards']"));
		Actions a = new Actions(driver);
		a.contextClick(giftcard).build().perform();

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);

		WebElement bestseller = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
		a.contextClick(bestseller).build().perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);

		WebElement seller = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		a.contextClick(seller).build().perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);

		Set<String> all_id = driver.getWindowHandles();
		for (String id : all_id) {
			String title = driver.switchTo().window(id).getTitle();
			System.out.println(title);

		}
		String actual_Title = "Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";
        for (String id : all_id) {
        	if (driver.switchTo().window(id).getTitle().equals(actual_Title)) {
        		break;
				
			}
			
		}
			
		}
	}


