package IRMountain.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.JavascriptExecutor;

public class PortalServiceDetailScreen extends PageObject {

	WebElementFacade order_new_service;
	
	WebElementFacade reportingEmail;
	public void Click_On_Order_button() {
		((JavascriptExecutor)getDriver()).executeScript("argument[0].scrollIntoView(true);", order_new_service);
		order_new_service.waitUntilClickable().click();
	}
	

}
