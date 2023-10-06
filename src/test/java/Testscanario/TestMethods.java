package Testscanario;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import object.Facebooksearch;
import object.Googlesearch;
import object.Search_page;

public class TestMethods {
	WebDriver driver;
	public String baseurl = "https://www.google.com";
	
	@BeforeTest
	public void beforetest() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.get(baseurl);
		
		
	}
	
	@Test(priority=0)
	public void searchOpertaion() throws InterruptedException {
		
	/*	
	Googlesearch page = new Googlesearch(driver);
	page.searchgoogle("facebook");
	*/
	
	Search_page pagefactory = new Search_page();
	pagefactory.SearchGoogle("facebook");
	
	}
	
	@Test(priority=1)
	public void VerifyandAccessFacebook(String Searchinput) {
		Googlesearch objectrepo = new Googlesearch(driver);
		objectrepo.searchgoogle(Searchinput);
	}
	
	@Test(priority=2)
	public void VerifyLogin() throws InterruptedException {
		Facebooksearch page = new Facebooksearch(driver);
		page.EnterUsername();
		page.EnterPassword();
		page.VerifyLogin();
	}

//	@AfterTest
//	public void aftertest() {
//		driver.quit();
//	}
}
