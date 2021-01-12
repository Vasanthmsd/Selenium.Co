package Real_Time;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Regestration_page {
	public static WebDriver driver;
	
	public Regestration_page(WebDriver driver2) {
		this.driver = driver2;
		
	}

	
	public static WebDriver getDriver() {
		return driver;
	}


	public WebElement getAccount() {
		return Account;
	}


	@FindBy(id ="email_create")
	private WebElement Account;
	
	public WebElement getCreate_btn() {
		return create_btn;
	}


	@FindBy(id ="SubmitCreate")
	private WebElement create_btn;
	
	
	
	

}
