package Selenium_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolu_Xpath {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Selenium.com\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.manage().deleteAllCookies();
		driver.getCurrentUrl();
		driver.navigate().refresh();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().forward();
		driver.navigate().back();

		WebElement login = driver.findElement(By.xpath("//input[@name='email']"));
		login.sendKeys("anyemain@gsg");

		WebElement logina = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy'][1]"));
		logina.click();

		WebElement txt = driver.findElement(By.xpath("//a[text()='Create a Page']"));
		String text = txt.getText();
		System.out.println(text);

		WebElement nothing = driver.findElement(By.xpath("//img[contains(@src,'https://static')]"));
		nothing.click();

		WebElement img = driver.findElement(
				By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[1]/div[4]/div[1]/div/div/a[1]/img"));
		img.click();
	}

}
