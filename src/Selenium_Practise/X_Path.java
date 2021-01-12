package Selenium_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_Path {
	public static void main(String[] args) {
		System.getProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Selenium.com\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement user = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		user.sendKeys("vavvav@gmail.com");

		WebElement password = driver.findElement(By.xpath("//input[contains(@class='inputtext')][1]"));
		password.sendKeys("tydgv6768");

		WebElement txt = driver.findElement(By.xpath("//div[text()='Create a new account']"));
		String text = txt.getText();
		System.out.println(text);

		WebElement txt2 = driver.findElement(By.xpath("//div[contains(text(),'Create')]"));
		String text2 = txt2.getText();
		System.out.println(text2);
		WebElement text3 = driver.findElement(By.xpath("//select[contains(@name,'birthda')][1]"));
		String text4 = text3.getText();
		System.out.println(text3);
	}

}
