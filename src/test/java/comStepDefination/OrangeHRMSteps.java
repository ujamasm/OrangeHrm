package comStepDefination;

import com.BaseLayer.BaseClass;
import com.PageLayer.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHRMSteps extends BaseClass {

	LoginPage l1=new LoginPage();
	
	@Given("user should be on login page")
	public void user_should_be_on_login_page() {
		
		BaseClass.Initialization();
		l1.ValidateHomePage();
	}

	@When("Enter the valid credentials")
	public void enter_the_valid_credentials() {
		
		l1.LoginFunctionality();
	}

	@Then("homepage will open")
	public void homepage_will_open() {
		
		l1.ValidateLogin();
	}

}
