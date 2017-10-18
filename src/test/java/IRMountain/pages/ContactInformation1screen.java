package IRMountain.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ContactInformation1screen extends PageObject{

	WebElementFacade reportingEmail;
	
	@FindBy(xpath="//button[contains(text(),'Next')]")
	WebElementFacade nextBtn;

	public void enter_Invoicing_Reporting(String email) {
		typeInto(reportingEmail, email);		
	}

	public void click_On_Next_button() {
		nextBtn.click();
	}
	
	
}
