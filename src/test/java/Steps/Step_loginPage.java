package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Pages.Page_loginPage;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_loginPage {
	
	public Step_pageObjectManager pom;
	public static Page_loginPage lp;
   
    public Step_loginPage(Step_pageObjectManager pom) {
		this.pom = pom;		
		lp = pom.getLoginPage();
    }
	
	
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
		System.out.println("print......I want to write a step with precondition");

	}
	
	@Given("some other precondition")
	public void some_other_precondition() {
		lp.loginPageTest();

	}
	@When("I complete action")
	public void i_complete_action() {
		
		lp.loginPageTest();

	}
	@When("some other action")
	public void some_other_action() {
		lp.birthThisYear();

	}
	@When("yet another action")
	public void yet_another_action() {
	
	}
	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {

	}
	@Then("check more outcomes")
	public void check_more_outcomes() {
		
		System.out.println("print......check more outcomes");

	}

	@Then("print {string}")
	public void print(String string) {
		System.out.println(string);
	}



}
