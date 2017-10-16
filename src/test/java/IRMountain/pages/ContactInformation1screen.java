package IRMountain.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ContactInformation1screen extends PageObject{

	WebElementFacade reportingEmail;
	public void Enter_Email(String email) {
		typeInto(reportingEmail, email);
	}
	public void Click_On_Assign_button() {
		
		
	}
	
}
