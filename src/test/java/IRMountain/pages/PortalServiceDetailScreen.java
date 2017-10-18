package IRMountain.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class PortalServiceDetailScreen extends PageObject {

	WebElementFacade order_new_service;
	WebElementFacade reportingEmail;
	public void Click_On_Order_button() {
		waitForAllTextToAppear("ORDER NEW SERVICE");
		order_new_service.click();	
	}
	

}
