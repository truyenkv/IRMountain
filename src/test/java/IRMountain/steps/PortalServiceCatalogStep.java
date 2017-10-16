package IRMountain.steps;

import org.openqa.selenium.Keys;

import net.thucydides.core.steps.ScenarioSteps;
import IRMountain.pages.PortalServiceCatalogScreen;

public class PortalServiceCatalogStep extends ScenarioSteps{

	PortalServiceCatalogScreen catalogScr;
	public void enter_keyword(String keyword) {
		catalogScr.enter_key(keyword);
		catalogScr.press(Keys.ENTER);
	}
	public void click_On_Service() {
		catalogScr.clickOnServiceName();
		
	}
	
	
}
