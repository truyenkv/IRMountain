package IRMountain.pages;

import java.util.concurrent.TimeUnit;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class PortalServiceDetailScreen extends PageObject {

	//@FindBy(xpath="//*[contains(text(),'Order New Service')]")
	WebElementFacade order_new_service;
	
	WebElementFacade reportingEmail;
	public void Click_On_Order_button() {
		
		//withTimeoutOf(60, TimeUnit.SECONDS).waitFor(NEW_TODO_INPUT_FIELD);
		//withTimeoutOf(60, TimeUnit.SECONDS).waitFor(order_new_service);
		//waitABit(5000);
		order_new_service.waitUntilClickable().click();
	}
	

}
