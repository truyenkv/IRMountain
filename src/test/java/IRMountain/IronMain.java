package IRMountain;

import IRMountain.pages.LoginScreen;
import IRMountain.steps.LoginSteps;
import net.thucydides.core.annotations.Steps;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;

public class IronMain {
	
	@Steps
	LoginSteps loginSt;
	
	@Given("^Open \"([^\"]*)\"$")
	public void open(String url) {
		loginSt.accessUrl(url);
	}

	@Given("^Login site by \"([^\"]*)\" and \"([^\"]*)\" account\\.$")
	public void login_site_by_and_account(String username, String password) throws Throwable {
		 loginSt.input_username(username);
		 loginSt.input_password(password);
	}
	@Given("^Click on Login button$")
	public void click_on_Login_button(){
	    loginSt.click_On_Loginbtn();
	}

}
