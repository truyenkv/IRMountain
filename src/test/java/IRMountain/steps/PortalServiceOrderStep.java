package IRMountain.steps;

import IRMountain.pages.ContactInformation1screen;
import net.thucydides.core.steps.ScenarioSteps;

public class PortalServiceOrderStep extends ScenarioSteps{

	ContactInformation1screen contactIf1;
	public void Enter_Contact_Information_Page1(String email) {
		contactIf1.enter_Invoicing_Reporting(email);
	}
	public void Next_Screen() {
		contactIf1.click_On_Next_button();	
	}

}
