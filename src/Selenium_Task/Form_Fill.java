package Selenium_Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Form_Fill {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en");
		driver.manage().window().maximize();

		Thread.sleep(3000);
		WebElement view = driver.findElement(By.xpath("//select[@name='dcdrLocation']"));
		Select s = new Select(view);
		s.selectByIndex(7);

		WebElement name = driver.findElement(By.xpath("//input[@name='givenName']"));
		name.sendKeys("suresh");
		WebElement surname = driver.findElement(By.xpath("//input[@name='surname']"));
		surname.sendKeys("chandar");
		WebElement dob = driver.findElement(By.xpath("//img[contains(@class,'ui-datepic')]"));
		dob.click();
		
		WebElement date = driver.findElement(By.className("data-handler"));
		Select r = new Select(date);
		
		r.selectByVisibleText("21");
		
		
		
		
		WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select v = new Select(month);
		v.selectByIndex(4);

		WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select v1 = new Select(year);
		v1.selectByVisibleText("1995");

		WebElement click = driver.findElement(By.xpath("//input[@value='no']"));
		click.click();
		WebElement login = driver.findElement(By.xpath("//input[@name='loginId']"));
		login.sendKeys("vasanth786");
		WebElement check = driver.findElement(By.xpath("//a[@title='Check Availability']"));
		check.click();
		Thread.sleep(3000);
		WebElement password = driver.findElement(By.xpath("//input[@name='loginId']"));
		password.sendKeys("vasanth@5033");
		WebElement pss = driver.findElement(By.xpath("//a[@title='Password Policy']"));
		pss.click();
		Thread.sleep(3000);
		WebElement cccc = driver.findElement(By.xpath("//input[@name='confirmPwd']"));
		cccc.sendKeys("Vasa5041@");
		WebElement hint = driver.findElement(By.xpath("(//select[@class='dropdown-box'])[2]"));
		Select v3 = new Select(hint);
		v3.selectByValue("Favourite Food");
		WebElement ans = driver
				.findElement(By.xpath("//input[contains(@title,'Hint Answer will be required for password')]"));
		ans.sendKeys("chicken");

		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("kvasanth301@gmail");

	}

}
