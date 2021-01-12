package Real_Time;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Form_Page {
	
	public static WebDriver driver;
	
	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getPass() {
		return pass;
	}

	@FindBy(id = "id_gender1")
	private WebElement gender;
	
	@FindBy(id = "customer_firstname")
	private WebElement firstname;
	
	@FindBy(id =  "customer_lastname")
	private WebElement lastname;
	
	@FindBy(id="passwd")
	private WebElement pass;
	
	@FindBy(id="days")
	private WebElement days;
	
	@FindBy(id="months")
	private WebElement month;
	
	@FindBy(id="years")
	private WebElement year;
	
	@FindBy(id="newsletter")
	private WebElement radio;
	
	public WebElement getRadio() {
		return radio;
	}

	public WebElement getOffer_box() {
		return offer_box;
	}

	@FindBy(id = "optin")
	private WebElement offer_box;
	
	@FindBy(xpath = "(//input[@class='form-control'])[1]")
	private WebElement address_name;
	
	@FindBy(xpath="(//input[@class='form-control'])[2]")
	private WebElement address_last;
	
	@FindBy(id="company")
	private WebElement company;
	
	@FindBy(id="address1")
	private WebElement staddress;
	
	@FindBy(id="address2")
	private WebElement mainaddress;
	
	@FindBy(id="city")
	private WebElement city;
	
	@FindBy(id="id_state")
	private WebElement state;
	
	@FindBy(id="postcode")
	private WebElement postcode;
	
	@FindBy(id="other")
	private WebElement additional;
	
	
	
	
	

	public WebElement getPostcode() {
		return postcode;
	}

	public void setPostcode(WebElement postcode) {
		this.postcode = postcode;
	}

	public WebElement getAdditional() {
		return additional;
	}

	public void setAdditional(WebElement additional) {
		this.additional = additional;
	}

	public WebElement getState() {
		return state;
	}

	public void setState(WebElement state) {
		this.state = state;
	}

	public WebElement getAddress_name() {
		return address_name;
	}

	public void setAddress_name(WebElement address_name) {
		this.address_name = address_name;
	}

	public WebElement getAddress_last() {
		return address_last;
	}

	public void setAddress_last(WebElement address_last) {
		this.address_last = address_last;
	}

	public WebElement getCompany() {
		return company;
	}

	public void setCompany(WebElement company) {
		this.company = company;
	}

	public WebElement getStaddress() {
		return staddress;
	}

	public void setStaddress(WebElement staddress) {
		this.staddress = staddress;
	}

	public WebElement getMainaddress() {
		return mainaddress;
	}

	public void setMainaddress(WebElement mainaddress) {
		this.mainaddress = mainaddress;
	}

	public WebElement getCity() {
		return city;
	}

	public void setCity(WebElement city) {
		this.city = city;
	}

	public WebElement getDays() {
		return days;
	}

	public void setDays(WebElement days) {
		this.days = days;
	}

	public WebElement getMonth() {
		return month;
	}

	public void setMonth(WebElement month) {
		this.month = month;
	}

	public WebElement getYear() {
		return year;
	}

	public void setYear(WebElement year) {
		this.year = year;
	}

	public WebElement getFirstname() {
		return firstname;
		
	}

	public Form_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getGender() {
		return gender;
	}

}
