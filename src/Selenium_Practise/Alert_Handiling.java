package Selenium_Practise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Handiling {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();

		WebElement element = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		element.click();

		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();

		driver.switchTo().defaultContent();

		System.out.println("simple");

		WebElement ok_btn = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		ok_btn.click();

		Thread.sleep(3000);

	WebElement confirm = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
	confirm.click();
	
	Thread.sleep(3000);
	
	Alert alert2 = driver.switchTo().alert();
	alert2.accept();
	
	driver.switchTo().defaultContent();
	
	WebElement send = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
	send.click();
	
	WebElement key = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
	key.click();
	
	Thread.sleep(2000);
	Alert promptalert = driver.switchTo().alert();
	String text = promptalert.getText();
	System.out.println(text);
	
	Thread.sleep(2000);
	
	promptalert.accept();
	
	driver.switchTo().defaultContent();
	System.out.println("prompt completed");
	}

}
