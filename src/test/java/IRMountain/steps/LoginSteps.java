package IRMountain.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import IRMountain.pages.LoginScreen;

public class LoginSteps extends ScenarioSteps{
	LoginScreen logScr;
	
	@Step
	public void accessUrl(String url) {	
		logScr.openAt(url);
	}
	
	@Step
	public void input_username(String username) {
		logScr.input_user(username);
	}
	
	@Step
	public void input_password(String password) {
		logScr.input_pass(password);
		
	}

	public void click_On_Loginbtn() {
		logScr.click_Loginbtn();
		
	}
	

	
}
