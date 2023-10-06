package object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Testscanario.TestMethods;

public class Googlesearch extends TestMethods{
	
	WebDriver driver;
	
	public Googlesearch(WebDriver driver) {
		this.driver = driver;
	}
	
	By searchbox = By.xpath("(//textarea)[1]");
	By search_btn = By.xpath("(//input[@value='Google Search'])[1]");
	
	
	public void searchgoogle(String Searchinput) {
		try { 
			Thread.sleep(2000);
			driver.findElement(searchbox).sendKeys(Searchinput);
			Thread.sleep(2000);
			driver.findElement(search_btn).click();
		}catch(Exception e) {
			System.out.println("Exceptions Caught" + e.getMessage());
		}
	}
	

}