package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Page_homePage;
import Pages.Page_loginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Step_pageObjectManager {
	private Page_homePage hp;
	private Page_loginPage lp;
	public static WebDriver driver;
	public String driverPath = "C://Users//Dell//Desktop//Selenium//chromedriver.exe";	
	public String url = "https://www.worldometers.info/world-population/";
	
	@Before
	public void  openBrowser() {
		
		System.setProperty("webdriver.chrome.driver",driverPath);
		driver = new ChromeDriver();		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
	}
	
	
	@After
	public void closeBrowser() {
		driver.close();
	}
	
	public Page_homePage getHomePage() {
		if (hp==null) {
		hp = new Page_homePage(driver);}		
		return hp;
	}

	
	public Page_loginPage getLoginPage() {
		if (lp==null) {
		lp = new Page_loginPage(driver);}
		return lp;
	}
	


}
