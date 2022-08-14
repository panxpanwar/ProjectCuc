package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_homePage {
	
	private WebDriver driver;
	
	public Page_homePage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void homePageTest() {
		System.out.println("Home Page Test...........");
		 String crt = driver.findElement(By.xpath("//div[@class='maincounter-number']")).getText();			
			System.out.println("Home Page Data........"+crt);
	
	}
	
	public void todaysBirth() {
		String crt = driver.findElement(By.xpath("//span[@class='rts-counter'][@rel='births_today']")).getText();			
		System.out.println("Today's Birth........"+crt);
		
		
	}

}
