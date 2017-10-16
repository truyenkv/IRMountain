package IRMountain.pages;

import org.openqa.selenium.Keys;



import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class PortalServiceCatalogScreen extends PageObject{

	@FindBy(xpath="//input[@type='text' and @class='form-control']")
	WebElementFacade seachForm;
	public void enter_key(String keyword) {
		typeInto(seachForm, keyword);		
	}
	public void press(Keys enter) {
		seachForm.sendKeys(Keys.ENTER);
	}

	

}
