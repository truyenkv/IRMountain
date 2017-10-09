package IRMountain.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginScreen extends PageObject{

	@FindBy(id="")
	WebElementFacade userTxt;
	@FindBy(id="")
	WebElementFacade passTxt;
	WebElementFacade loginBtn;
	
	public void input_user(String username) {
		typeInto(userTxt, username);
	}

	public void input_pass(String password) {
		typeInto(passTxt, password);		
	}

	public void click_Loginbtn() {
		loginBtn.click();
		
	}
	
	

}
