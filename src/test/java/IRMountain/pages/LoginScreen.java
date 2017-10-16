package IRMountain.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginScreen extends PageObject{
/*----------Portal site-------*/
	@FindBy(name="email")
	WebElementFacade userTxt;
	@FindBy(name="password")
	WebElementFacade passTxt;
	@FindBy(xpath="//*[contains(text(),'Show Full Catalog')]")
	WebElementFacade showCatalog;
	
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
	
	public void click_ShowCatalog()
	{
		showCatalog.click();
	}
/*----------Admin Site-------*/
	

}
