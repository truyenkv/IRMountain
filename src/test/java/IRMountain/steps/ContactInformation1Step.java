package IRMountain.steps;

import IRMountain.pages.ContactInformation1screen;
import net.thucydides.core.steps.ScenarioSteps;

public class ContactInformation1Step extends ScenarioSteps {
	ContactInformation1screen contactInfor1;
	public void Enter_Contact_Information_Page1(String email) {
		contactInfor1.enter_Invoicing_Reporting(email);
	}
	public void Next_Screen() {
		contactInfor1.click_On_Next_button();	
	}
}
