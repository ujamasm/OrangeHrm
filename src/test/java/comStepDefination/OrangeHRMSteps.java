package comStepDefination;

import com.BaseLayer.BaseClass;
import com.PageLayer.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHRMSteps extends BaseClass {

	LoginPage lp;
	
	@Given("user should be on login page")
	public void user_should_be_on_login_page() {
		BaseClass.Initialization();
		lp = new LoginPage();
		lp.ValidateHomePage();
	}

	@When("Enter the valid credentials")
	public void enter_the_valid_credentials() {
		
		lp.LoginFunctionality();
	}

	@Then("homepage will open")
	public void homepage_will_open() {
		
		lp.ValidateLogin();
	}

}
