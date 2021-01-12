package Selenium_Task;

import BaseCass.Base_Class;

public class Base_Practise  extends Base_Class{
	
	public static void main(String[] args) {
		
		getdriver("chrome");
		
		geturl("https://www.facebook.com/");
		currenturl();
		
	}

}
