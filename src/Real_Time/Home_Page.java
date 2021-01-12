package Real_Time;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "//a[@class='login']")
	private WebElement login_btn;

	public Home_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getLogin_btn() {
		return login_btn;
	}

}
