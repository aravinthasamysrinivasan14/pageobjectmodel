package object;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Facebooksearch {
	
	WebDriver driver;
	
	public Facebooksearch(WebDriver driver) {
		this.driver = driver;
	}
	By Fbpage = By.xpath("//h3[text()='Facebook - log in or sign up']");
	By Username_editbox = By.id("email");
	By password_editbox = By.id("pass");
	By Login_btn = By.name("login");
	
	public void EnterUsername() {
		
		driver.findElement(Fbpage).click();
		driver.findElement(password_editbox).clear();
		driver.findElement(Username_editbox).sendKeys("Testuser");
	
	}
	
	public void EnterPassword() {
		driver.findElement(password_editbox).clear();
		driver.findElement(password_editbox).sendKeys("Tester123");
	
	}
	
	public void VerifyLogin() throws InterruptedException {
		driver.findElement(Login_btn).click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		assertEquals(title, "Log in ");
	
	}
	

}
