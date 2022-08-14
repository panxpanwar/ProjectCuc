package Steps;


import Pages.Page_homePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_homePage {
		
	public Step_pageObjectManager pom;
	private Page_homePage hp;
	
	public Step_homePage(Step_pageObjectManager pom) {
		this.pom = pom;	
		hp = pom.getHomePage();			
	}
	   

	@Given("I naviagte to worldometer home page")
	public void i_naviagte_to_worldometer_home_page() {
      System.out.println("Excel Data.....  "+pom.getExcelData().getExcelData("Sheet1", 0, 0));

		}

	@Given("I click  on world population link")
	public void i_click_on_world_population_link() {		
			
		hp.homePageTest();
	}


	@Then("System displays worlds population")
	public void system_displays_worlds_population() {
		hp.todaysBirth();
		pom.myScreenCap("todayBirth");

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
