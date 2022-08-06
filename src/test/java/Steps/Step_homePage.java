package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Page_homePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_homePage {
		
	public Step_pageObjectManager pom;
	private Page_homePage hp;
	
	   

	@Given("I naviagte to worldometer home page")
	public void i_naviagte_to_worldometer_home_page() {
		pom = new Step_pageObjectManager();	

		}

	@Given("I click  on world population link")
	public void i_click_on_world_population_link() {
		
		hp = pom.getHomePage();
		hp.homePageTest();
	
	}


	@Then("System displays worlds population")
	public void system_displays_worlds_population() {

	}

	@Given("I want to write a step with {string}")
	public void i_want_to_write_a_step_with(String string) {

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
