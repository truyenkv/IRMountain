package IRMountain;

import IRMountain.pages.LoginScreen;
import IRMountain.steps.LoginSteps;
import net.thucydides.core.annotations.Steps;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;

public class IronMain {
	
	@Steps
	LoginSteps loginSt;
	@Given("^Login page Portal page")
	public void login_page_Portal_page() {
		loginSt.accessUrl();	    
	}

	@Given("^Login by Manager account with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void login_by_Manager_account_with_and(String username, String password) {
	    loginSt.input_username(username);
	    loginSt.input_password(password);
	}

	@Given("^Click on Login button$")
	public void click_on_Login_button(){
	    loginSt.click_On_Loginbtn();
	}
}
