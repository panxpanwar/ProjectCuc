package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_loginPage {
	
	private static WebDriver driver;
	
	public Page_loginPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void loginPageTest() {
		System.out.println("Login Page Test...........");
		
		 String crt = driver.findElement(By.xpath("//div[@class='maincounter-number']")).getText();			
			System.out.println("Login Page Data........"+crt);
	}


}
