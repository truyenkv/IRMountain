package IRMountain.steps;

import IRMountain.pages.ContactInformation1screen;
import net.thucydides.core.steps.ScenarioSteps;

public class PortalServiceOrderStep extends ScenarioSteps{

	ContactInformation1screen contactIf1;
	public void Enter_Invoicing_And_Report(String email) {
		contactIf1.Enter_Email(email);
		contactIf1.Click_On_Assign_button();
	}

}
