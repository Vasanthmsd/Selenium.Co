package Selenium_Task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automation_Task {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		WebElement click = driver.findElement(By.xpath("//a[@class='login']"));
		click.click();
		
		Thread.sleep(3000);
		WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		email.sendKeys("vasanth@gmail.com");
		
		WebElement create = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		create.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		WebElement touch = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		touch.click();
		
		WebElement first = driver.findElement(By.xpath("//input[@name='customer_firstname']"));
		first.sendKeys("vas");
		
		WebElement last = driver.findElement(By.xpath("//input[@name='customer_lastname']"));
		last.sendKeys("msd");
		
		WebElement pswrd = driver.findElement(By.xpath("//input[@name='passwd']"));
		pswrd.sendKeys("vasa4069");
		
		WebElement date = driver.findElement(By.xpath("//select[@name='days']"));
		Select s = new Select(date);
		s.selectByIndex(10);
		
		WebElement month = driver.findElement(By.xpath("//select[@name='months']"));
		Select s1 = new Select(month);
		s1.selectByIndex(4);
		
		WebElement years = driver.findElement(By.xpath("//select[@name='years']"));
		Select s2 = new Select(years);
		s2.selectByIndex(15);
		
		WebElement click2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		click2.click();
		
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys("vasanth");
		
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		lastname.sendKeys("kumar");
		
		WebElement company = driver.findElement(By.xpath("//input[@name='company']"));
		company.sendKeys("vasa");
		
		WebElement adddress = driver.findElement(By.xpath("//input[@name='address1']"));
		adddress.sendKeys("nagari 517592");
		
		WebElement address = driver.findElement(By.xpath("//input[@name='address2']"));
		address.sendKeys("ekm post");
		
		WebElement city = driver.findElement(By.xpath("//input[@name='city']"));
		city.sendKeys("nagari");
		
		WebElement state = driver.findElement(By.xpath("//select[@name='id_state']"));
		Select s4 = new Select(state);
		s4.selectByIndex(25);
		
		WebElement postcode = driver.findElement(By.xpath("//input[@name='postcode']"));
		postcode.sendKeys("51759");
		
		WebElement home = driver.findElement(By.xpath("//input[@name='phone']"));
		home.sendKeys("784567895");
		
		WebElement phone = driver.findElement(By.xpath("//input[@name='phone_mobile']"));
		phone.sendKeys("2589865");
		
		WebElement adress = driver.findElement(By.xpath("//input[@name='alias']"));
		adress.sendKeys("nagari, nagari");
		
		WebElement regiester = driver.findElement(By.xpath("//span[text()='Register']"));
		regiester.click();
		
		
		
		
		
		
		
	}

}
