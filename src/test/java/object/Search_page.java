package object;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_page {
	WebDriver driver;
	
	public void search_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//textarea)[1]")public WebElement Searchbox;
	@FindBy(xpath = "//input[@value='Google Search'])[1]")public WebElement Search_btn;
	@FindBy(xpath = "//h3[text()='Facebook - log in or sign up") public WebElement Fbpage;
	
	public void SearchGoogle(String Searchinput ) {
		try {
			Searchbox.sendKeys(Searchinput);
			Search_btn.click();	
		}
		catch (Exception e) {
			System.out.println("Exception Caught" + e.getMessage());
		}
	}

}
