package IRMountain.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.JavascriptExecutor;

public class PortalServiceDetailScreen extends PageObject {

	WebElementFacade order_new_service;
	//@FindBy(xpath="//img[@src='/assets/images/icons/new-service.png']")
	//WebElementFacade order_New_Service;
	
	WebElementFacade reportingEmail;
	public void Click_On_Order_button() {
		//waitABit(10000);
		order_new_service.click();
	}
	

}
