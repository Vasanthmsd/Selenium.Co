package Real_Time;

import org.openqa.selenium.WebDriver;

import BaseCass.Base_Class;
import net.bytebuddy.dynamic.loading.ByteArrayClassLoader.ChildFirst;

public class Main_Project extends Base_Class{
 public static WebDriver driver;
	public static void main(String[] args) throws Throwable {
		driver = getdriver("chrome");
		geturl("http://automationpractice.com/index.php");
		

		sleep(3000);
		Home_Page home = new Home_Page(driver);
		ClickonElement(home.getLogin_btn());
		
		Regestration_page reg = new Regestration_page(driver);
		inputvalueElement(reg.getAccount(),"mrsrange@gmail.com");
		ClickonElement(reg.getCreate_btn());
		
		sleep(3000);
		
		Form_Page form = new Form_Page(driver);
		actionsmethod(form.getGender(), "click");
		inputvalueElement(form.getFirstname(), "vas");
		inputvalueElement(form.getLastname(),"msd" );
		inputvalueElement(form.getPass(), "Vasa4069");
		dropdown(form.getDays(), "byindex", "25");
		dropdown(form.getYear(), "byvalue", "1995");
		dropdown(form.getMonth(), "byindex", "5");
		ClickonElement(form.getRadio());
		ClickonElement(form.getOffer_box());
		inputvalueElement(form.getAddress_name(), "main road dubai");
		inputvalueElement(form.getAddress_last(), "dubai kuruku sandhu");
		inputvalueElement(form.getCompany(), "mine");
		inputvalueElement(form.getStaddress(), "hyd");
		inputvalueElement(form.getMainaddress(), "chennai");
		inputvalueElement(form.getCity(), "chennai2");
		dropdown(form.getState(), "byvisibletext", "Alaska");
		
		
		
		
		
		
		
		
		

		
	}

}
