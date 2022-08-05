package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Manager.PageObjectManager;
import Pages.Page_homePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_homePage {
		
	public PageObjectManager pom;
	private Page_homePage hp;
	public String url = "https://www.worldometers.info";
	public String driverPath = "C://Users//Dell//Desktop//Selenium//chromedriver.exe";
	
	public static WebDriver driver;
	
	@Given("I naviagte to worldometer home page")
	public void i_naviagte_to_worldometer_home_page() {
	   
		System.setProperty("webdriver.chrome.driver",driverPath);
		driver = new ChromeDriver();
		
			driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}

	@Given("I click  on world population link")
	public void i_click_on_world_population_link() {
		driver.findElement(By.xpath("(//a[@href='/world-population/'])[1]")).click();
		
		
	//	driver.findElement(By.xpath("//div[@class='ns-jmm5r-e-14 button-common close-button']")).click();
		
	}

	@Then("System displays worlds population")
	public void system_displays_worlds_population() {
        String crt = driver.findElement(By.xpath("//div[@class='maincounter-number']")).getText();

		
		System.out.println(crt);
	}

	@Given("I want to write a step with {string}")
	public void i_want_to_write_a_step_with(String string) {
		pom = new PageObjectManager();		
		hp = pom.getHomePage();
		hp.homePageTest();
		System.out.println(string);
	}

	@When("I check for the {int} in step")
	public void i_check_for_the_in_step(Integer int1) {
		System.out.println(int1);
	}

	@Then("I verify the {string} in step")
	public void i_verify_the_in_step(String string) {
		System.out.println(string);
	}


}
