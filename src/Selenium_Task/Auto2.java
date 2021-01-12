package Selenium_Task;

import java.io.File;
import java.io.IOException;
import java.time.zone.ZoneOffsetTransitionRule.TimeDefinition;
import java.util.concurrent.TimeUnit;

import javax.activation.FileDataSource;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Auto2 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

		driver.manage().window().maximize();

		WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		email.sendKeys("vasanth@gmail.com");

		WebElement pswrd = driver.findElement(By.xpath("//input[@type='password']"));
		pswrd.sendKeys("vasa4069");

		WebElement submit = driver.findElement(By.xpath("//button[@name='SubmitLogin']"));
		submit.click();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement shirt = driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
		shirt.click();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		WebElement dress = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img"));
		dress.click();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		WebElement quantity = driver.findElement(By.xpath("//input[@class='text']"));
		quantity.clear();
		quantity.sendKeys("3");

		WebElement size = driver.findElement(By.xpath("//select[@name='group_1']"));
		Select s3 = new Select(size);
		s3.selectByIndex(2);

		WebElement colour = driver.findElement(By.xpath("//a[@name='Blue']"));
		colour.click();

		WebElement cart = driver.findElement(By.xpath("//span[text()='Add to cart']"));
		cart.click();

		Thread.sleep(3000);
		WebElement proceed = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		proceed.click();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement checkout = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		checkout.click();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement againcheck = driver.findElement(By.xpath("//button[@name='processAddress']"));
		againcheck.click();

		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

		WebElement box = driver.findElement(By.xpath("//input[@type='checkbox']"));
		box.click();

		WebElement process = driver.findElement(By.xpath("//button[@name='processCarrier']"));
		process.click();

		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

		WebElement down = driver.findElement(By.xpath("//span[text()=' Payment']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", down);

		WebElement payment = driver.findElement(By.xpath("//a[@class='bankwire']"));
		payment.click();

		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

		WebElement confrimorder = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		confrimorder.click();

		driver.manage().timeouts().implicitlyWait(24, TimeUnit.SECONDS);

		WebElement backtoorder = driver.findElement(By.xpath("//a[@title='Back to orders']"));
		backtoorder.click();

		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

		WebElement home = driver.findElement(By.xpath("(//a[@class='btn btn-default button button-small'])[7]"));
		home.click();

		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		women.click();

		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

		WebElement tops = driver.findElement(By.xpath("(//a[@class='subcategory-name'])[1]"));
		tops.click();

		WebElement elements = driver.findElement(By.xpath("//img[@alt='Blouse']"));
		Actions a = new Actions(driver);
		a.moveToElement(elements).build().perform();

		Thread.sleep(3000);

		WebElement view = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[2]"));
		view.click();

		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

		WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));

		driver.switchTo().frame(frame1);

		WebElement plus = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		plus.click();

		WebElement sizze = driver.findElement(By.id("group_1"));
		Select s6 = new Select(sizze);
		s6.selectByValue("2");

		WebElement colour2 = driver.findElement(By.xpath("//a[@name='White']"));
		colour2.click();

		WebElement wishlist = driver.findElement(By.id("wishlist_button"));
		wishlist.click();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement cancel = driver.findElement(By.xpath("//a[@title='Close']"));
		cancel.click();

		WebElement addcart = driver.findElement(By.xpath("(//p[@class='buttons_bottom_block no-print'])[1]"));
		addcart.click();

		Thread.sleep(3000);
		
		WebElement checkout2 = driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']"));
		checkout2.click();

		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

		WebElement chevkout3 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		chevkout3.click();

		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

		WebElement chckout3 = driver.findElement(By.xpath("//button[@name='processAddress']"));
		chckout3.click();

		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

		WebElement boox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		boox.click();

		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

		WebElement proceedto = driver.findElement(By.xpath("//button[@name='processCarrier']"));
		proceedto.click();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

		WebElement checkb = driver.findElement(By.xpath("//a[@class='cheque']"));
		checkb.click();

		WebElement finalone = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		finalone.click();

		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

		WebElement movement = driver.findElement(By.xpath("//a[@title='Back to orders']"));
		a.moveToElement(movement);

		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

		File Destination = new File("C:\\Users\\admin\\eclipse-workspace\\Selenium.com\\Snap7.jpg");

		FileUtils.copyFile(source, Destination);

	}

}
